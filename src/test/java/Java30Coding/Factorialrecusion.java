package Java30Coding;

import com.google.common.math.LongMath;

import static com.google.common.math.LongMath.factorial;

public class Factorialrecusion {
    public static void main(String [] args){
        int num=5;
        System.out.println(factorial(num));

    }
    static int factorial(int n){
        if(n==0) return 1;
        return n* factorial(n-1);
    }

}
//The factorial of a non-negative integer n is the product of all positive integers less than or equal to n. It is denoted by n!. By definition:
//
//	•	 n! = n \times (n - 1) \times (n - 2) \times \ldots \times 1
