package javaSessions;

public class AVGOfGiven3Num {
    public static void AverageNum(int a, int b, int c){
        int sum=a+b+c;
        double average=(double) sum/3;
        System.out.println("Average of 3 numbers: " +average);
    }
    public static void main(String[] args){
        AverageNum(2, 4,9);
    }
}
