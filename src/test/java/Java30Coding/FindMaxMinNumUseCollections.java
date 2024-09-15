package Java30Coding;

import java.util.*;

public class FindMaxMinNumUseCollections {
    public static void main(String [] args){
        //crreating a list of numbers
        List<Integer> numbers= Arrays.asList(2,7,9,12,45);
        //finding the max and min numbers
        int maxNumbers= Collections.max(numbers);
        int minNumbers= Collections.min(numbers);
        //output the results
        System.out.println("Max numbers: " +maxNumbers);
        System.out.println("Min Numbers : " +minNumbers);

    }
}
