package trees;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.createOfSize(102);
		// tree.display();
		// BottomUpBFS.bottomUpBFS(tree.root);
		System.out.println(findHeight(tree.root));
	}

	// recursively
	private static int findHeight(TreeNode root) {
		if (root == null)
			return 0;
		int left = findHeight(root.left);
		int right = findHeight(root.right);
		return Math.max(left, right) + 1;
	}

	// iteratively
	public static int findHeightIt(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		q.offer(null);
		int height = 0;
		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			if (n == null) {
				if (q.peek() == null) {
					height++;
					break;
				} else {
					q.offer(null);
				}
				height++;
				continue;
			}
			if (n.left != null) {
				q.offer(n.left);
			}
			if (n.right != null) {
				q.offer(n.right);
			}
		}
		return height;
	}
}
