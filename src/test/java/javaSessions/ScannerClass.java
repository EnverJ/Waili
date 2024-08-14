package javaSessions;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String [] args){
        //scan name of user and say hello

        Scanner sc= new Scanner (System.in);
        System.out.println("enter name");
       String name= sc.nextLine();
        System.out.println("Hello " +name);

    }
}
