package Java30Coding;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args){
        String word= "Team is Work Work IT dep IT";
        //split the string into words based on spaces
        String[] wordsArray= word.split(" ");
        //create a hashmap to store word counts
        Map<String, Integer> wordCountMap= new HashMap<>();
        //Loop through the words array and count the occurrences
        for (String w: wordsArray){
            //if the word is already in the map, increment its count
            if(wordCountMap.containsKey(w)){
                wordCountMap.put(w, wordCountMap.get(w) +1);

            }
            else {
                //if the word is not in the map, add it with a count of 1
                wordCountMap.put(w, 1);
            }
        }
        //print the word counts
        for(Map.Entry<String, Integer> entry:wordCountMap.entrySet()){
            System.out.println(entry.getKey() +  " :" +entry.getValue());
        }
    }
}
