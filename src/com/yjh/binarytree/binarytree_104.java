package com.yjh.binarytree;




public class binarytree_104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        else{
             int leftDepth=maxDepth(root.left);
             int rightDepth=maxDepth(root.right);
             return  java.lang.Math.max(leftDepth, rightDepth) + 1;
        }
    }
}
