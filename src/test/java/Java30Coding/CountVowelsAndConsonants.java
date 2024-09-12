package Java30Coding;

public class CountVowelsAndConsonants {
    public static void main(String[] args){
        //If the character is found in "aeiouAEIOU", indexOf() will return the index of
        // that character (0 or greater), meaning it’s a vowel.
        //	•
        //	If the character is not found, indexOf() will return -1, meaning it’s not a vowel.
        //Vowels are letters in the alphabet that represent specific sounds. In English, the vowels are:
		//Lowercase vowels: a, e, i, o, u
		//Uppercase vowels: A, E, I, O, U
        //rest of the letters excepts abovs are Consonants

        String str="Automation";
        int vowels=0, consonants=0;
        for(char c: str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                vowels++;
            }
            else if(Character.isLetter(c)){
                consonants++;
            }
        }
        System.out.println("Vowels: " +vowels +", Consonants:" + consonants);
    }
}
