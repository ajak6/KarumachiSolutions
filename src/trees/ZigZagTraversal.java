package trees;

import java.util.Stack;

public class ZigZagTraversal {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.createOfSize(10);
		zigzagTraversal(t.root);

	}

	public static void zigzagTraversal(TreeNode root) {
		Stack<TreeNode> first = new Stack<TreeNode>();
		Stack<TreeNode> second = new Stack<TreeNode>();
		boolean flag = true;
		first.push(root);
		while (!first.isEmpty()) {
			TreeNode r = first.pop();
			System.out.print(r.value);
			if (flag) {
				if (r.left != null)
					second.push(r.left);
				if (r.right != null)
					second.push(r.right);
			} else {
				if (r.right != null)
					second.push(r.right);
				if (r.left != null)
					second.push(r.left);
			}
			if (first.isEmpty()) {
				System.out.println();
				Stack<TreeNode> s = first;
				first = second;
				second = s;
				flag = !flag;
			}

		}

	}
}
