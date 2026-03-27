package org.bibisam06.bruteforce.repeatcombination;

import java.util.*;
/*
중복조합 구현하기
 */
public class repeatCombination {
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
            Combination(depth+1, i, r); // 중복도 허용하기에 조합과 달리 i를 재귀 인자로 넘긴다.
        }
    }
}
