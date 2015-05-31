package trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNode {

	public static void main(String[] args) {
		Tree d = new Tree();
		d.createOfSize(17);
		int v = findDeepest(d.root).value;
		System.out.println(v);
	}
//leftmost child on the lasr level, for right most return the node n no logic needed
	public static TreeNode findDeepest(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(null);
		int height;
		int maxHeight;
		TreeNode deepest = root;
		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			if (n == null) {
				if (q.peek() == null) {
					break;
				} else {
					q.offer(null);
					deepest = q.peek();
					continue;
				}
			}
			if (n.left != null) {
				q.offer(n.left);
			}
			if (n.right != null) {
				q.offer(n.right);
			}
		}
		return deepest;
	}

}
