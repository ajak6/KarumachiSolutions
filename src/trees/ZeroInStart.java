package trees;

import java.util.Arrays;

public class ZeroInStart {
	public static void main(String[] args) {
		int a[] = { 4, 0, 8, 0, 5, 3, 0 };
		reOrder(a);
		System.out.println(Arrays.toString(a));
	}

	public static void reOrder(int a[]) {
		int i = a.length - 1;
		int j = a.length - 1;
		for (; i >= 0; i--) {
			if (a[i] != 0) {
				a[j] = a[i];
				j--;
			} else
				continue;
		}
		while (j >= 0) {
			a[j--] = 0;
		}
	}
}
