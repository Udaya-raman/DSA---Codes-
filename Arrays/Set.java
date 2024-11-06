package com.example.Datastructure.Arrays;
import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3,3,4,4,5};
        int s= arr.length;
        HashSet set = new HashSet<>();
        for(int arr1 : arr){
            set.add(arr1);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
