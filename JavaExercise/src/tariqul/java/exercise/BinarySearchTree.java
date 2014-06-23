package tariqul.java.exercise;

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int nodeValue){
		data = nodeValue;
		left = null;
		right = null;
	}
	public void setLeft(TreeNode c){
		left = c;
	}
	public void setRight(TreeNode c){
		right = c;
	}
	public TreeNode getLeft(){
		return left;
	}
	public TreeNode getRight(){
		return right;
	}
	public int getData(){
		return data;
	}

}

public class BinarySearchTree {
	TreeNode root;
	public BinarySearchTree() {
		root = null;
	}
	public boolean isEmpty()
    {
        return (root == null) ? true : false;
    }
	
	//-------------------
	// Insert into BST
	//-------------------
	public void insert(int data)
    {
        root = doRecursiveInsert(root, data);
    }
    private TreeNode doRecursiveInsert(TreeNode node, int data)
    {
        if (node == null)
            node = new TreeNode(data);
        else
        {
            if (data <= node.getData())
                node.left = doRecursiveInsert(node.left, data);
            else
                node.right = doRecursiveInsert(node.right, data);
        }
        return node;
    }
	
    //--------------------------
    // Tree Traversal 
    //---------------------------
    // **** In-order traversal *****
    public void inorder()
    {
    	doInOrderTraversal(root);
    }
    private void doInOrderTraversal(TreeNode r)
    {
        if (r != null)
        {
        	doInOrderTraversal(r.getLeft());
            System.out.print(r.getData() +" ");
            doInOrderTraversal(r.getRight());
        }
    }   
    
    // **** Pre-order traversal *****
    public void preorder()
    {
    	doPreOrderTraversal(root);
    }
    private void doPreOrderTraversal(TreeNode r)
    {
        if (r != null)
        {
            System.out.print(r.getData() +" ");
            doPreOrderTraversal(r.getLeft());
            doPreOrderTraversal(r.getRight());
        }
    }      
    
    // **** Post-order traversal *****
    public void postorder()
    {
        doPostOrderTraversal(root);
    }
    private void doPostOrderTraversal(TreeNode r)
    {
        if (r != null)
        {
        	doPostOrderTraversal(r.getLeft());
        	doPostOrderTraversal(r.getRight());
            System.out.print(r.getData() +" ");
        }
    }      

}
