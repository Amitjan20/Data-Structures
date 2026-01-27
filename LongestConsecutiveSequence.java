package com.esi.cgs.web.tag;


import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2,6,7,5};
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }

        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = nums[i] - 1;
            int right = nums[i] + 1;

            while(s.contains(left)) {
                int temp = left --;
                count++;
                s.remove(temp);
                max = Math.max(max, count);
            }
            while(s.contains(right)) {
                int temp = right ++;
                count++;
                s.remove(temp);
                max = Math.max(max, count);
            }

        }

        System.out.println(max);
    }
}

