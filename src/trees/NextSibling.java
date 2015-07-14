package trees;

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}

public class NextSibling {
	public void connect(TreeLinkNode root) {
		if (root == null)
			return;
		TreeLinkNode nextLevel = root;
		while (nextLevel != null) {
			TreeLinkNode current = new TreeLinkNode(0);
			nextLevel = null;
			while (root != null) {
				if (nextLevel == null) {
					nextLevel = root.left == null ? root.right : root.left;
				}
				if (root.left != null) {
					current.next = root.left;
					current = current.next;
				}
				if (root.right != null) {
					current.next = root.right;
					current = current.next;
				}
				root = root.next;
			}
			root = nextLevel;
		}
	}

}