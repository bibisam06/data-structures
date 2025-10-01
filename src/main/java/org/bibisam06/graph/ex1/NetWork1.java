package org.bibisam06.graph.ex1;

import java.util.*;

/*
Q1 : 다음 그래프에서 방문한 노드들을 순서대로 정리하시오
 */
public class NetWork1 {
    public static void main(String[] args) {
        int n = 8;
        int[][] edges = {
                {0, 1},
                {0, 3},
                {0, 6},
                {1, 3},
                {2, 3},
                {3, 7},
                {4, 5},
                {5, 6},
                {5, 7},
                {6, 0}
        };
        int start = 0;

        //인접 리스트 형태가 다루기 쉬우므로 인접 리스트로 변환
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];

            list.get(x).add(y);
            list.get(y).add(x);
        }

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        List<Integer> path = new ArrayList<>();

        queue.add(start);
        visited.add(start);
        path.add(start);

        while(!queue.isEmpty()) {
            int v = queue.poll();
            for(int i : list.get(v)) {
                if(!visited.contains(i)) {
                    queue.add(i);
                    visited.add(i);
                    path.add(i);
                }
            }

        }

        System.out.print("{");
        for (Integer integer : path) {
            System.out.print(integer + " ");
        }
        System.out.println("}");


    }
}
