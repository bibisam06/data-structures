package org.bibisam06.tree.template;
/*
    단순 상승 LCA(Lowest Common Ancestor) 구현하기 - Java
*/
import java.util.*;
public class LowestCommonAncestor {

    static int[] parent, depth;
    static ArrayList<Integer>[] graph;

    static void bfs(int root){ // depth, parent 계산
        Arrays.fill(parent, -1);
        Arrays.fill(depth, -1); 
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(root);
        parent[root] = 0;
        depth[root] = 0;

        while(!queue.isEmpty()) {
            int current = queue.poll();
            List<Integer> nexts = graph[current];

            for(int value : nexts) {
                if(parent[value] != -1) continue;
                parent[value] = current;
                depth[value] = depth[current] + 1;
                queue.add(value);
            }
        }

    }

    /*
        두 노드의 깊이를 비교해 들어올리기(lca)
    */

    static int lca(int a, int b){

        if(depth[a] < depth[b]){
            int t = a;
            a = b;
            b = t; // a가 더 낮은 위치를 가지게 끔 두 노드를 바꿔줌
        }

        while(depth[a] > depth[b]) {
            a = parent[a];
        }// a가 부모 타고 올라감 -> b 랑 높이 맞춰줌

        while(a!=b) {
            a = parent[a];
            b = parent[b];
        }

        return a;
    }

    static void addEdge(int a, int b){
        graph[a].add(b);
        graph[b].add(a);
    }
    public static void main(String[] args){
        // ===== 1) 예시 트리 구성 (노드 1~7) =====
        int N = 7;
        graph  = new ArrayList[N + 1];
        parent = new int[N + 1];
        depth  = new int[N + 1];
        for (int i = 1; i <= N; i++) graph[i] = new ArrayList<>();

        // 예시 트리 (완전이진트리)
        //      1
        //    /   \
        //   2     3
        //  / \   / \
        // 4   5 6   7
        addEdge(1, 2);
        addEdge(1, 3);
        addEdge(2, 4);
        addEdge(2, 5);
        addEdge(3, 6);
        addEdge(3, 7);


        int nodeA = 5;
        int nodeB = 3;

        bfs(1);//1번부터 깊이, 부모 저장

        int lcaResult = lca(nodeA, nodeB);

        System.out.println("두 노드의 공통 조상 노드는 " + lcaResult + "입니다.");

    }
}
