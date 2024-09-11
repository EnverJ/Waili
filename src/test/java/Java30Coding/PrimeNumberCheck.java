package Java30Coding;

public class PrimeNumberCheck {
    //A prime number is a natural number greater than 1 that has no divisors other than 1 and itself.
    // In other words, a prime number is only divisible by 1 and the number itself, without leaving any remainder.
    //
    //Key Characteristics:
    //
    //	•	A prime number must be greater than 1.
    //	•	It has exactly two distinct positive divisors: 1 and itself.
    //
    //Examples of Prime Numbers:
    //
    //	•	2, 3, 5, 7, 11, 13, 17, 19, 23, etc.
    public static void main(String [] args){
        int num=11;
        boolean isPrime=true;
        for( int i=2; i<=Math.sqrt(num); i++){
            if(num% i ==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
