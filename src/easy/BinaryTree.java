package easy;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BinaryTree {
    TreeNode root;
    public  List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderRec(root,list);
        return list;
    }
    private  void inorderRec(TreeNode root, List<Integer> list)
    {
        if(root != null){
            inorderRec(root.left,list);
            list.add(root.val);
            inorderRec(root.right,list);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BinaryTree that = (BinaryTree) o;
        return Objects.equals(root, that.root);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSymmetric(TreeNode root) {

        boolean ans = isSame(root.left, root.right);
        return ans;
    }
    private boolean isSame(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return p == q;
        }
        return (p.val == q.val) && isSame(p.left,q.right) && isSame(p.right,q.left);
    }

    }
