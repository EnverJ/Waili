package Java30Coding;

public class FibonacciSeries {
    //FibonacciSeries is The Fibonacci series is a sequence of numbers in which each number is the sum of the
    // two preceding ones, typically starting with 0 and 1. The sequence follows this pattern:
    //
    //\[
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, \dots
    //\]
    //
    //Formula:
    //
    //Each term in the Fibonacci sequence is defined by the recurrence relation:
    //
    //F(n) = F(n-1) + F(n-2)

    public static void main(String [] args){
        int n=10, num1=0, num2=1;
        System.out.print("Fibonacci Series: " +num1 + ","+num2);
        for(int i=2; i<n; i++){
            int num3=num1+num2;
            System.out.print("," +num3);
            num1=num2;
            num2=num3;
        }
    }
}
