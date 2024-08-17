package javaSessions;

public class LargestNumFrom3Num {
    public static void largestNum(int a, int b, int c){
        int largest;
        if(a>=b && a>=c){
            System.out.println("latgest number is: "+ (largest=a));
        }
        else if (b>=a && b>=c){
            System.out.println("largest number is :" +(largest=b));
        }
        else{
            System.out.println("largest number is :" +(largest=c));
        }
    }
    public static void main(String [] args){
        largestNum(234,210,345);
    }
}
