class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        int left=0;
        int right=nums.length-1;
        int sum;
      Arrays.sort(nums);
      while(left<right){
        sum=nums[left]+nums[right];
        
        if (sum<k){
            left++;
        }
        else if (sum>k){
            right--;
        }else{
            left++;
            right--;
            count++;
        }
      }  
      return count;
     
       
    }
}
