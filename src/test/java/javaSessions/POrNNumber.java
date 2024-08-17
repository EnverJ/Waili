package javaSessions;

public class POrNNumber {
    public static void PNNumber(int num){
        if(num>=0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
    public static void main(String[] args){
        PNNumber(-4);
    }

}
