package chapter4.graph;

import java.util.ArrayList;

public class GraphNode {
	private int value;
	private ArrayList<GraphNode> subNodes;
	private boolean inUsage, visited;

	public GraphNode(int value) {
		subNodes = new ArrayList<>();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public ArrayList<GraphNode> getSubNodes() {
		return subNodes;
	}

	public void setSubNodes(ArrayList<GraphNode> subNodes) {
		this.subNodes = subNodes;
	}

	public boolean isInUsage() {
		return inUsage;
	}

	public void setInUsage(boolean inUsage) {
		this.inUsage = inUsage;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
