package trees;

public class MaxPathSum {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.root = new TreeNode(1);
		t.root.left = new TreeNode(2);
//		t.root.right = new TreeNode(0);
//		t.root.right.left = new TreeNode(0);
//		t.root.right.left.right = new TreeNode(8);
//		t.root.right.left.right.right = new TreeNode(1);
		// t.root.right.right = new TreeNode(10);
		int a = maxPathSum(t.root);
		System.out.println(a);
		System.out.println(maxSum);
	}

	static int maxSum = Integer.MIN_VALUE;

	public static int maxPathSum(TreeNode root) {
		if (root == null)
			return 0;
//		System.out.println("hello " +root.right.value);
//maxSum = root.value;
		System.out.println("maxSum " + maxSum);
		max(root);
		return maxSum;
	}

	public static int max(TreeNode root) {

		if (root == null)
			return 0;
		int left = Math.max(max(root.left), 0);
		int right = Math.max(max(root.right), 0);

		maxSum = Math.max(maxSum, root.value + left + right);
		System.out.println(" root " + root.value + " left " + left + " right "
				+ right);
		return root.value + Math.max(left, right);
	}
}
