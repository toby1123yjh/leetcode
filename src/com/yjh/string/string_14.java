package com.yjh.string;

public class string_14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int min_length=strs[0].length();
        //找出字符串中最小的那个
        for(int i=0;i<strs.length;i++){
            if(min_length>strs[i].length()){
                min_length=strs[i].length();
            }
        }

        String str="";
        for(int j=0;j<min_length;j++){
            char c=strs[0].charAt(j);
            int index=0;
            while(strs[index].charAt(j)==c){
                index++;
                if(index==strs.length){
                    break;
                }
            }
            if(index==strs.length){
                str+=c;
                continue;
            }else{
                return str;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String[] strs={"flower","flow","flight"};
        String[] strs1={};
        System.out.println(longestCommonPrefix(strs1));
    }
}
