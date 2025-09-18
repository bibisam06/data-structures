package graph.ex2;

import java.util.ArrayList;
import java.util.List;
/*
Q2 : 주어진 배열에 대한 DFS순회를 구현하시오.
 */
public class NetWork2 {
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

        List<Integer> answer = solution(edges, 8, 0); //정답 배열 담아오는 리스트
        System.out.print("{ ");
        for(int i: answer) {
            System.out.print(i + ", ");
        }
        System.out.println(" }");
    }

    public static List<Integer> solution(int[][] edges, int n, int start) {
        List<Integer> answer = new ArrayList<>(); // 방문 순서 저장
        List<List<Integer>> graph = new ArrayList<>();

        // 인접 리스트 변환
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // ===== DFS 호출 =====
        boolean[] visited = new boolean[n];
        dfs(graph, start, visited, answer);

        return answer;
    }

    // visited를 boolean[]으로 구현할 경우
    static void dfs(List<List<Integer>> graph, int cur, boolean[] visited, List<Integer> answer) {
        // ===== DFS 함수 작성 =====
        visited[cur] = true;
        answer.add(cur);
        for(int v: graph.get(cur)) {
            if(!visited[v]) {
                visited[v] = true;
                dfs(graph, v, visited, answer); //재귀로 구현
            }
        }
        // ======================
    }
}
