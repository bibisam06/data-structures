package org.bibisam06.search.backtracking;

/*
    BackTracking 예제 2 : 조합(Combination) 구현
*/

import java.util.*;

public class BackTracking2 {
    public static void main(String[] args){
        int[] nums = {12, 28, 30, 49, 56};
        int n = nums.length;
        int r = 2 ; // 고르는 갯수

        List<List<Integer>> list = new ArrayList<>();

        backtracking(0, new ArrayList<>(),nums, n, r, list);
    }

    static void backtracking(int start, List<Integer> curr, int[] nums, int n, int r, List<List<Integer>> ans){

        if(curr.size() == r) {
            ans.add(new ArrayList<>(curr));

            for(List<Integer> a : ans) {
                System.out.print("{ ");
                for(int t : a) {
                    System.out.print(t + " ");
                }
                System.out.print("}");
                System.out.println();
            }
            System.out.println();

            return;
        }

        for(int i = start; i<n; i++) {
            curr.add(nums[i]);
            backtracking(i + 1, curr, nums, n, r, ans);
            curr.remove(curr.size() - 1);
        }

    }
}
