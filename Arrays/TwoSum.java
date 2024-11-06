package com.example.Datastructure.Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] res = two(nums, target);
        System.out.println("Indices:" + res[0] + "," + res[1]);
    }

    public static int[] two(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[] { map.get(compliment), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}