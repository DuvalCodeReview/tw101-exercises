package com.thoughtworks.tw101.exercises.exercise9;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public String getName() {
        return name;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void add(String nameOfNewNode) {

        if (nameOfNewNode.compareToIgnoreCase(name) <= 0) {

            if (left == null) {
                left = new Node(nameOfNewNode);
            } else {
                left.add(nameOfNewNode);
            }

        } else {

            if (right == null) {
                right = new Node(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }

        }
    }
}