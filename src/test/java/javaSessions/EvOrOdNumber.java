package javaSessions;

public class EvOrOdNumber {
    public static void EvenOrOddNumber( int num){
        if(num % 2 ==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("odd Number");
        }
    }
    public static void main (String[] args){
        EvenOrOddNumber(-9);
    }

}
