package bfs;

import java.util.Stack;

public class DFS {

	public static void traverse(Node start){
		
		Stack<Node> s = new Stack<Node>();
		s.push(start);
		Node current = null;
		while(!s.isEmpty()){
			current = (Node) s.pop();
			System.out.print(current.getName() + " ");
			current.isVisited = true;
			//push all unvisited current neighbors onto stack
		}
		
	}
}
