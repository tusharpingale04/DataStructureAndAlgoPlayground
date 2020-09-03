package trees;

import java.util.ArrayList;

public class Tree {

    private Node root;

    private static class Node{
        int value;
        Node leftChild;
        Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value){
        var node = new Node(value);
        if(root == null){
            root = node;
            return;
        }
        var current = root;
        //Checking if current node has value less or greater than inserted value
        while (true){
            if(value < current.value){
                if(current.leftChild == null){
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            }else{
                if(current.rightChild == null){
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value){
        var current = root;
        while (current != null){
            if(value < current.value){
                current = current.leftChild;
            }else if(value > current.value){
                current = current.rightChild;
            }else {
                return true;
            }
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }

    private void traversePreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traverseInOrder(Node root){
        if(root == null){
            return;
        }
        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    private void traversePostOrder(Node root){
        if(root == null){
            return;
        }
        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height(){
        return height(root);
    }

    private int height(Node root) {
        if(root == null)
            return -1;
        if(isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftChild),height(root.rightChild));
    }

    public int min(){
        return min(root);
    }

    //O(n)
    private int min(Node root){
        if(isLeaf(root)){
            return root.value;
        }
        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left,right),root.value);
    }

    //O(log n)
    public int minBst(){
        if(root == null){
            throw new IllegalArgumentException();
        }
        var current = root;
        var last =root;
        while (current != null){
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    private boolean isLeaf(Node root){
        return root.leftChild == null && root.rightChild == null;
    }

    public boolean equals(Tree other){
        if(other == null){
            return false;
        }
        return equals(root,other.root);
    }

    private boolean equals(Node first, Node second){
        if(first == null && second == null){
            return true;
        }
        if(first != null && second != null){
            return first.value == second.value
                    && equals(first.leftChild,second.leftChild)
                    && equals(first.rightChild,second.rightChild);
        }
        return false;
    }

    public boolean isBinarySearchTree(){
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isBinarySearchTree(Node root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.value < min || root.value > max){
            return false;
        }
        return isBinarySearchTree(root.leftChild, min, root.value -1)
                && isBinarySearchTree(root.rightChild, root.value+1, max);
    }

    private void printNodesAtDistance(Node root,int distance,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(distance == 0){
            list.add(root.value);
            return;
        }
        printNodesAtDistance(root.leftChild,distance -1,list);
        printNodesAtDistance(root.rightChild,distance -1,list);
    }

    public ArrayList<Integer> getNodesAtDistance(int distance){
        var list = new ArrayList<Integer>();
        printNodesAtDistance(root, distance,list);
        return list;
    }

    public void traverseLevelOrder(){
        for(int i=0; i<= height(); i++){
            for(var item: getNodesAtDistance(i)){
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}
