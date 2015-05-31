package trees;

public class CreateMirrorTree {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.createOfSize(5);
		t.display();
		mirrorTree(t.root);
		System.out.println();
		t.display();
	}

	public static TreeNode mirrorTree(TreeNode root) {
		if (root == null)
			return root;
		TreeNode right = mirrorTree(root.right);
		TreeNode left = mirrorTree(root.left);
		root.left = right;
		root.right = left;
		return root;
	}
}
