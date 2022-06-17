package com.bridgelabz.binary;

public class BinaryTree<K extends Comparable> implements IBinaryTree<K> {
    private BinaryNode<K> root;

    public void add(K key) {
        root = addRecursively(root, key);
    }

    private BinaryNode<K> addRecursively(BinaryNode<K> current, K key) {
        if (current == null)
            return new BinaryNode<>(key);

        int compareResult = key.compareTo(current.key);

        if (compareResult == 0) {
            return current;
        } else if (compareResult > 0) {
            current.right = addRecursively(current.right, key);
        } else {
            current.left = addRecursively(current.left, key);
        }
        return current;
    }

    public int size() {
        return getSizeRecursively(root);
    }

    private int getSizeRecursively(BinaryNode<K> root) {
        return root == null ? 0 : 1 + getSizeRecursively(root.left) + getSizeRecursively(root.right);
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
