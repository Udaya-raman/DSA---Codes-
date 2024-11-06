package com.example.Datastructure.Arrays;
import java.util.Scanner;
public class Container {

    public static int maxArea(int[] height)
    {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right)
        {  
            int currArea = Math.min(height[left],height[right])*(right - left);
            maxArea = Math.max(maxArea, currArea);
            if(height[left] < height[right])
            {
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int height[] = new int[size];
        System.out.println("enter the elements");
        for(int i = 0; i<size; i++)
        {
            height[i] = sc.nextInt();
        }
        int result = maxArea(height);
        System.out.println("the maximum area is: " + result);
    }
}  
