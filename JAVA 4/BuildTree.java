//Write a program to build a binary tree and return its root
import java.util.*;
public class BuildTree {
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
       static int idx = -1; // Instance variable

        public Node build(int nodes[]) {
            idx++; // Move to the next element in the array

            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = build(nodes);
            newnode.right = build(nodes);

            return newnode;
        }

        public static void preorder(Node root){
            if(root==null){
                return ;
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);

        }

        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data+ " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root==null){
                return ;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+ " ");
        }
        
        public static void levelorder(Node root){
            if(root==null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data+" ");
                    if(curr.left != null){
                        q.add(curr.left);
                    } 
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);

        return Math.max(left,right)+1;

    }

    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int l= count(root.left);
        int r= count(root.right);

        return l+r+1;
    }

    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int l = sum(root.left);
        int r = sum(root.right);

        return l+r+root.data;
    }


    public static int diameter1(Node root){
        if(root==null){
            return 0;
        }

        int leftht=height(root.left);
        int rightht=height(root.right);
        int leftdim=diameter1(root.left);
        int rightdim=diameter1(root.right);

        int self=leftht+rightht+1;

        return Math.max(self,Math.max(leftdim,rightdim));
    }

    static class Info{
        int dim;
        int ht;

        public Info(int dim , int ht){
            this.dim=dim;
            this.ht=ht;
        }

    }

    public static Info diameter(Node root){
        if(root==null){
            return new Info(0,0);
        }
        Info left=diameter(root.left);
        Info right=diameter(root.right);

        int diam=Math.max(Math.max(left.dim , right.dim ),left.ht+right.ht+1);

        int ht=Math.max(left.ht, right.ht)+1;

        return new Info(diam , ht);
    }

    public static boolean isIdentical(Node node , Node subroot){
        if(node == null && subroot==null){
            return true;
        }else if(node == null || subroot ==null || node.data!=subroot.data){
            return false;
        }

        if(!isIdentical(node.left,subroot.left)){
            return false;
        }
        if(!isIdentical(node.right,subroot.right)){
            return false;
        }
        return true;
    }

    public static boolean issubtree(Node root , Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root , subroot)){
                return true;
            }
        }

        

        return issubtree(root.left,subroot)||issubtree(root.right,subroot);

    }

    static class info{
        int hd;
        Node node;

        public info(Node node , int hd){

            this.hd=hd;
            this.node=node;
        }
    }

    public static void topview(Node root) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
    
        int min = 0;
        int max = 0;
    
        q.add(new info(root, 0));
        q.add(null);
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    q.add(new info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }
    
        for (int i = min; i <= max; i++) {
            Node node = map.get(i);
            if (node != null) {
                System.out.print(node.data + " ");
            }
        }
        System.out.println();
    }

    public static void klevel(Node root,int level ,int k){
        if(root==null){
            return;
        }

        if(level==k){
            System.out.print(root.data+" ");
            return;
        }

        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);
    }

    public static boolean getpath(Node root,int n , ArrayList<Node> path){
        if(root==null){
            return false;
        }
        path.add(root);
        if(root.data==n){
            return true;
        }

        boolean left=getpath(root.left,n,path);
        boolean right=getpath(root.right,n,path);

        if(left||right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
    
        getpath(root, n1, path1);
        getpath(root, n2, path2);
    
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        
        Node lca = path1.get(i - 1);
        return lca;
    }
    

    public static Node lca2(Node root,int n1 , int n2){


        if(root==null || root.data==n1 ||root.data==n2){
            return root;
        }
        if(root.data==n1 ||root.data==n2){
            return root;
        }

        Node left=lca2(root.left,n1,n2);
        Node right=lca2(root.right,n1,n2);

        if(right==null){
            return left;
        }
        if(left==null){
           return right;
        }return root;


    }

    public static int lcadist(Node root , int n){
        if(root==null){
            return -1;

        }
        if(root.data==n){
            return 0;
        }

       int left= lcadist(root.left,n);
        int right= lcadist(root.right,n);

        if(left==-1 && right==-1){
            return -1;
        }
        else if(left==-1){
            return right+1;
        }else{
            return left+1;
        }
    }

    public static int mindist(Node root , int n1 , int n2){
        Node lca=lca2(root,n1,n2);
        int dist1=lcadist(lca,n1);
        int dist2=lcadist(lca,n2);

        return dist1+dist2;
    }

    public static int kanc(Node root , int n , int k){

        if(root==null){
            return -1;
        }

        if(root.data==n){
            return 0;
        }

        int left=kanc(root.left,n,k);
        int right=kanc(root.right,n,k);

        if(left==-1 && right==-1){
            return -1;
        }

        int max=Math.max(left,right);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
    }

    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int left=transform(root.left);
        int right=transform(root.right);

        int data=root.data;

        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=newleft+left+newright+right;
        return data;

    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+ " ");
        preorder(root.left);
        preorder(root.right);

    }


    public static boolean univalued(Node root){
        if(root==null){
            return true;
        }
        if(root.left!=null && root.data!=root.left.data){
            return false;
        }
        if(root.right!=null && root.data!=root.right.data){
            return false;
        }

        return univalued(root.left) && univalued(root.right);
    }

    public static Node inverted(Node node){
        if(node==null){
            return node;
        }

        Node newnode=new Node(node.data);
        Node left=inverted(node.left);
        Node right=inverted(node.right);

        newnode.left=right;
        newnode.right=left;

        return newnode;

    }


    public static Node del(Node root, int x){
        if(root==null){
            return null;

        }

        root.left=(del(root.left,x));
        root.right=(del(root.right,x));

        if(root.data==x && root.left==null && root.right==null){
            return null;
        }
        return root;
    }

    static HashMap<String , Integer> m ;

    static String iinorder(Node node){
        if(node==null){
            return "";
        }

        String str="(";
        str+=iinorder(node.left);
        str+=Integer.toString(node.data);
        str+=iinorder(node.right);
        str+=")";

        if(m.get(str)!=null && m .get(str)==1){
            System.out.print(node.data+"");

        }
        if(m.containsKey(str)){
            m.put(str,m.get(str)+1);
        }else{
            m.put(str,1);
        }
        return str;
    }
    static void dupli(Node root){
        m=new HashMap<>();
        iinorder(root);


    }
    int val;

    public  int maxpath(Node root){
        
        if(root==null){
            return 0;
        }

        int right=maxpath(root.right);
        int left=maxpath(root.left);

        int max=Math.max(Math.max(right , left)+root.data,root.data);

        int max_top=Math.max(max,left+right+root.data);

        val=Math.max(val,max_top);
        return max;
    }
    public static void main(String args[]) {
        // int nodes[] = {
        //     1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1
        // };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.build(nodes);
    
        // // Print the value of the root node
        // //System.out.print("Root Node Value: " + root.data);

        // //tree.preorder(root);
        // //tree.inorder(root);
        // //tree.postorder(root);
        // tree.levelorder(root);
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);


        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter1(root));
        System.out.println(diameter(root).dim);
        System.out.println(diameter(root).ht);
        System.out.println(issubtree(root , subroot));
        topview(root);

        //int k=3;
        //klevel(root,1,k);

        int n1=4, n2=6;
        System.out.println(lca(root,n1,n2).data);
        System.out.println(lca2(root,n1,n2).data);
        System.out.println(mindist(root,n1,n2));

        int k=1;
        int n=5;
        System.out.println(kanc(root,n,k));

        transform(root);
        preorder(root);

        System.out.println(univalued(root));
    }
    
}
