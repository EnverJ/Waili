package Java30Coding;
//	Initialization: The program assumes the first element in the array is the largest.
//	•	Iteration and Comparison: The program loops through the array and compares each element to the current largest.
//	If an element is larger, it updates the largest variable.
//	•	Result: After going through all the elements, the program prints the largest element in the array.
public class FindLargestElementInAnArray {
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        int largest=arr[0];
        for(int num: arr){
            if(num>largest){
                largest=num;
            }
        }
        System.out.println(largest);
    }
}
