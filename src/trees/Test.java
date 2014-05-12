package trees;

public class Test {

	public static void main(String[] args){
		/*
		for(int i=0; i<10; i++){
			Tree.insert(Tree.root, i);
		}
		*/
		Tree.insert(Tree.root, 3);
		Tree.insert(Tree.root, 123);
		Tree.insert(Tree.root, 1445);
		
		Tree.inorder(Tree.root);
		System.out.println();
		Tree.inorder(Tree.root);
		System.out.println();
		Tree.inorder(Tree.root);
		System.out.println();
	}
}
