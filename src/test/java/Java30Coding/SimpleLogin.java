package Java30Coding;

import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args){
        String username="admin";
        String password="password";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter user name: ");
        String inputUsername= sc.nextLine();
        System.out.println("enter password: ");
        String inputPassword= sc.nextLine();
        if(username.equals(inputUsername) && password.equals(inputPassword)){
            System.out.println("Login successful");
        }
        else{
            System.out.println("Login Failed");
        }
    }
}
