package org.bibisam06.tree;
/*
 이진 트리 전위, 후위 중위 순회 구현
*/
public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // 루트 노드 설정
        tree.root = new TreeNode(10);

        // 자식 노드 추가
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(15);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(7);
        tree.root.right.left = new TreeNode(12);
        tree.root.right.right = new TreeNode(20);

        System.out.println("전위 순회 (Preorder):");
        tree.preorder(tree.root);

        System.out.println("\n중위 순회 (Inorder):");
        tree.inorder(tree.root);

        System.out.println("\n후위 순회 (Postorder):");
        tree.postorder(tree.root);
    }

    TreeNode root;

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    // 전위 순회 (Root → Left → Right)
    void preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // 중위 순회 (Left → Root → Right)
    void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.value + " ");
            inorder(node.right);
        }
    }

    // 후위 순회 (Left → Right → Root)
    void postorder(TreeNode node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.value + " ");
        }
    }
}
