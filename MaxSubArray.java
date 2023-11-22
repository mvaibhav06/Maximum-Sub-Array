package DSA;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum<0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        
    }
}
