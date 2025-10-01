package org.bibisam06.graph;

import java.util.*;

public class AdjacencyList01 {
    public static void main(String[] args) {

        int[][] edges = {{1,2}, {1,3}, {1,4}, {2,3}, {2,5}, {4,5}};
        int n = 5;

        /*
        list 를 사용한 그래프의 구현
         */

        List<List<Integer>> list = new ArrayList<>();
        // 리스트 초기화
        for(int i = 0; i < n+1; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }

        bfs1(list, 1);
        bfs2(list, 2);
    }

    // BFS 구현
    /*
    visited 를 set으로 구현하기
     */
    public static void bfs1(List<List<Integer>> graph, int startNode) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();

        visited.add(startNode);
        queue.add(startNode);

        while (!queue.isEmpty()) {
            //현재 노드 방문
            int currentNode = queue.poll();
            System.out.println("현재 방문한 노드 : " + currentNode);
            for (int neighbor : graph.get(currentNode)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void bfs2(List<List<Integer>> graph, int startNode) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(startNode);
        visited[startNode] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for(int neighbor : graph.get(currentNode)) {
                if(!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

    }

}
