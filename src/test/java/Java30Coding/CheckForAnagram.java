package Java30Coding;

import java.util.Arrays;

public class CheckForAnagram {
    public static void main(String [] args){
        String str1="listen", str2="silent";
        char[] arr1= str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));
    }
}
//The given code checks if two strings are anagrams of each other.
// An anagram is a word or phrase that can be formed by rearranging the letters of another word or phrase,
// using all the original letters exactly once. In this case,
// the strings "listen" and "silent" are checked to see if they are anagrams.
