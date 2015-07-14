package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MaxHeap implements MaxHeapInterface {
	double a[];
	int size;

	public MaxHeap(int capacity) {
		a = new double[capacity];
		size = 0;
	}

	public boolean insert(double value) {
		a[size++] = value;
		percolateUp(size);
		return true;
	}

	private void percolateUp(int size) {

		// find parent AND check the value
		while (size >= 1) {
			int parentIndex = (size - 1) / 2;
			if (a[parentIndex] < a[size]) {
				a[parentIndex] = a[size] + a[parentIndex];
				a[size] = a[parentIndex] - a[size];
				a[parentIndex] = a[parentIndex] - a[size];
			} else {
				break;
			}
		}
	}

	@Override
	public double removeMax() {
		return 0;
	}

	public static void main(String[] args) {
		MaxHeap g = new MaxHeap(6);
		g.insert(1);
		g.insert(3);
		g.insert(7);
		g.insert(19);
		System.out.println(Arrays.toString(g.a));
	}
}
