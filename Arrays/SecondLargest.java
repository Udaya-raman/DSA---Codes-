package com.example.Datastructure.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] arr ={10,20,4,45,99,6};
        int s = arr.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<s;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("Second largest not found");
        }
        System.out.println("Second largest found: "+second);
    }
}
