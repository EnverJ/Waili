package javaSessions;

public class SumOfNnaturalNumbers {
    public static void SumOfNNaturalN( int num){
        int sum=0;
        for( int i=0; i<=num; i++){
            sum=sum+i;
        }
        System.out.println("Natural number is: " +sum);
    }
    public static void main(String[] args){
        SumOfNNaturalN(10);
    }
}
