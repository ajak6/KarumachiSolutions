package trees;

import java.util.ArrayList;

public class RootToLeafPaths {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.createOfSize(4);
		printRootToLeafs(t.root);

	}

	static ArrayList<Integer> paths = new ArrayList<Integer>();

	public static void printRootToLeafs(TreeNode root) {

		if (root.left == null && root.right == null) {
			paths.add(root.value);
			System.out.println(paths.toString());
			paths.remove(paths.size() - 1);
		}
		paths.add(root.value);
		if (root.left != null)
			printRootToLeafs(root.left);
		if (root.right != null)
			printRootToLeafs(root.right);
		paths.remove(paths.size() - 1);
	}
}
