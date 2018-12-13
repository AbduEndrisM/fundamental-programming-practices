package lesson8.linkedlist;

public class TestNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First node
		Node first = new Node(null,10,null);
		System.out.println(first.data);
		
		//Second node
		Node n1 = new Node(first, 20, null);
		first.next=n1;
		System.out.println(n1.data);	

	
		//Add node x between first and n1

		Node x = new Node(first, 30, n1);
		first.next=x;
		n1.prev=x;
		System.out.println(x.data);
		
		//next.next - prev.prev
		
		System.out.println(n1.prev.prev.data);//first -10
		System.out.println(first.next.next.data);//n1 - 20
		
		//sum of the linked list data
		int sum=0;
		for (Node i= first; i!=null; i=i.next)
		{
		sum=sum+i.data;	
		}
		System.out.println("Sum+ " + sum);
		
		
	}

}
