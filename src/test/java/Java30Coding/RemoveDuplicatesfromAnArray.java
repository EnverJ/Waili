package Java30Coding;

import java.util.HashSet;
//	•	HashSet:
//	•	A HashSet in Java stores unique elements and automatically removes duplicates.
//	•	It is part of Java’s Collections Framework and does not maintain the order of insertion.
//	•	Array Iteration:
//	•	The for-each loop (for(int num: arr)) allows you to iterate over each element in the array.
//	•	Duplicate Removal:
//	•	By adding elements to the HashSet, duplicates are removed automatically because HashSet
//	doesn’t allow duplicate values.

public class RemoveDuplicatesfromAnArray {
    public static void main(String[] args){
        int[] arr={1,2,2,3,4,4};
        HashSet<Integer> set= new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
