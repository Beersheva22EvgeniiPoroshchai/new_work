import java.util.Arrays;

public class MyArrays {
	/**
	 * 
	 * @param array
	 * @param number
	 * @return new array with added at end a given number
	 */
	public static int[] addsNumber(int[] array, int number) {
		// TODO
		// use standart class Arrays, method copyOf
		int[] res = Arrays.copyOf(array, array.length + 1);
		res[array.length] = number;
		return res;

	}

	/**
	 * 
	 * @param array
	 * @param index
	 * @return new array with no number at given index in a given array if index
	 *         doesn't exist in a given array it returns the same array
	 */

	public static int[] removeNumber(int array[], int index) {
		int newArray[] = new int[array.length - 1];
		if (index > -1 && index < array.length) {
			System.arraycopy(array, 0, newArray, 0, index);
			System.arraycopy(array, index + 1, newArray, index, newArray.length - index);
		} else
			newArray = array;
		return newArray;

	}

	/**
	 * 
	 * @param arraySorted - sorted array
	 * @param number
	 * @return new array with inserted number at an index for keeping array sorted
	 */
	public static int[] insertSorted(int arraySorted[], int number) {
		int index = Arrays.binarySearch(arraySorted, number);
		if (index < 0) {
			index = -(index + 1);
		}
		return insertAtIndex(arraySorted, number, index);

	}

	private static int[] insertAtIndex(int[] array, int number, int index) {
		int res[] = new int[array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);

		return res;

	}

	/**
	 * 
	 * @param arraySorted
	 * @param number
	 * @return index value if number exists otherwise -1 O[N] - search number in
	 *         unsorted array O[LogN] - search number in sorted (binary search)
	 */

	public static int binarySearch(int arraySorted[], int number) {
		int left = 0;
		int right = arraySorted.length - 1;
		int middle = right / 2;
		while (left <= right && arraySorted[middle] != number) {
			if (number < arraySorted[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
			middle = (left + right) / 2;
			return left > right ? -1 : middle;

		}
		return number;

	}

	public static int searchIndSameFirstElem(int arraySorted[], int number) {
		int result =0;
		int left = 0;
		int right = arraySorted.length - 1;
		int middle = binarySearch(arraySorted, number);
		if (left < right) {
			result = middle;
			int countOfSameNumbers = getCountOfIndSameEl(arraySorted, number);

			if (countOfSameNumbers > 1) {

				int indexOfReplace = middle - countOfSameNumbers;

				if (middle < countOfSameNumbers)
					indexOfReplace = 0;

				if (arraySorted[indexOfReplace] == number) {
					result = middle;
				} else {
					for (int i = indexOfReplace + 1; i < middle; i++) {
						if (arraySorted[i] == number) {
							result = i;
							break;
						}
					}
				}

			}

		}
		if (number != arraySorted.length) result = Arrays.binarySearch(arraySorted, number);
		return -(result+1);
	}

	

	

	public static int getCountOfIndSameEl(int[] array, int number) {
		int counter = 0;
		for (int elem : array) {
			if (elem == number) {
				counter++;
			}
		}
		return counter;
	}

	public static boolean isOneSwap(int array[]) {
		int[] tempor = Arrays.copyOf(array, array.length);
		bubbleSort(array);
		int counter = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != tempor[i]) {
				counter++;
			}
		}
		if (counter <= 2) {
			return true;
		}

		return false;
	}

	public static int[] bubbleSort(int[] noSorted) {
	int changeCounter;
	
	
	do {
	changeCounter = 0;
	for (int i =0; i < noSorted.length - 1; i++) {
		if (noSorted[i] > noSorted[i + 1]) {
			int tempor = noSorted[i];
			noSorted[i] = noSorted[i + 1];
			noSorted[i + 1] = tempor;
			changeCounter++;
		}
	}
	} while (changeCounter > 0);
	System.out.println(Arrays.toString(noSorted));
	return noSorted;
	}

	/**
	 * 
	 * @param array of short positive numbers
	 * @param sum
	 * @return true if array contains two numbers, sum of which equls a given sum 
	 */
	
	
	
static public boolean isSum2(short array[], short sum) {
	short difValue[] = getDifValue(array, sum);
	for (short i=0; i<difValue.length; i++) {
		for (short j=0; j<array.length-1; j++) {
			
	if (difValue[i] >= 0 && array[j+1] == difValue[i]) {
			
			return true;
		} 
			
		
		
	}
	}
	return false;
}

	public static short[] getDifValue(short arrayForDif[], short sum) {
		short res[] = new short[arrayForDif.length];
		printArray(arrayForDif);
		for (int i = 0; i < res.length; i++) {
			res[i] = (short) (sum - arrayForDif[i]);
		
		}
		printArray(res);
		System.out.print("sum: " + sum);
		return res;
	}
	
	private static void printArray (short [] array) {
	System.out.println();
	for(int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
	}
	System.out.println();
	}
}











	
	
	

		
		
		
	


