package org.bibisam06.bruteforce.repeatpermutation;

import java.util.*;

public class repeatPermutation {
    static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
    static int[] output = new int[2];

    public static void main(String[] args) {
        repeatPermutation1(0,2);
    }

    public static void repeatPermutation1(int depth, int r){
    if(depth == r){
        System.out.println(Arrays.toString(output));
        return;
    }

    for(int i=0; i<arr.length; i++){
        output[depth] = arr[i];
        repeatPermutation1(depth+1, r);
    }
    }
}
