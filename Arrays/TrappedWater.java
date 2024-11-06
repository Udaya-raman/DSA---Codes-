package com.example.Datastructure.Arrays;

public class TrappedWater {
    public static int solution(int[] height){
        int n=height.length;
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(height[i], rightmax[i+1]);
        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(rightmax[i],leftMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args){
        // int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        // System.out.println(solution(height));
        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println(i +" = "+ (i +" < "+ arr.length));
        }
    }
}