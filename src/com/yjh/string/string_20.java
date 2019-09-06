package com.yjh.string;

import java.util.Stack;

public class string_20 {
    public static boolean isValid(String s) {
        Stack stack=new Stack();
        if(s.length()==1) return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            switch (c1){
                case '{':{
                    stack.push('{');
                    continue;
                }
                case '(':{
                    stack.push('(');
                    continue;
                }
                case '[':{
                    stack.push('[');
                    continue;
                }
                case '}':{
                    if(stack.empty()) return false;
                    char c=(char)stack.pop();
                    if(c=='{') continue;
                    else return false;
                }case ')':{
                    if(stack.empty()) return false;
                    char c=(char)stack.pop();
                    if(c=='(') continue;
                    else return false;
                }case ']':{
                    if(stack.empty()) return false;
                    char c=(char)stack.pop();
                    if(c=='[') continue;
                    else return false;
                }
            }
        }
        if(stack.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String str1="[";
        String str2="]{";
        System.out.println(isValid(str1));
        System.out.println(isValid(str2));
    }
}
