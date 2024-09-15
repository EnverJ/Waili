package Java30Coding;

public class ArmStrongNumber {
    public static void main(String [] args){
        int num=153, sum=0, temp=num; //temp is a temporary variable initialized with the value of num.
                                      // It will be used to extract each digit of the number during the loop.
        while(temp!=0) {//The loop runs as long as temp is not equal to 0. Inside the loop,
            // each iteration processes one digit of temp.
            int digit = temp % 10;   //The expression temp % 10 extracts the last digit of the number.
		                              //For example, if temp = 153, then digit = 153 % 10 = 3.
            sum += Math.pow(digit, 3); //The method Math.pow(digit, 3) calculates the cube of the extracted digit.
		                               //For example, if digit = 3, then Math.pow(3, 3) = 27.
		                                //The result is added to sum. After the first iteration, sum = 27.
            temp /= 10;
        }
        System.out.println(num==sum);
        }
    }

//An Armstrong number (for a 3-digit number) is a number that is equal to the sum of the cubes of its digits. For example:
//
//	•	153 is an Armstrong number because:
//
//1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153