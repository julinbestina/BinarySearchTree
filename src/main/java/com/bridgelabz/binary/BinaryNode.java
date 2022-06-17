package com.bridgelabz.binary;

public class BinaryNode<K extends Comparable> {

    K key;
    BinaryNode<K> left;
    BinaryNode<K> right;

    public BinaryNode(K key) {

        this.key = key;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "key=" + key +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

