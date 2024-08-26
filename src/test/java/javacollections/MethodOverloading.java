package javacollections;

public class MethodOverloading {
    public static int AddMethod( int a, int b){
       return a+b;
        //System.out.println(sum);
    }
    public static double AddMethod(double b, double c){
       return b+c;
    //    System.out.println(sum);

    }
    public static void main(String[] args){
        System.out.println(AddMethod( 3, 4));
        System.out.println(AddMethod(3.9 ,2.0));
    }

}
