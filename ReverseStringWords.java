package com.esi.cgs.web.tag;

public class ReverseStringWords {

    public static void main(String[] args) {
        String str = "Hello World";
        char arr[] = str.toCharArray();

        arr = reverse(arr, 0, arr.length - 1);

        int k=0;
        int j=0;
        while(k<arr.length){
            while(arr[k]==' '){
                k++;
            }
            while(k<arr.length && arr[k]!=' '){
                k++;
            }
            reverse(arr, j, k-1);
            j=k+1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }

    private static char[] reverse(char[] arr, int i, int length) {

       while (i <= length) {
           char temp = arr[i];
           arr[i] = arr[length];
           arr[length] = temp;
           i++;
           length--;
       }
       return arr;
    }
}
