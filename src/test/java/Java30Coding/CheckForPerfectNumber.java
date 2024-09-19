package Java30Coding;

public class CheckForPerfectNumber {
    public static void main(String[] args){
        int num=28, sum=0;
        for(int i=1; i<=num/2; i++){
            if(num% i==0){
                sum+=i;
            }
        }
        System.out.println(num==sum);
    }
}
//A perfect number is a positive integer that is equal to the sum of its positive divisors,
// excluding itself. Let’s break down the code step by step to understand how it works:



