package Trees;

public class BinaryTree{
    String name = "";
    BinaryTree left = null;
    BinaryTree right = null;

    public BinaryTree(String self, BinaryTree left, BinaryTree right){
        this.name = self;
        this.left = left;
        this.right = right;
    }
}