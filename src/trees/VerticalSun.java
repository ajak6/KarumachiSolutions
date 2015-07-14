package trees;

import java.util.HashMap;

public class VerticalSun {
	public static void main(String[] args) {
		Tree t = new Tree();
		t.createOfSize(7);
		findVerticalSum(t.root, 0);
		System.out.println(hs.toString());
	}

	static HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

	public static void findVerticalSum(TreeNode root, int i) {
		if (root == null)
			return;
		if (hs.containsKey(i)) {
			hs.put(i, hs.get(i) + root.value);
		} else {
			hs.put(i, root.value);
		}

		findVerticalSum(root.left, i - 1);
		findVerticalSum(root.right, i + 1);
	}
}
