package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//q9
public class BottomUpBFS {
	public static void main(String[] args) {
		Tree root = new Tree();
		root.createOfSize(17);
		// root.display();
	
		bottomUpBFS(root.root);

	}

	// display in reverse of bfs in one line
	
	// display the tree from bottom up left to right level wise
	public static void bottomUpBFS(TreeNode root) {
		Stack<ArrayList<TreeNode>> levels = new Stack<ArrayList<TreeNode>>();
		ArrayList<TreeNode> perLevel = new ArrayList<TreeNode>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.offer(null);
		while (!q.isEmpty()) {
			TreeNode n = q.poll();
			if (n == null) {
				if (q.peek() == null) {
					levels.push(perLevel);
					break;// all nodes done
				} else {
					// one level finished
					q.offer(null);
					levels.push(perLevel);
					System.out.println("level changed");
					perLevel = new ArrayList<TreeNode>();
					continue;
				}
			}
			perLevel.add(n);
			if (n.left != null)
				q.offer(n.left);
			if (n.right != null)
				q.offer(n.right);
		}

		// print from the bottom queue will give the bottom level first
		while (!levels.isEmpty()) {
			ArrayList<TreeNode> l = levels.pop();
			for (TreeNode treeNode : l) {
				System.out.print(treeNode.value + " ");
			}
			System.out.println();
		}
	}
}
