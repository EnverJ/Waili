package Java30Coding;

public class CountTheNumberOfDigitsInANumber {
    public static void main(String [] args){
        int num=12345;
        int count= String.valueOf(num).length();
        System.out.println(count);
    }
}
//	String.valueOf(num):
//	•	This method converts the integer num into a string representation.
//	•	For example, if num = 12345, it becomes "12345".
//	•	.length():
//	•	The .length() method is used to determine the number of characters in the string.
//	•	Since each character corresponds to a digit in the number, the length of the string gives
//	the number of digits in the integer.
