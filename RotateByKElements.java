package com.esi.cgs.web.tag;

public class RotateByKElements {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int k = 14;
        //op 9 8 7 6 5 4 3 2 1
        //op 7 8 9 1 2 3 4 5 6

        k = k%arr.length;

       arr = rotate(arr, 0, arr.length-1);
        arr = rotate(arr, 0, k-1);
        arr = rotate(arr, k, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

}
