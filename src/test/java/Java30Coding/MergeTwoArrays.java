package Java30Coding;

import java.util.Arrays;
//Define Two Arrays:
// Create a New Array for the Merged Result:
// Copy arr1 into merged:The System.arraycopy() method copies elements from one array to another.
//	•	The first argument (arr1) is the source array.
//	•	The second argument (0) is the starting index in the source array (begin copying from index 0 of arr1).
//	•	The third argument (merged) is the destination array.
//	•	The fourth argument (0) is the starting index in the destination array (begin pasting at index 0 of merged).
//	•	The fifth argument (arr1.length) is the number of elements to copy from arr1.
public class MergeTwoArrays {
    public static void main(String [] args){
        int[] arr1={1,3,5};
        int[] arr2={2,4,6};
        int[] merged = new int[arr1.length +arr2.length];
        System.arraycopy(arr1, 0, merged, 0,arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);
        System.out.println(Arrays.toString(merged));
    }
}

//	System.arraycopy():
//	•	This is a built-in method to copy elements from one array to another.
//	•	The parameters are:
//	•	Source array
//	•	Start index in the source array
//	•	Destination array
//	•	Start index in the destination array
//	•	Number of elements to copy
//	•	Arrays.toString():
//	•	This is a utility method from the java.util.Arrays class that converts an array to a human-readable string.

