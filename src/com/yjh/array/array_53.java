package com.yjh.array;

public class array_53 {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=nums[0];
        for(int num:nums){
            if(sum>0){
                sum+=num; //如果前面的sum>0,sum+num>num,所以sum=sum+num
            }else{
                sum=num;
            }
            ans=Math.max(sum,ans);   //如果前面的sum<=0,sum+num<num，所以sum=num
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
