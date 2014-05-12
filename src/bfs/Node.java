package bfs;

public class Node {

	public boolean isVisited = false;
	
	private char name;
	private int cost;
	
	public Node next = null;
	
	
	Node(char name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	public char getName(){
		return this.name;
	}
	
	public int getCost(){
		return this.cost;
	}
}
