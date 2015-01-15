package chapter4.graph;

import java.util.ArrayList;

public class Graph {
	private ArrayList<GraphNode> verticles;

	private Graph() {
	}

	public static Graph initGraph() {
		Graph graph = new Graph();
		GraphNode node1 = new GraphNode(1);
		GraphNode node2 = new GraphNode(2);
		GraphNode node3 = new GraphNode(3);
		GraphNode node4 = new GraphNode(4);
		GraphNode node5 = new GraphNode(5);

		node1.getSubNodes().add(node2);
		node1.getSubNodes().add(node3);

		node2.getSubNodes().add(node1);
		node2.getSubNodes().add(node3);

		node3.getSubNodes().add(node2);
		node3.getSubNodes().add(node1);
		node3.getSubNodes().add(node4);
		node3.getSubNodes().add(node5);

		return graph;
	}

	public ArrayList<GraphNode> getVerticles() {
		return verticles;
	}

	public void setVerticles(ArrayList<GraphNode> verticles) {
		this.verticles = verticles;
	}
}
