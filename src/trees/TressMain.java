package trees;

public class TressMain {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        Tree tree1 = new Tree();
        tree1.insert(7);
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(8);
        tree1.insert(10);
        System.out.println("Pre-Order");
        tree.traversePreOrder();

        System.out.println("In-Order");
        tree.traverseInOrder();

        System.out.println("Post-Order");
        tree.traversePostOrder();

        System.out.println("Find Node 6");
        System.out.println(tree.find(6));

        System.out.println("Height of tree");
        System.out.println(tree.height());

        System.out.println("Min Value of tree");
        System.out.println(tree.min());

        System.out.println("If Trees are equal");
        System.out.println(tree.equals(tree1));

        System.out.println("If Trees is Valid BST");
        System.out.println(tree.isBinarySearchTree());

        System.out.println("Nodes at Distance 2"+ tree.getNodesAtDistance(2));

        System.out.println("Traverse level order");
        tree.traverseLevelOrder();

    }
}
