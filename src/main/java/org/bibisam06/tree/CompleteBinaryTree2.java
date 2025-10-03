package org.bibisam06.tree;

import java.util.*;

public class CompleteBinaryTree2 {

    public static void main(String[] args) {
        int[][] links = {
                {-1, -1},
                {-1, -1},
                {-1, -1},
                {-1, -1},
                {8, 5},
                {2, 10},
                {3, 0},
                {6, 1},
                {11, -1},
                {7, 4},
                {-1, -1},
                {-1, -1}
        };

        int n = links.length;
        TreeNode[] nodes = new TreeNode[n];
        for (int i = 0; i < n; i++) nodes[i] = new TreeNode(i);

        int[] parents = new int[n];
        Arrays.fill(parents, -1);

        for (int i = 0; i < n; i++) {
            int left = links[i][0];
            int right = links[i][1];
            if (left >= 0 && left < n) {
                parents[left] = i;
                nodes[i].left = nodes[left];
            }
            if (right >= 0 && right < n) {
                parents[right] = i;
                nodes[i].right = nodes[right];
            }
        }

        List<Integer> roots = findRoot(nodes, parents);
        for (int root : roots) {
            System.out.println("====== Root: " + root + " ======");

            // BFS (한 줄 나열)
            System.out.print("BFS(line): ");
            bfsLine(nodes[root]);
            System.out.println();

            // BFS
            System.out.println("BFS(levels):");
            bfsLevels(nodes[root]);

            // DFS
            System.out.print("Pre : ");
            preOrder(nodes[root]);   System.out.println();

            System.out.print("In  : ");
            inOrder(nodes[root]);    System.out.println();

            System.out.print("Post: ");
            postOrder(nodes[root]);  System.out.println();

            System.out.println();
        }
    }


    static void bfsLine(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null)  q.add(cur.left);
            if (cur.right != null) q.add(cur.right);
        }
    }


    static void bfsLevels(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                System.out.print(cur.value + " ");
                if (cur.left != null)  q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            System.out.println();
        }
    }

    // ===== DFS =====
    static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    static void postOrder(TreeNode root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " "); // ✅ 출력 추가
    }

    // ===== 루트 찾기 =====
    static List<Integer> findRoot(TreeNode[] nodes, int[] parents) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nodes.length; i++) {
            if (parents[i] == -1) result.add(i);
        }
        return result;
    }

    // ===== 노드 =====
    static class TreeNode {
        int value;
        TreeNode left, right;
        public TreeNode(int value) { this.value = value; }
    }
}
