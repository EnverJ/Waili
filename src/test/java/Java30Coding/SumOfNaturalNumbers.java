package Java30Coding;

public class SumOfNaturalNumbers {
    public static void main(String [] args){
        //int n=10,  sum=n*(n+1)/2;
        //System.out.println(sum);
        int  sum=0;
        for(int n=1; n<=10; n++){
            sum+=n;
        }
        System.out.println(sum);
    }
}
