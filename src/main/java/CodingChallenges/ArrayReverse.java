package CodingChallenges;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        arrayReverse(originalArray);
        System.out.println(Arrays.toString(originalArray));
        System.out.println(Arrays.toString(originalArray));

        int[] originalArray2 = {2, 3, 4, 5, 6};
        reverse2(originalArray2);
        System.out.println(Arrays.toString(originalArray2));
    }

    public static void arrayReverse(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len/2; i++) {
            if (arr[i] < len) {
                int temp = arr[i];
                arr[i] =arr[len-i-1];
                arr[len-i-1] = temp;
            }
        }
    }

    public static void reverse2(int[]arr){
        int start=0;
        int len=arr.length-1;

        while(start<len){
            int temp=arr[start];
            arr[start]=arr[len];
            arr[len]=temp;

            start++;
            len--;
        }
    }
}