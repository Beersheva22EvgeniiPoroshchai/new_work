import java.util.Arrays;

public class MyArrays {

	public static int[] addsNumber(int[] array, int number) {
		//TODO
		//use standart class Arrays, method copyOf
	
		int[] newArray = Arrays.copyOf(array, array.length+1);
		newArray[newArray.length-1]=number;
		return newArray;
		
	}


	
	public static int[] removeNumber(int array[], int index) {
		int newArray[] = new int [array.length-1];
		if (index >= 0 && index < array.length) {
			System.arraycopy(array, 0, newArray, 0, index);
			System.arraycopy(array, index+1, newArray, index, array.length - 1 - index);
		} 
		else newArray = array;
		return newArray;

	}
	
}


