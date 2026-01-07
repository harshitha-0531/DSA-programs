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
    public int diameterOfBinaryTree(TreeNode root) {
         Stack<TreeNode>stk=new  Stack<>();
         if (root==null){
            return 0;
         }
         HashMap<TreeNode,Integer> Map=new HashMap<>();
         stk.push(root);
         int dia=0;
         while(!stk.isEmpty()){
            TreeNode node=stk.peek();
            if (node.left!=null && !Map.containsKey(node.left)){
                stk.push(node.left);
            }
            else  if (node.right!=null && !Map.containsKey(node.right)){
                stk.push(node.right);
            }else{
                 TreeNode res =stk.pop();
                 int leftdia=Map.getOrDefault(node.left,0);
                 int rightdia=Map.getOrDefault(node.right,0);
                Map.put(node,1+Math.max(leftdia,rightdia));
                dia=Math.max(dia, leftdia+rightdia);

            }

         }
         return   dia; 
    }
}
