/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue <TreeNode> path=new LinkedList<>();
        if(root==null){
            return root;
        }
        path.offer(root);
        int size=path.size();
        while(!path.isEmpty()){
            TreeNode node=path.poll();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;
            if (node.right!=null){
                path.add(node.right);
            }
            if (node.left!=null){
                path.add(node.left);
            } 
        }
        return root;
        
    }
}
