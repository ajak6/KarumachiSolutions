package trees;

public class TreeInorderPreOrder {
	public static void main(String[] args) {
		int in[] = { 8, 4, 2, 5, 1, 6, 3, 7 };
		int pre[] = { 1, 2, 4, 8, 5, 3, 6,7 };
		TreeNode root = buildTree(null, in, pre, 0, in.length - 1, 0);
		BottomUpBFS.bottomUpBFS(root);
	}

	static int preStart = 0;

	private static TreeNode buildTree(TreeNode root, int[] in, int[] pre,
			int inStart, int inEnd, int prStart) {
		if (inStart > inEnd)
			return null;
		if (preStart >= pre.length)
			return null;
		root = new TreeNode(pre[preStart]);
		int i;
		for (i = inStart; i <= inEnd; i++) {
			if (in[i] == root.value)
				break;
		}
		if (i - 1 >= inStart)
			root.left = buildTree(root.left, in, pre, inStart, i - 1,
					++preStart);
		if (i + 1 <= inEnd)
			root.right = buildTree(root.right, in, pre, i + 1, inEnd,
					++preStart);
		return root;
	}

}
