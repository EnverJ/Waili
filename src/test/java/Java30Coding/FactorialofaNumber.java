package Java30Coding;

public class FactorialofaNumber {
    //The factorial of a number is the product of all positive integers from 1 to that number.
    // It is denoted by the symbol n!, where n is the number whose factorial is being calculated.
    public static void main(String [] args){
        int num=5, factorial=1;
        for(int i=1; i<=num; i++){
            factorial *=i;
        }
        System.out.println(factorial);
    }
}
