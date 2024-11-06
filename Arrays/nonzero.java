package com.example.Datastructure.Arrays;

public class nonzero {
    public static void main(String[] args) {
        int[] nums={1,0,2,0,3,0,0,6};
        int i=0;
        int count=0;
    for(int j=0;j<nums.length;j++)
    {
        if(nums[j]!=0)
        {
            nums[i]=nums[j];
            i++;
        }
        if(nums[j]==0)
        {
            count++;
        }
    }
     for( int k=0;k<count;k++)
     {
             nums[i]=0;
             i++;
     }  
     
    for(int nums1:nums){
         System.out.println(nums1);
    }
    System.out.println();
    }
}
