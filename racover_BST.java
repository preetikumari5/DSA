import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    public static void recoverTree(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode lastProcessed = null;
        TreeNode[] swapped = new TreeNode[2];

        while (!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            if (lastProcessed != null && lastProcessed.val > current.val) {
                if (swapped[0] == null) {
                    swapped[0] = lastProcessed;
                    swapped[1] = current;
                } else {
                    swapped[1] = current;
                    break;
                }
            }
            lastProcessed = current;
            current = current.right;
        }

        // Swap the incorrect nodes' values
        if (swapped[0] != null && swapped[1] != null) {
            int temp = swapped[0].val;
            swapped[0].val = swapped[1].val;
            swapped[1].val = temp;
        }
    }

    public static void printInorder(TreeNode node) {
        if (node == null) return;
        printInorder(node.left);
        System.out.print(" " + node.val);
        printInorder(node.right);
    }

    public static void main(String[] args) {
        // Example: Constructing a BST where two nodes are swapped
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(2); // The incorrect node

        System.out.println("Before Recovery (Inorder):");
        printInorder(root);

        recoverTree(root);

        System.out.println("\nAfter Recovery (Inorder):");
        printInorder(root);
    }
}
