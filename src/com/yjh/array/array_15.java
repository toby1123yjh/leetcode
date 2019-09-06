package com.yjh.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class array_15 {
    static public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);//排序
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < num.length - 2; ++i) {
            if (i > 0 && num[i] == num[i - 1]) continue; //避免重复三元组
            int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];
            while (lo < hi) {//有序数组找特定和的两元素，双指针算法
                if (num[lo] + num[hi] == sum) {
                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
                    while (lo < hi && num[lo] == num[lo + 1]) lo++;//避免重复三元组
                    while (lo < hi && num[hi] == num[hi - 1]) hi--;//避免重复三元组
                    lo++;
                    hi--;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a={-1,0,1,2,2,-1,-4};
        List<List<Integer>> res=threeSum(a);
        for(int i=0;i<res.size();i++){
            List<Integer> temp=res.get(i);
            Iterator it=temp.iterator();
            int k=0;
            while(it.hasNext()){
                k++;
                System.out.print( it.next()+"  ");
                if(k%3==0){
                    System.out.println();
                }
            }
        }
    }
}
