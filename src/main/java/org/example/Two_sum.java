package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Two_sum
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        twoSum(nums,target);
    }


    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> ind = new ArrayList<>();
        int n;
        boolean checkIsTarget = false;
        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            for(int j = i + 1; j < nums.length; j++) {
                if (n + nums[j] == target) {
                    checkIsTarget = true;
                    ind.add(i);
                    ind.add(j);
                    break;
                }
            }
            if(checkIsTarget == true){
                break;
            }
        }
        int[] arr = ind.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}
