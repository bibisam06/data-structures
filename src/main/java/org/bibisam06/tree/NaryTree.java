package org.bibisam06.tree;

import java.util.ArrayList;
import java.util.List;

/*
    일반 트리 순회 구현
*/
public class NaryTree {
    public static void main(String[] args) {
        NaryTree tree = new NaryTree();

        tree.root = new TreeNode(10); // 루트 트리 생성

        TreeNode nodeA = new TreeNode(5);
        TreeNode nodeB = new TreeNode(7); // 자식 노드 생성
        tree.root.children.add(nodeA);
        tree.root.children.add(nodeB);

        TreeNode nodeC = new TreeNode(9);
        nodeA.children.add(nodeC);

        TreeNode nodeD = new TreeNode(8);
        TreeNode nodeE = new TreeNode(6);
        nodeB.children.add(nodeD);
        nodeB.children.add(nodeE);

        for(TreeNode node : tree.root.children) {
            System.out.println("자식  : " + node.value );
        }

    }

    TreeNode root;

    static class TreeNode{
        int value;
        List<TreeNode> children;

        public TreeNode(int value){
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
}
