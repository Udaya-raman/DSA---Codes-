package com.example.Datastructure.Strings;

import java.util.Stack;

public class Reverse{
 public static String reverseString(String input){
     Stack<String> stack = new Stack<>();
     String[] words = input.split(" ");
     for(String word : words) {
         stack.push(word);
     }
     StringBuilder reverse = new StringBuilder();
     while(!stack.isEmpty()){
         reverse.append(stack.pop());
         if(!stack.isEmpty()){
             reverse.append(" ");
         }
     }
     return reverse.toString();
 }

 public static void main(String args[]){
        String input = "Hello world";
        String reverse = reverseString(input);
        System.out.println("The string entered is :"+input);
        System.out.println("The reversed String is :" +reverse);

     }
}

//to reverse other way
//public class ReverseStringWithoutStringBuilder {
//    public static String reverseString(String str) {
//        char[] charArray = str.toCharArray(); // Convert string to character array
//        int left = 0;
//        int right = charArray.length - 1;
//
//        // Swap characters from both ends towards the center
//        while (left < right) {
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//            left++;
//            right--;
//        }
//
//        return new String(charArray); // Convert character array back to string
//    }
//
//    public static void main(String[] args) {
//        String original = "hi i am udaya"; // Input string
//        String reversed = reverseString(original);
//        System.out.println("Reversed string: " + reversed);
//    }
//}


//other way
//public class ReverseStringLoop {
//    public static String reverseString(String str) {
//        char[] chars = str.toCharArray();
//        int left = 0, right = str.length() - 1;
//
//        while (left < right) {
//            // Swap characters
//            char temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = temp;
//            left++;
//            right--;
//        }
//
//        return new String(chars);
//    }
//
//    public static void main(String[] args) {
//        String original = "hello"; // Input string
//        String reversed = reverseString(original);
//        System.out.println("Reversed string: " + reversed);
//    }
//}

