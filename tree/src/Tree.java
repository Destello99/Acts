public class Tree {

    Node root;

    public Tree(){
        root = null;
    }
    public Node insertRec(Node root, int data){
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(data < root.data  ) {
            //recursive call for left subtree
            root.left = insertRec(root.left, data);
        } else if ( data > root.data) {
            //recursive call for right subtree
            root.right = insertRec(root.right, data);
        }
        return root;
    }

   public void preOrder(Node root){
        //ROOT - LEFT - RIGHT
        if (root != null){
            System.out.println(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
   }

   public void postOrder(Node root){
       if (root != null){
           //LEFT - RIGHT - ROOT
           postOrder(root.left);
           postOrder(root.right);
           System.out.println(root.data+ " ");
       }
   }
   public void inOrder(Node root){
       if (root != null){
           //LEFT - ROOT- RIGHT
           inOrder(root.left);
           System.out.println(root.data+ " ");
           inOrder(root.right);
       }
   }
   //Wrapper method
   public void insert(int data) {
       root = insertRec(root, data);
   }
   public void preOrderPrint(){
        preOrder(root);
   }
   public void postOrderPrint(){
       postOrder(root);
    }
    public void inOrderPrint(){
        inOrder(root);
    }
    /* TODO problem count number of nodes in tree including root */


    int leftCount = 0;
    int rCounter = 0;
    public  int leftNodeCounter(Node root){
        if(root != null){
            leftCount++;
            leftNodeCounter(root.left);}
        return  leftCount;
    }
    public int rightNodeCounter(Node root){
        if(root != null){
            rCounter++;
            rightNodeCounter(root.right);
        }
        return rCounter;
    }

    //Wrapper Methods
    public int lCounter(){
        return leftNodeCounter(root);
    }
    public int RCounter(){
        return rightNodeCounter(root);
    }
}
