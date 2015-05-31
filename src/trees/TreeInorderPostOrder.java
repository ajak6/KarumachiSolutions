package trees;

public class TreeInorderPostOrder {
	static int postIndex;

	public static void main(String[] args) {
		int in[] = { 8, 4, 2, 5, 1, 6, 3, 7 };
		int post[] = { 8, 4, 5, 2, 6, 7, 3, 1 };
		postIndex = post.length - 1;
		TreeNode b = buildTree(null, in, post, 0, in.length - 1);
		BottomUpBFS.bottomUpBFS(b);
	}

	private static TreeNode buildTree(TreeNode root, int[] in, int[] post,
			int inStart, int inEnd) {
		if (post.length <= postIndex)
			return null;
		root = new TreeNode(post[postIndex]);
		int i;
		for (i = inStart; i < inEnd; i++) {
			if (in[i] == root.value)
				break;
		}
		if (i + 1 <= inEnd) {
			postIndex--;
			root.right = buildTree(root.right, in, post, i + 1, inEnd);
		}
		if (inStart <= i - 1) {
			postIndex--;
			root.left = buildTree(root.left, in, post, inStart, i - 1);
		}
		return root;
	}
}
