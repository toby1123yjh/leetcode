package com.yjh.sort;


import java.util.Arrays;

public class sort_349 {
    static public int[] intersection(int[] nums1, int[] nums2) {
        int max_size=nums1.length>nums2.length? nums1.length:nums2.length;
        int[] arr=new int[max_size];
        int flag=0;
        for(int i=0;i< nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int k=0;
                    while(arr[k]!=nums1[i]&&k<flag){
                        k++;
                    }
                    if(k==flag){
                        arr[flag]=nums1[i];
                        flag++;
                    }
                }
            }
        }
        return Arrays.copyOfRange(arr,0,flag);
    }

    public static void main(String[] args) {
        int[] arr1={3,2,4,1};
        int[] arr2={2,4,5,7,8,9,3,1};
        int[] arr=new int[arr2.length];
        arr=intersection(arr1,arr2);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
