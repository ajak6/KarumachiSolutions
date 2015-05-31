package trees;

public class PathSumExists {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.createOfSize(4);
		System.out.println(findPathSum(t.root,5));
	}

	public static boolean findPathSum(TreeNode root, int sum)

	{
		if (root == null)
			return false;
		if (isLeafNode(root) && sum - root.value == 0) {
			return true;
		}
		if (sum > root.value) {
			return findPathSum(root.left, sum - root.value)
					|| findPathSum(root.right, sum - root.value);
		}
		return false;
	}

	public static boolean isLeafNode(TreeNode n) {
		if (n == null)
			return false;
		if (n.left == null && n.right == null)
			return true;
		else
			return false;
	}
}
