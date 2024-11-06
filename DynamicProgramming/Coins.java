package com.example.Datastructure.DynamicProgramming;
public class Coins {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println(coinchange(coins,amount));
    }
        public static int coinchange ( int[] coins, int amount){
            if (amount < 1) {
                return 0;
            }
            int[] arr = new int[amount + 1];
            for (int i = 1; i <= amount; i++) {
                arr[i] = Integer.MAX_VALUE;
                for (int coin : coins) {
                    if (coin <= i && arr[i - coin] != Integer.MAX_VALUE) {
                        arr[i] = Math.min(arr[i], 1 + arr[i - coin]);
                    }
                }
            }
            if (arr[amount] == Integer.MAX_VALUE) {
                return -1;
            }
            return arr[amount];

        }
    }

