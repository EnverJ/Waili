package Java30Coding;

public class CountCharacters {
    public static void main(String [] args){
        String str= "Automation";
        char ch='o';
        int count=0;
        for(char c: str.toCharArray()){
            if(c==ch) count++;
        }
        System.out.println(count);
    }
}
