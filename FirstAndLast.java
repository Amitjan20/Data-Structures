package com.esi.cgs.web.tag;

public class FirstAndLast {

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};

        findFirst(nums);
        findlast(nums);

    }

    private static void findlast(int[] nums) {{

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= 8) {
                if(nums[mid]==8)
                    ans = mid;
                start = mid + 1;
            }else  {
                end = mid - 1;
            }

        }
        System.out.println(ans);
    }
    }

    private static void findFirst(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] >= 8) {
                if(nums[mid] == 8) {
                    ans = mid;
                }
                end = mid - 1;
            }else  {
                start = mid + 1;
            }

        }
        System.out.println(ans);
    }
}
