package trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	public TreeNode root;

	public Tree() {
	}

	public Tree(int value) {
		root = new TreeNode(value);
	}

	// generate an example tree
	public void createOfSize(int v) {
		int i = 1;
		while (i <= v) {
			insert(i++);
		}
	}

	public void display() {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root == null)
			return;
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			System.out.println(n.value);
			if (n.left != null) {
				q.offer(n.left);
			}
			if (n.right != null) {
				q.offer(n.right);
			}
		}
	}

	public static void display(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		if (root == null)
			return;
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			System.out.println(n.value);
			if (n.left != null) {
				q.offer(n.left);
			}
			if (n.right != null) {
				q.offer(n.right);
			}
		}
	}

	/**
	 * insert a new element into the tree
	 *
	 * @param key
	 *            key of the element
	 * @param value
	 *            value of the element
	 */
	public void insert(int value) {
		if (root == null) {
			root = new TreeNode(value);
			return;
		}
		insertHelper(value, root);
	}

	// helper method for insertion
	private void insertHelper(int value, TreeNode root2) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root2);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			if (node.left == null) {
				node.left = new TreeNode(value);
				break;
			} else {
				q.offer(node.left);
			}
			if (node.right == null) {
				node.right = new TreeNode(value);
				break;
			} else {
				q.offer(node.right);
			}
		}

	}

	public void delete(TreeNode node) {

	}
}
