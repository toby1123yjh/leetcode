package com.yjh.string;

public class string_28 {
    public static int strStr(String haystack, String needle) {
        if(haystack==null||needle==null){
            return -1;
        }
        if(needle.length()==0) {
            return 0;
        }
        if(haystack.length()==0){
            return -1;
        }
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            int j=0;
            int temp=i;
            while(haystack.charAt(temp)==needle.charAt(j)){
                temp++;
                j++;
                if(j==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1="111";
        String str2="";

        System.out.println(strStr(str1,str2));
    }
}
