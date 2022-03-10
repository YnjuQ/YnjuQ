package lab2_files;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyChain chain = new MyChain();
		Scanner scanner = new Scanner(System.in);
		//fhgfjhjdfjkgkdfjfhkgjdfhsl
		boolean swtch = true;
		
		while(swtch) {
			System.out.println("1. isEmpty()\n"
					+ "2.  size()\n"
					+ "3. get(int index)\n"
					+ "4. indexOf(Object theElement)\n"
					+ "5. remove(int index)\n"
					+ "6. add(int index, Object theElement)\n"
					+ "7. toString()\n"
					+ "8. toArray()\n"
					+ "9. addRange(Object[] elements)\n"
					+ "10. union(MyChain chain)\n"
					+ "11. intersection(MyChain chain)\n"
					+ "12. exit\n");
			
			switch(scanner.nextInt()) {
				case 1: 
					System.out.println(chain.isEmpty() ? "Хоосон жагсаалт!":"Хоосон биш жагсаалт!");
					break;
				case 2:
					System.out.println("Жагсаалтын хэмжээ = "+chain.size());
					break;
				case 3:
					System.out.println("Авах элементийн индексийг оруулна уу!");
					System.out.println(chain.get(scanner.nextInt()));
					break;
				case 4:
					System.out.println("Индексийг нь харах элементийнхээ утгыг оруулна уу!");
					System.out.println(chain.indexOf(scanner.nextInt()));
				    break;
				case 5:
					System.out.println("Устгах элементийн индексийг оруулна уу!");
					System.out.println(chain.remove(scanner.nextInt()));
					break;
				case 6:
					System.out.println("Нэмэх элементийн индексийг оруулна уу!");
					int index = scanner.nextInt();
					System.out.println("Нэмэх элементийн утгыг оруулна уу!");
					chain.add(index, scanner.next());
					break;
				case 7:
					System.out.println("String -рүү хөрвүүлвэл =" +chain.toString());
					break;
				case 8:
					System.out.println("Массив руу хөрвүүлвэл ="+chain.toString());
					break;
				case 9:
					System.out.println("Нэгтгэх жагсаалтын уртыг оруулна уу");
					Object arr[]= new Object[scanner.nextInt()];
					for(int i=0; i<arr.length; i++ ) {
						System.out.println((i+1)+"дэх элементийн утгыг оруулна уу");
						arr[i]= scanner.next();
					}
					chain.addRange(arr);
					System.out.println(chain.toString());
					break;
				case 10:
					System.out.println("Үүсгэх холбоост жагсаалтын уртыг оруулна уу");
					MyChain chain2 = new MyChain();
					int n = scanner.nextInt();
					for(int i=0; i<n; i++) {
						System.out.println((i+1)+" дэх элементийн утгыг оруулна уу");
						chain2.add(0, scanner.next());
					}
					chain2 = chain.union(chain2);
					System.out.println(chain2.toString());
						
					break;
				case 11:
					System.out.println("Үүсгэх холбоост жагсаалтын уртыг оруулна уу");
					MyChain chain3 = new MyChain();
					int k = scanner.nextInt();
					for(int i=0; i<k; i++) {
						System.out.println((i+1)+" дэх элементийн утгыг оруулна уу");
						chain3.add(0, scanner.next());
					}
					chain3 = chain.intersection(chain3);
					System.out.println(chain3.toString());
					break;
				case 12:
					System.out.println("---------------------------------------------------Баяртай--------------------------------------------------------------");
					swtch = false;
					break;
					default:
					System.out.println("Uildel buruu baina!!!");
					}
		
	}
	}
}
