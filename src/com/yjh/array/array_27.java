package com.yjh.array;

public class array_27 {
    static int removeElement(int[] nums, int val) {
        int i=0;
        for(int temp:nums){
            if(temp==val){
                continue;
            }
            else {
                nums[i]=temp;
                i++;
            }
        }

        return i;
    }
    public static void main(String[] args) {
        int[] arr={0,1,2,2,3,0,4,2};
        int num=removeElement(arr,0);
        System.out.println(num);

    }
}


