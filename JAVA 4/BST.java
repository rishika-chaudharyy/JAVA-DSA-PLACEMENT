import java.util.*;

//Build a BST
public class BST {

    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    public static Node insert(Node root , int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left,val);

        }else{
            root.right=insert(root.right,val);
        }
        return root;

    }



    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //Search for a key in BST

    public static boolean search(Node root , int key){
        if(root==null){
           return false;
        }
        
        if(root.data==key){
            return true;
        }

        if(root.data>key){
            return search(root.left,key);
        }

        else{
            return search(root.right,key);
        }
    }

    //Deleting a node

    //finding inorder successor

    public static Node findinorder(Node root){
        while(root.left != null){
            root=root.left;
        }
        return root;
    }

    public static Node del(Node root  , int val){
        if(root.data<val){
            root.right=del(root.right,val);
        }else if(root.data>val){
            root.left=del(root.left,val);
        }else{
            if(root.left==null && root.right==null){
                return null;
            }

            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            Node IS=findinorder(root.right);
            root.data=IS.data;
            del(root.right,IS.data);
        }
        return root;
    }


    //Printing in range

    public static void printinrange(Node root , int k1   , int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printinrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinrange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printinrange(root.left,k1,k2);

        }else{
            printinrange(root.right,k1,k2);
        }
    }



    //Print root to leaf

    public static void printpath(ArrayList<Integer> path ){
        for(int i = 0 ; i<path.size() ;i++){
            System.out.print(path.get(i)+"-->");
        }
        System.out.println("Null");
    }

    public static void root2leaf(Node root , ArrayList<Integer> path){
        if(root==null){
            return;
        }

        path.add(root.data);
        if(root.right==null && root.left==null){
            printpath(path);
        }
        root2leaf(root.left,path);
        root2leaf(root.right,path);

        path.remove(path.size()-1);

    }


    //Validating BST

    public static boolean isValid(Node root , Node min , Node max){
        if(root==null){
            return true;
        }

        if(min != null && root.data<=min.data){
            return false;

        }
        else if(max != null && root.data>=max.data){
            return false;
        }

        return isValid(root.left , min, root) && isValid(root.right , root , max);
    }


    //Mirror of a BST

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }

        Node left=mirror(root.left);
        Node right= mirror(root.right);

        root.right=left;
        root.left=right;
        return root;
    }

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String args[]){

        //Checking build
        int values[]={8,5,10,3,6,11};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);

        }

        inorder(root);

        //Checkng search
        if(search(root,12)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }


        //delete search
        // root=del(root,1);
        // System.out.println();
        // inorder(root);

        //printing in range
        printinrange(root,5,10);

        //print root to leaf
        root2leaf(root,new ArrayList<>());

        //Validating BST
        if(isValid(root,null,null)){
            System.out.println("Valid");

        }else{
            System.err.println("Invalid");
        }
        root=mirror(root);
        preorder(root);

        
    }
}
