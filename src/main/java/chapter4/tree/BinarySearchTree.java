package chapter4.tree;

public class BinarySearchTree<T extends Comparable> {
	private BinarySearchTree left;
	private BinarySearchTree right;
	private T value;

	public BinarySearchTree(T value) {
		this.value = value;
	}

	public BinarySearchTree(BinarySearchTree left, BinarySearchTree right, T value) {
		this.left = left;
		this.right = right;
		this.value = value;
	}


	public void add(T value) {
		//to right
		if (value.compareTo(this.value) > 0) {
			if (this.right == null) {
				BinarySearchTree<T> elem = new BinarySearchTree<T>(value);
				this.right = elem;
			} else {
				this.right.add(value);
			}

		//to left
		} else {
			if (this.left == null) {
				BinarySearchTree<T> elem = new BinarySearchTree<T>(value);
				this.left = elem;
			} else {
				this.left.add(value);
			}
		}
	}

	public String getPreOrderTraverse() {
		StringBuilder result = new StringBuilder();
		preOrderTraverse(result);
		return result.toString();
	}

	//Current - Left - Right
	//PRE-ORDER TRAVERSE
	private void preOrderTraverse(StringBuilder builder) {
		if (this != null) {
			builder.append(this.value + ", ");
			if (this.left != null) {
				this.left.preOrderTraverse(builder);
			}

			if (this.right != null) {
				this.right.preOrderTraverse(builder);
			}
		}
	}


	//IN-ORDER TRAVERSE
	//Left - Current - Right
	public String getInOrderTraverse() {
		StringBuilder result = new StringBuilder();
		inOrderTraverse(result);
		return result.toString();
	}

	private void inOrderTraverse(StringBuilder builder) {
		if (this != null) {
			if (this.left != null) {
				this.left.inOrderTraverse(builder);
			}
			builder.append(this.value + ", ");

			if (this.right != null) {
				this.right.inOrderTraverse(builder);
			}
		}
	}

	//POST-ORDER
	//Left - Right - Current
	public String getPostOrderTraverse() {
		StringBuilder result = new StringBuilder();
		postOrderTraverse(result);
		return result.toString();
	}

	private void postOrderTraverse(StringBuilder builder) {
		if (this != null) {
			if (this.left != null) {
				this.left.postOrderTraverse(builder);
			}

			if (this.right != null) {
				this.right.postOrderTraverse(builder);
			}
			builder.append(this.value + ", ");
		}
	}
}
