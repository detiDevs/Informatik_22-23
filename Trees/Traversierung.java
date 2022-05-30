package Trees;

public class Traversierung {
    
    public static void preorderTraversierung(BinaryTree b){
        if(b!=null){
            System.out.println(b.name);
        }
        if(b.left!=null){
            preorderTraversierung(b.left);
        }
        if(b.right!=null){
            preorderTraversierung(b.right);
        }
    }
    public static void inorderTraversierung(BinaryTree b){
        if(b.left!=null){
            inorderTraversierung(b.left);
        }
        if(b!=null){
            System.out.println(b.name);
        }
        if(b.right!=null){
            inorderTraversierung(b.right);
        }
    }

    public static void postorderTraversierung(BinaryTree b){

        if(b.left!=null){
            postorderTraversierung(b.left);
        }
        if(b.right!=null){
            postorderTraversierung(b.right);
        }
        if(b!=null){
            System.out.println(b.name);
        }
    }

}
