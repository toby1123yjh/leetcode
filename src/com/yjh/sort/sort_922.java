package com.yjh.sort;

public class sort_922 {
    public static  int[] sortArrayByParityII(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        int t = 0;
        for (int x : A)
            if (x % 2 == 0) {
                ans[t] = x;
                t += 2;
            }
        t = 1;
        for (int x : A)
            if (x % 2 == 1) {
                ans[t] = x;
                t += 2;
            }
        return ans;
    }
    public static void main(String[] args) {
        int[] A={1,2,4,3,7,5,6};
        int [] B=sortArrayByParityII(A);
        for(int i=0;i<A.length;i++){
            System.out.print("index :"+i+B[i]+" ");
        }
    }
}
