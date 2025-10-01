package org.bibisam06.tree;
/*
완전 이진 트리의 경우
*/
public class CompleteBinaryTree {
    public static void main(String[] args) {
        int[] tree = {0, 1, 2, -1, -1, 3, 4};

        for(int i =0; i< tree.length; i++) {
            System.out.println("현재 노드 : " + tree[i]);

            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if(left < tree.length) {
                System.out.println("왼쪽 자식 : " + tree[left]);
            }

            if(right < tree.length) {
                System.out.println("오른쪽 자식 : " + tree[right]);
            }
        }
    }
}
