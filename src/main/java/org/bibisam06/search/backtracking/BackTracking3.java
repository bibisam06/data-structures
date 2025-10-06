package org.bibisam06.search.backtracking;
/*
    BackTracking 예제 3 : 부분합(Subset) 구현
*/
import java.util.*;

public class BackTracking3 {
    public static void main(String[] args){
        int[] nums = {10, 20, 30};
        List<List<Integer>> answer = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            answer.add(new ArrayList<>());
        }

        answer = backtracking(0, new ArrayList<>(), nums, answer);

        System.out.println(answer);
    }

    static List<List<Integer>> backtracking(int start, List<Integer> curr, int[] nums, List<List<Integer>> ans){

        ans.add(new ArrayList<>(curr));

        for(int i=start; i<nums.length; i++){
            curr.add(nums[i]);
            backtracking(i + 1, curr, nums, ans);
            curr.remove(curr.size()-1);
        }

        return ans;
    }
}
