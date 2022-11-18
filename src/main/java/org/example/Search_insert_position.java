package org.example;

import java.util.Scanner;
class Search_insert_position {
    public int searchInsert(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        boolean isSearched = false;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                index = i;
                isSearched = true;
                break;
            }
        }
        if(isSearched == false){
            for(int i = 1; i < nums.length; i++){
                if(target > nums[i - 1] && target < nums[i]){
                    index = i;
                    break;
                }
            }
            if(target > nums[nums.length - 1]){
                index = nums.length;
            }
        }
        return index;
    }
}
