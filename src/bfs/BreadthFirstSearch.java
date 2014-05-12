package bfs;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Stack;

public class BreadthFirstSearch {

	public static void main(String[] args) {

		Hashtable<Character, LinkedList<Node>> graph = new Hashtable<Character, LinkedList<Node>>();

		LinkedList<Node> head = new LinkedList<Node>();
		head.add(new Node('b', 10));
		head.add(new Node('c', 10));
		graph.put('a', head);
		
		head = new LinkedList<Node>();
		head.add(new Node('a', 10));
		head.add(new Node('d', 10));
		graph.put('b', head);

		head = new LinkedList<Node>();
		head.add(new Node('a', 10));
		head.add(new Node('e', 10));
		head.add(new Node('g', 10));
		graph.put('c', head);
		
		head = new LinkedList<Node>();
		head.add(new Node('b', 10));
		head.add(new Node('e', 10));
		graph.put('d', head);
		
		head = new LinkedList<Node>();
		head.add(new Node('c', 10));
		head.add(new Node('d', 10));
		head.add(new Node('f', 10));
		head.add(new Node('g', 10));
		graph.put('e', head);
		
		head = new LinkedList<Node>();
		head.add(new Node('e', 10));
		graph.put('f', head);
		
		head = new LinkedList<Node>();
		head.add(new Node('c', 10));
		head.add(new Node('e', 10));
		graph.put('g', head);

		for(Entry<Character, LinkedList<Node>> e: graph.entrySet()){
			System.out.print(e.getKey());
			printList(e.getValue());
			System.out.println();
		}
		System.out.println("BFS");
		BFS(graph, 'a');
		System.out.println();
		System.out.println("DFS");
		DFS(graph, 'a');
	}
	
	public static void printList(LinkedList<Node> list){

		Iterator<Node> itr = list.iterator();
		while(itr.hasNext()){
			Node node = itr.next();
			System.out.print(" --> " + node.getName());
		}
	}
	
	public static void BFS(Hashtable<Character, LinkedList<Node>> graph, char startNode){
		
		LinkedList<Character> queue = new LinkedList<Character>();
		Hashtable<Character, Boolean> visited = new Hashtable<Character, Boolean>();
		
		for(Character ch : graph.keySet()){
			visited.put(ch, false);
		}
		
		char current;
		queue.add(startNode);
		while(!queue.isEmpty()){
			current = queue.remove();
			if(visited.get(current) != true){
				System.out.print(current + " ");
				visited.put(current, true);
				for(Node node : graph.get(current)){
					queue.add(node.getName());
				}
			}
			
		}
	}
	
	public static void DFS(Hashtable<Character, LinkedList<Node>> graph, char startNode){
		
		Stack<Character> stack = new Stack<Character>();
		Hashtable<Character, Boolean> visited = new Hashtable<Character, Boolean>();
		
		for(Character ch : graph.keySet()){
			visited.put(ch, false);
		}
		
		char current;
		stack.push(startNode);
		while(!stack.isEmpty()){
			current = stack.pop();
			if(visited.get(current) != true){
				System.out.print(current + " ");
				visited.put(current, true);
				for(Node node : graph.get(current)){
					stack.push(node.getName());
				}
			}
			
		}
	}
}
