import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class TreesTypes {
    static class TreeNode {
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
            left=right=null;
        }
    }
/*################################       PRE-ORDER TREE TRAVARSAL              ################### */
    public static void preOrder(TreeNode root){
        if(root==null) return;
        System.out.println(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
/*################################       IN-ORDER TREE TRAVARSAL              ################### */
    public static void inOrder(TreeNode root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
/*################################       COUNTING OF LEAF NODES           ################### */
    public static int countLeaves(TreeNode root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return countLeaves(root.left)+countLeaves(root.right);
    }    
    public static void levelorder(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node=queue.poll();
            System.out.println(node.val+" ");
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);            
        }
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(7);

        preOrder(root);
        inOrder(root);
        System.out.println("\n"+"the counting of leaf nodes "+countLeaves(root));
        levelorder(root);
    }
}