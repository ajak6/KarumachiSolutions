package trees;

public class StructureIdentical {
	public static void main(String[] args) {

		Tree t1 = new Tree();
//		t1.createOfSize(0);
//		t1.display();
		Tree t2 = new Tree();
		t2.createOfSize(1);
		boolean b = compareStructure(t1.root, t2.root);
		System.out.println(b);
	}

	public static boolean compareStructure(TreeNode root, TreeNode root2) {
		System.out.println(root);
		System.out.println(root2);
		if (root == null && root2 != null)
			return false;
		if (root2 == null && root != null)
			return false;
		if (root2 == null && root == null)
			return true;
		
		boolean left = compareStructure(root.left, root2.left);
		boolean right = compareStructure(root.right, root2.right);
		return left & right;
	}
}
