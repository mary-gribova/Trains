package chapter4;

import chapter4.tree.BinarySearchTree;

//
//Binary Trees—”Must Know” Algorithms
//You should be able to easily implement the following algorithms prior to your interview:
//» » In-Order: Traverse left node, current node, then right [usually used for binary search
//trees]
//» » Pre-Order: Traverse current node, then left node, then right node.
//» » Post-Order: Traverse left node, then right node, then current node.
//» » Insert Node: On a binary search tree, we insert a value v, by comparing it to the root. If v
//> root, we go right, and else we go left. We do this until we hit an empty spot in the tree.
//Note: balancing and deletion of binary search trees are rarely asked, but you might
//want to have some idea how they work. It can set you apart from other candidates.
//
//
//Graph Traversal—”Must Know” Algorithms
//You should be able to easily implement the following algorithms prior to your interview:
//» » Depth First Search: DFS involves searching a node and all its children before proceed-
//ing to its siblings.
//» » Breadth First Search: BFS involves searching a node and its siblings before going on
//to any children.
//

public class Main {
	public static void main(String[] args) {
		BinarySearchTree<String> tree = new BinarySearchTree<String>("F");
		tree.add("B");
		tree.add("G");
		tree.add("A");
		tree.add("D");
		tree.add("I");
		tree.add("C");
		tree.add("E");
		tree.add("H");

		System.out.println(tree.getPreOrderTraverse());
		System.out.println(tree.getInOrderTraverse());
		System.out.println(tree.getPostOrderTraverse());
	}
}
