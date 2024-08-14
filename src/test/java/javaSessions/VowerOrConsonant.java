package javaSessions;

public class VowerOrConsonant {
    public static void Check(char value){
        // take a character as an input and print whether it is an vowel or consonant
        if(value=='a' || value=='b'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
    public static void main(String [] args){
        Check('a');
    }
}
