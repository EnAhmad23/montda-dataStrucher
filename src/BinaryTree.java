import java.util.ArrayList;


public class BinaryTree {
    private ArrayList<Node> tree;

    public BinaryTree() {
        tree = new ArrayList<>();
    }
    public void insert(int value) {
        Node newNode = new Node(value);
        tree.add(newNode);

        if (tree.size() == 1) {
            return; // The first node is always the root
        }

        int currentIndex = tree.size() - 1;
        int parentIndex = (currentIndex - 1) / 2;

        if (currentIndex % 2 == 0) {
            tree.get(parentIndex).rightChild = currentIndex;
        } else {
            tree.get(parentIndex).leftChild = currentIndex;
        }
    }

    public void inOrderTraversal(int index) {
        if (index >= tree.size() || index == -1) {
            return;
        }

        Node node = tree.get(index);
        inOrderTraversal(node.leftChild);
        System.out.print(node.value + " ");
        inOrderTraversal(node.rightChild);
    }
    public void preOrderTraversal(int index) {
        if (index >= tree.size() || index == -1) {
            return;
        }

        Node node = tree.get(index);
        System.out.print(node.value + " ");
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }
    public void postOrderTraversal(int index) {
        if (index >= tree.size() || index == -1) {
            return;
        }

        Node node = tree.get(index);
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.print(node.value + " ");
    }
    class Node {
        int value;
        int leftChild;
        int rightChild;

        public Node(int value) {
            this.value = value;
            this.leftChild = -1;
            this.rightChild = -1;
        }
    }


}
