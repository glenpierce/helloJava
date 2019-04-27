import java.util.Arrays;

public class ArrayReverser {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		array = reverseArray(array);
		System.out.println(Arrays.toString(array));

	}

	public static int[] reverseArray(int[] intArray) {
		int low = 0;
		int high = intArray.length - 1;
		while (low < high) {
			int temp = intArray[low];
			intArray[low] = intArray[high];
			intArray[high] = temp;
			low++;
			high--;
		}
		return intArray;
	}
}
