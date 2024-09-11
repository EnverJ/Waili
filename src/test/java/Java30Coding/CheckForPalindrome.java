package Java30Coding;

public class CheckForPalindrome {
    public static void main(String [] args){

        //Palindrome is a word, phase, number, or sequence of characters that reads the same forward and backward
        String str= "madam";
        String reversed= new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(reversed));
    }
}
