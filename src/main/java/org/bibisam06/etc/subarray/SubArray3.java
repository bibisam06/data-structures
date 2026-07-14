package org.bibisam06.etc.subarray;

import java.util.Arrays;

public class SubArray3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] sum = new int[arr.length];

        for(int i=1; i<=arr.length; i++){
            sum[i] = sum[i-1] + arr[i-1];
        }

        System.out.println(Arrays.toString(sum));
    }
}
