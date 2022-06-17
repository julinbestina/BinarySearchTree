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

    public BinaryNode search(K key) {

        return searchRecursively(root, key);
    }

    private BinaryNode searchRecursively(BinaryNode root, K key) {

        if (root == null || root.key == key) {
            return root;
        }

        if (root.key.compareTo(key) > 0) {
            return searchRecursively(root.left, key);
        } else {
            return searchRecursively(root.right, key);
        }

    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
