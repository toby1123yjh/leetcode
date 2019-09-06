package com.yjh.binarytree;

import java.util.*;

public class binarytree_102 {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) {
            return levels;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level_num = 0;  //记录当前所在的第几层的list
        while (!queue.isEmpty()) {
            levels.add(new ArrayList<Integer>());//别忘记先添加一列
            int current_level_size = queue.size();  //记录当前所在的层的size
            for (int i = 0; i < current_level_size; i++) {
                TreeNode node = queue.remove();
                levels.get(level_num).add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            level_num++;
        }
        return levels;
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(9);
        TreeNode c=new TreeNode(20);
        TreeNode d=new TreeNode(15);
        TreeNode e=new TreeNode(7);
        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;
        List<List<Integer>> levels=levelOrder(a);
        int num1=levels.size();
        for(int i=0;i<num1;i++){
            int num2=levels.get(i).size();
            for(int j=0;j<num2;j++){
                System.out.print(levels.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
