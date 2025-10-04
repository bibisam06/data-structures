package org.bibisam06.search.backtracking;

/*
    BackTracking 예제 1 : 순열 생성하기
*/

import java.util.*;
public class BackTrackingTest {

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4};
        int n = nums.length;
        boolean[] visited = new boolean[n];
        bfs(new ArrayList<>(), visited, nums);
    }

    static void bfs(List<Integer> path, boolean[] visited, int[] nums) {
        if(path.size() == nums.length) {
            System.out.print("{ ");
            for(int i : path) System.out.print(i + " ");
            System.out.print("}");
            System.out.println();
        }

        for(int i=0; i<nums.length; i++) {
            if(!visited[i]) {
                List<Integer> newPath = new ArrayList<>(path);
                visited[i] = true;
                newPath.add(nums[i]);
                bfs(newPath, visited, nums);
                visited[i] = false;
            }
        }
    }
}
