package org.bibisam06.bfs;

import java.util.*;

public class BFSDistance {
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        // 그래프 연결
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(2).add(4);
        graph.get(4).add(2);

        graph.get(3).add(5);
        graph.get(5).add(3);

        bfs(graph, 0, n);
    }

    static void bfs(List<List<Integer>> graph, int start, int n){
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[n];
        int[] dist = new int[n];

        q.offer(start);
        visited[start] = true;
        dist[start] = 0;

        while(!q.isEmpty()){
            int cur = q.poll();

            for(int next : graph.get(cur)){
                if(!visited[next]){
                    visited[next] = true;
                    dist[next] = dist[cur] + 1; // ⭐ 핵심
                    q.offer(next);
                }
            }
        }

        // 결과 출력
        for(int i = 0; i < n; i++){
            System.out.println(i + "까지 거리: " + dist[i]);
        }
    }
}