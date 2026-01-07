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
// class Solution {
//     public int countNodes(TreeNode root) {
//         if (root==null){return 0;}
//         Queue<TreeNode> path=new LinkedList<>();
//         int count=0;
//         path.offer(root);
//         while(!path.isEmpty()){
//             TreeNode node=path.poll();
//             count++;
//             if (node.left!=null){
//                 path.add(node.left);
//             }
//             if (node.right!=null){
//                 path.add(node.right);
//             }
//         }
//         return count;
//     }
// }


class Solution{
    public int countNodes(TreeNode root){
        int leftdep=leftdepth(root);
        int rightdep=rightdepth(root);
        if (leftdep == rightdep){
            return (int) Math.pow(2,leftdep)-1;
        }else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    
    }
    public int leftdepth(TreeNode root){
        int dep=0;
        while(root!=null){
            dep++; 
            root=root.left;
        }
        return dep;
    }
    public int rightdepth(TreeNode root){
        int dep=0;
        while(root!=null){
            dep++; 
            root=root.right;
        }
        return dep;
    }
    
}
