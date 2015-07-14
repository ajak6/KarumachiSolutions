package trees;

public class NumberofPossibleTrees {
	public static void main(String[] args) {
		int n = 3;
		int result = numberOfTrees(n);
		System.out.println(result);
	}

	public static int numberOfTrees(int n) {
		int dp[] = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		dp[2] = 2;
		for (int k = 3; k <= n; k++) {
			for (int i = 0; i < n; i++) {
				dp[k] = dp[k] + (dp[i] * dp[k - i - 1]);
			}
		}
		return dp[n];
	}
}
