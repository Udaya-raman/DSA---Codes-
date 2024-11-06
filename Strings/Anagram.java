package com.example.Datastructure.Strings;
public class Anagram{

    public static boolean anagramTest(String str1,String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'A']++;
        }
        for(int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;
        }
        for(int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String str1 = "INTEGER";
        String str2 = "NTIEREGR";
        System.out.println(anagramTest(str1,str2));

    }
}

//other way
//import java.util.Arrays;

//public class AnagramChecker {
//
//    public static boolean areAnagrams(String str1, String str2) {
//        // Remove whitespace and convert to lowercase
//        str1 = str1.replaceAll("\\s+", "").toLowerCase();
//        str2 = str2.replaceAll("\\s+", "").toLowerCase();
//
//        // Check if lengths are different
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Convert strings to character arrays
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        // Sort the character arrays
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);
//
//        // Compare sorted arrays
//        return Arrays.equals(charArray1, charArray2);
//    }
//
//    public static void main(String[] args) {
//        String string1 = "Listen";
//        String string2 = "Silent";
//
//        if (areAnagrams(string1, string2)) {
//            System.out.println(string1 + " and " + string2 + " are anagrams.");
//        } else {
//            System.out.println(string1 + " and " + string2 + " are not anagrams.");
//        }
//    }
//}



//other way
//import java.util.HashMap;
//
//public class OptimizedAnagramChecker {
//
//    public static boolean areAnagrams(String str1, String str2) {
//        // Remove whitespace and convert to lowercase
//        str1 = str1.replaceAll("\\s+", "").toLowerCase();
//        str2 = str2.replaceAll("\\s+", "").toLowerCase();
//
//        // Check if lengths are different
//        if (str1.length() != str2.length()) {
//            return false;
//        }
//
//        // Use a HashMap to count character frequencies
//        HashMap<Character, Integer> charCountMap = new HashMap<>();
//
//        // Count characters in str1
//        for (char c : str1.toCharArray()) {
//            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//        }
//
//        // Decrease the count based on str2
//        for (char c : str2.toCharArray()) {
//            if (!charCountMap.containsKey(c)) {
//                return false; // Character in str2 not found in str1
//            }
//            charCountMap.put(c, charCountMap.get(c) - 1);
//            if (charCountMap.get(c) < 0) {
//                return false; // More occurrences in str2 than in str1
//            }
//        }
//
//        // If all counts are zero, they are anagrams
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String string1 = "Listen";
//        String string2 = "Silent";
//
//        if (areAnagrams(string1, string2)) {
//            System.out.println(string1 + " and " + string2 + " are anagrams.");
//        } else {
//            System.out.println(string1 + " and " + string2 + " are not anagrams.");
//        }
//    }
//}
//
