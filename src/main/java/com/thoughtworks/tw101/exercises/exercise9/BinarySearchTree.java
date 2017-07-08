package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Duvall_Lanell on 7/7/17.
 */
public class BinarySearchTree {

    private Node root = null;
    private List<String> namesList;

    public BinarySearchTree(Node n) {
        root = n;
        namesList = new ArrayList<String>();
    }

    public Node getRoot() {
        return root;
    }

    public void add(String str) {
        root.add(str);
    }

    public List<String> names(Node start) {
        if (start.getLeft() != null) {
            names(start.getLeft());
        }
        namesList.add(start.getName());
        if (start.getRight() != null) {
            names(start.getRight());
        }

        return namesList;
    }
}
