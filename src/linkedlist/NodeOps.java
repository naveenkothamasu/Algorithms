package linkedlist;

public class NodeOps {

	public static void addNode(Node head, int data){
		
		Node newNode = new Node(data);
		newNode.next = null;
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}
	
	public static Node removeNode(Node head){
		Node next = head.next;
		head.next = null;
		return next;
	}
	public static void print(Node head){
		
		Node current = head;
		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		Node head = new Node(0);
		for(int i=1; i<9; i++){
			addNode(head, i);
		}
		print(head);
		head = removeNode(head);
		print(head);
	}
}
