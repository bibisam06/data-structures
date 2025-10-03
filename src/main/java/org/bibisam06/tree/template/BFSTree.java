package org.bibisam06.tree.template;
/*
    코드 템플릿 1 : 일반 이진 트리 - 클래스로 구현하기 (BFS)
*/

import java.util.*;

public class BFSTree {

    static class Node{
        int value;
        List<Node> children = new ArrayList<>();

        Node(int value){
            this.value = value;
        }
    }

    static void bfs(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node node  = queue.poll();
            System.out.println("현재 방문한 노드 값 : " + node.value);
            List<Node> children = node.children;

            for(Node child : children) {
                queue.add(child);
            }
        }
    }

    public static void main(String[] args){
        // 루트 노드 생성
        Node root = new Node(1);

        // 루트의 자식들
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        root.children.add(child1);
        root.children.add(child2);

        // 2번 노드의 자식들
        Node child1_1 = new Node(4);
        Node child1_2 = new Node(5);
        child1.children.add(child1_1);
        child1.children.add(child1_2);

        // 3번 노드의 자식들
        Node child2_1 = new Node(6);
        Node child2_2 = new Node(7);
        child2.children.add(child2_1);
        child2.children.add(child2_2);

        // BFS 실행
        bfs(root);
    }
}
