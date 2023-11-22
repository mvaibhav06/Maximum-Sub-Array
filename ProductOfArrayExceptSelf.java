package DSA;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] getProductArray(int[] nums){
        boolean containsZero = false;
        boolean containMultipleZero = false;
        int totalProduct = nums[0];
        if(totalProduct==0) containsZero=true;
        for (int i=1; i<nums.length; i++){
            if(totalProduct==0){
                totalProduct=nums[i];
                continue;
            }
            if (nums[i]==0){
                if(containsZero){
                    containMultipleZero = true;
                }
                containsZero=true;
                continue;
            }
            totalProduct *= nums[i];
        }

        int[] answer = new int[nums.length];
        if(containMultipleZero) return answer;
        for (int i=0; i<nums.length; i++){
            if (containsZero){
                if (nums[i]!=0){
                    answer[i]=0;
                }else {
                    if(containMultipleZero){
                        answer[i] = 0;
                        continue;
                    }
                    answer[i]= totalProduct;
                }
            }else {
                answer[i] = totalProduct/nums[i];
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums  = {0,2,3,4};
        System.out.println(Arrays.toString(getProductArray(nums)));
    }
}
