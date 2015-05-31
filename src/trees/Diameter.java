package trees;

public class Diameter {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.createOfSize(100);
		getDiameter(t.root,0);
		System.out.println(diameter);
	}

	public static int diameter = 0;

	public static int getDiameter(TreeNode root, int height) {
		if (root == null) {
			return 0;
		}
		int left = getDiameter(root.left, diameter);
		int right = getDiameter(root.right, diameter);
		if(left+right>=diameter){
			diameter=left+right+1;
		}
		return Math.max(left, right)+1;
	}
}
