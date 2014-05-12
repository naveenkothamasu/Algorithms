package trees;

public class Tree {

	static Node root = null;
	
	public static void insert(Node node, int num){
		
		Node newnode = new Node(num);
		Node prev = null;
		boolean left = false;
		while(node != null){
			prev = node;
			if(node.data < num){
				node = node.left;
				left = true;
			}else{
				node = node.right;
				left = false;
			}
		}
		
		if(prev != null){
			if(left == true){
				prev.left = newnode;	
			}else{
				prev.right = newnode;
			}
			
		}else{
			Tree.root = newnode;
		}
	}
	
	public static void inorder(Node node){
		if(node.left != null){
			inorder(node.left);
		}
		System.out.print(" " + node.data + " ");
		if(node.right != null){
			inorder(node.right);
		}
	}
	public static void preorder(Node node){
	
		System.out.print(" " + node.data + " ");
		if(node.left != null){
			preorder(node.left);
		}
		if(node.right != null){
			preorder(node.right);
		}
	}
	public static void postorder(Node node){
		
		if(node.left != null){
			postorder(node.left);
		}
		if(node.right != null){
			postorder(node.right);
		}
		System.out.print(" " + node.data + " ");
	}
}
