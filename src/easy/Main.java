package easy;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();
        Solution sol = new Solution();

        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.right = new TreeNode(2);
       bt.root.left.left = new TreeNode(4);
       bt.root.right.right = new TreeNode(4);

        System.out.println(sol.isSymmetric(bt.root));




    }


    

}








