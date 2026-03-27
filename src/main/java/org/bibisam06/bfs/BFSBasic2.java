package org.bibisam06.bfs;

import java.util.*;

public class BFSBasic2 {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            graph.add(new ArrayList<>());
        }

        // 인접 노드 추가
        graph.get(0).add(1);                // 0번 노드 → 1

        graph.get(1).add(0);                // 1번 노드 → 0
        graph.get(1).add(2);                // 1번 노드 → 2
        graph.get(1).add(4);                // 1번 노드 → 4

        graph.get(2).add(1);                // 2번 노드 → 1
        graph.get(2).add(3);                // 2번 노드 → 3

        graph.get(3).add(2);                // 3번 노드 → 2
        graph.get(3).add(4);                // 3번 노드 → 4
        graph.get(3).add(5);                // 3번 노드 → 5

        graph.get(4).add(1);                // 4번 노드 → 1
        graph.get(4).add(3);                // 4번 노드 → 3
        graph.get(4).add(5);                // 4번 노드 → 5

        graph.get(5).add(3);                // 5번 노드 → 3
        graph.get(5).add(4);                // 5번 노드 → 4

        bfs(graph);
    }

    static void bfs(List<List<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];
        Deque<Integer> queue = new ArrayDeque<>();
        visited[0] = true;
        queue.add(0);

        while(!queue.isEmpty()){
            int current = queue.poll();
            visited[current] = true;
            System.out.print("current node: " + current);
            for(int i : graph.get(current)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }
}
