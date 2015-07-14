package trees;

public class TotalCombinations {
	public static void main(String[] args) {
		int n = 6;
		int dp[] = new int[n + 1];
		dp[0] = 0;
//		dp[1] = 1;
//		dp[2] = 2;
//		dp[3] = 3;
		int vals []= { 2, 3 };
		dp[0]=1;
		dp[1]=1;
		for (int i = 0; i < vals.length; ++i) {
			for (int j = vals[i]; j <= n; ++j) {
				dp[j] += dp[j - vals[i]];
			}
		}
		System.out.println(dp[6]);
	}
}
