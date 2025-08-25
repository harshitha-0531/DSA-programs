class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        // int p1 =0;
        // int p2=0;
         for (int i:nums){
            if (i!=val){
                nums[k]=i;
                k++;
            }
        }
        return k;
    }
}
