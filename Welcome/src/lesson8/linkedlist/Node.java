package lesson8.linkedlist;

public class Node {
	
	Integer data;
	Node prev;
	Node next;
	
	
		Node(){
			
		}
		Node ( Node prev,Integer data, Node next){
			
			this.prev=prev;
			this.next=next;
			this.data=data;
		}
}
