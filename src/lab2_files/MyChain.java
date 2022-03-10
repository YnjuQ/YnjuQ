package lab2_files;

public class MyChain extends Chain
{	
	
	public MyChain( int initialCapacity) {
		super(initialCapacity);
	}
	
	public MyChain() {
		this(0);
	}
	
	public Object[] toArray()
	{
		Object[] arr = new Object[size];
		for(int i=0; i<size; i++)
		{
			arr[i]= get(i);
		}
		return arr;
	}
	
	public void addRange(Object[] elements)
	{
		int i = 0;
		if(firstNode == null) {
			i = 1;
			firstNode = new ChainNode(elements[0]);
		}
		ChainNode containNode = firstNode;
		
		while(containNode.next != null)
			containNode = containNode.next;
		
		for(i=i; i<elements.length; i++) {
			containNode.next = new ChainNode(elements[i]);
			containNode = containNode.next;
		}
			
	}
	
	public MyChain union(MyChain chain) {
		
		MyChain unionChain = new MyChain();
		ChainNode contain = firstNode;
		
		while(contain != null) {
			unionChain.add(0, contain.element);
			contain = contain.next;
		}
		
		contain = chain.firstNode;
		
		while(contain != null) {
			if(!isContain(contain.element))
				unionChain.add(0, contain.element);
			contain = contain.next;
		}
		
		return unionChain;
	}
	
	public MyChain intersection(MyChain chain) {
		
		MyChain intersectionChain = new MyChain();
		ChainNode contain = chain.firstNode;
		
		while(contain != null) {
			if(isContain(contain.element))
				intersectionChain.add(0, contain.element);
			contain = contain.next;
		}
		
		return intersectionChain;
		
	}
	
	private boolean isContain(Object element) {
		ChainNode contain = firstNode;
		
		while(contain != null) {
			if(contain.element.equals(element))
				return true;
			
			contain = contain.next;
		}
		return false;
		
	}
}
