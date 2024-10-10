package Java30Coding;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatedWord {
    public static void main(String[] args){
        String input="I Love My Son I Love IT";
        String[] words=input.split("\\W+");
        Map<String,Integer> wordCount= new HashMap<String, Integer>();
        for(String word: words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }
            else{
                wordCount.put(word,1);
            }
            System.out.println("Duplicated words");
            for(Map.Entry<String, Integer> entry: wordCount.entrySet()){
                if(entry.getValue()>1){
                    System.out.println(entry.getKey()+ ": " +entry.getValue());
                }
            }
        }
    }
}
