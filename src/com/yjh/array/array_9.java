package com.yjh.array;

public class array_9 {
    public static boolean isPalindrome(int x) {
        String temp=Integer.toString(x);
        StringBuilder sb=new StringBuilder();
        sb.append(temp);
        sb.reverse();
        String str= sb.toString();

        if(str.equals(temp))
            return true;
        return false;
    }

    public static void main(String[] args) {
        int x=1122332211;
        if(isPalindrome(x))
        System.out.println("true");
        else{
            System.out.println("false");
        }
    }
}
