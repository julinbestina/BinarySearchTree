package com.bridgelabz.binary;

public class BinaryMain {
    public static void main(String[] args) {

        IBinaryTree binary = new BinaryTree();

        binary.add(56);
        binary.add(30);
        binary.add(70);

        System.out.println(binary);
    }
}