class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){ return false ; }
        
        Queue <TreeNode> path=new LinkedList<>();
        Queue<Integer> sum=new LinkedList<>();
        path.offer(root);
        sum.add(root.val);
        while(!path.isEmpty()){
            TreeNode node=path.poll();
            int nodesum=sum.poll();
            if (node.left!=null){
                path.add(node.left);
                sum.add(node.left.val+nodesum);
            }if (node.right!=null){
                path.add(node.right);
                sum.add(node.right.val+nodesum);
            }
            
            if (nodesum==targetSum && node.left==null && node.right==null){
                return  true;
              
            }
        }
        return false;
    }
}
