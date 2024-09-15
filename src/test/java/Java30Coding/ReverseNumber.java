package Java30Coding;

public class ReverseNumber {
    public static void main(String [] args){
        int num=12345, reversed=0;
        while(num!=0){
            reversed= reversed*10 +num%10;
            num /=10;
        }
        System.out.println(reversed);
    }
}
//The code reverses an integer by extracting each digit from the original number,
// shifting the reversed number left (multiplying by 10), and appending the extracted digit.
//	•	The loop continues until all digits from num have been processed.
//	•	The reversed number is printed at the end.
//
//This approach efficiently reverses the digits of a number by breaking it down digit by digit.