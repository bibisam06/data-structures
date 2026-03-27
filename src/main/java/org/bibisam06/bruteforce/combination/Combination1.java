package org.bibisam06.bruteforce.combination;


import java.util.Arrays;

public class Combination1 {

    static int[] arr = {1, 2, 3, 4, 5};
    static int[] output = new int[2];
    public static void main(String[] args) {
        Combination(0, 0, 2);
    }

    static void Combination(int depth, int start, int r ){
        if(depth == r){
            System.out.println(Arrays.toString(output));
            return;
        }
        for(int i=start; i<arr.length; i++){
            output[depth] = arr[i];
            Combination(depth+1, i+1, r);
        }
    }
}
