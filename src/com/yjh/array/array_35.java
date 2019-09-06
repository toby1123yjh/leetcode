package com.yjh.array;

public class array_35{
    static public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length; i++){
            if (nums[i]==target){
                return i;
            }
            if(nums[i]<=target&&i<nums.length-1){
                if(target<=nums[i+1]){
                    return i+1;
                }
            }
            if(target>=nums[nums.length-1]){
                return nums.length;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1};
        int i=searchInsert(arr,2);
        System.out.println(i);
    }
}