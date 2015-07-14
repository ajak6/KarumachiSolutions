package heaps;

public interface MaxHeapInterface {
	/**

	* Insert a new key into a heap

	* @param key key to be inserted

	* @return boolean to check whether it was added or not

	*/
	boolean insert(double key);
	/**

	* remove the highest priority key (maximum for max heap)

	* @return removed key

	*/
	double removeMax();
}
