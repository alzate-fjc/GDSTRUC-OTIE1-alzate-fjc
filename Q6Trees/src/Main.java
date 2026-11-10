
public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(-5);
        binaryTree.insert(27);
        binaryTree.insert(150);
        binaryTree.insert(-57);
        binaryTree.insert(10);
        binaryTree.insert(68);
        binaryTree.insert(46);
        binaryTree.insert(24);
        binaryTree.insert(532);

        System.out.println("ASCENDING:");
        binaryTree.traverseInOrder();

        System.out.println("\nDESCENDING:");
        binaryTree.traverseDesc();

        System.out.println("\nMin. Node: " + binaryTree.getMin());

        System.out.println("Max. Node: " + binaryTree.getMax());

        int findIndex = 10;

        System.out.println("\nNode with value " + findIndex + " = "
                + binaryTree.get(findIndex));
    }
}
