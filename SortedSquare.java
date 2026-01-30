package com.esi.cgs.web.tag;

import java.util.Arrays;

public class SortedSquare {

    public static void main(String[] args) {
        int[] nums = {-7, -3, -1, 4, 8, 12};
        int[] result = sortedSquares(nums);
        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
       // System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int leftProduct = 0, rightProduct = 0;
        int result[] = new int[nums.length];
        int index = result.length - 1;
        while (left <= right) {
            leftProduct = nums[left] * nums[left];
            rightProduct = nums[right] * nums[right];
            if (leftProduct > rightProduct) {
                result[index--] = leftProduct;
                left++;
            }else{
                result[index--] = rightProduct;
                right--;
            }

        }
        return result;
    }
}
