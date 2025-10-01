package org.bibisam06.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyList02 {
    public static void main(String[] args) {

        int[][] edges = {{0, 1}, {0, 3}, {0, 6}, {1, 3}, {2, 3}, {3, 7}, {4, 5}, {5, 6}, {5, 7}};
        int n = 8;

        Map<Integer, List<Integer>> graph = new HashMap<>();

        for(int i=0; i<n; i++){
            graph.put(i, new ArrayList<>()); //map 초기화하기
        }

        for(int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        int curVertex = 3;  // 현재 노드
        for (int nextVertex : graph.get(curVertex)) {
            System.out.println("노드 " + curVertex + " → 다음 노드 " + nextVertex);
        }


    }
}
