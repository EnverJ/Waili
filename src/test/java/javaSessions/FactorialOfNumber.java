package javaSessions;

public class FactorialOfNumber {
    public static int FNumber( int n){
        int result=1;
        for(int i=1; i<=n; i++){
            result *=i;
        }
        return result;
    }
    public static void main(String[] args){
        int num=5;
        int result=FNumber(num);
        FNumber(5);
        System.out.println("factorial of " +num  + " is "  +result);
    }
}
