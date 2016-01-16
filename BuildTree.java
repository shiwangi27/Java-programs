//BST and Binary Tree data structure, adding removing traversal search min max 
import java.util.*;

class BuildTree
{

//private member root 
	private Node root;

//Constructor
	public BuildTree()
	{
		root = null;
	}


//Check if Tree is Empty 
	public boolean isEmpty()
	{
		if (root == null)
			return true;
		else
			return false; 		
	}

//Insert node in the tree or create one from scratch 
	public void insert(int data)
	{
		root = insert(root,data);
	}

	public static Node insert(Node node, int data)
	{
		if(node == null)
		{
			node = new Node(data);
		}
		else
		{
			if(data<node.data)
			{
				node.left = insert(node.left,data);
			}
			else
			{	
				node.right = insert(node.right,data);
			}
		}
		return node;
	}

//------------------------------------------------------------------------------------
	void insertBT(int data)
	{
		root = insertBT(root, data);
	}

	Node insertBT(Node node, int data)
	{
		if(node == null)
		{
			node = new Node(data);
		}	
		else
		{
		if(node.left == null)
		{
			node.left = insertBT(node.left, data);
		}
		else
		{
			node.right = insertBT(node.right,data);
		}
	}
		return node;
	}


	void countNodes()
	{
		int count = countNodes(root);
		System.out.println(count);

	}

	int countNodes(Node node)
	{
		if(node == null)
			return 0;
		else
		{	
			int count = 1; 
			count += countNodes(node.left);
			count += countNodes(node.right);
		    return count;
		}
	}

 	void search(int data)
	{
		boolean found = search(root,data);
		System.out.println(found);
	}

	boolean search(Node node,int data)
	{
		boolean found = false;

		while(node!=null && !found)
		{
			if(data < node.data)
			{
				node = node.left;		
			}
			else if(data > node.data)
			{
				node = node.right;
			}
			else
			{
				found = true;
				break;
			}

			found = search(node,data);
		}
		return found;
	}

	void findMinData()
	{
		int min = findMinData(root);
		System.out.println("Minimum number : " + min);
	}

	int findMinData(Node node)
	{
		if(node == null )
			return -1;

		while(node.left != null)
		{
			node = node.left;
		}
		return node.data;
	}


	void findMaxData()
	{
		int max = findMaxData(root);
		System.out.println("Maximum number : " + max);
	}

	int findMaxData(Node node)
	{
		if(node == null )
			return -1;

		while(node.right != null)
		{
			node = node.right;
		}
		return node.data;
	}



	void delete(int data)
	{
		root = delete(root,data);
		System.out.println("Deleted : " + root.data);
	}

	Node delete(Node node, int data)
	{
		if (node == null)
		{
			return node;
		}
		else if(data < node.data)
		{
			node.left = delete(node.left,data);
			System.out.println(node.left.data);
		}
		else if(data > node.data)
		{
			node.right = delete(node.right,data);
			System.out.println(node.right.data);

		}
		else
		{
		
			//Case 1: No child
			if(node.left ==null && node.right == null)
			{
				node = null;
				return node;
			}
			//Case 2: 1 child
			else if(node.left == null)
			{
				node = node.right;
				return node;
			}
			else if(node.right == null)
			{
				node = node.left;
				return node;
			}
			//Case 3: 2 children ---> replace with min in the right subtree
			else
			{
				Node temp = findMin(node.right);
				node.data = temp.data;
				node.right = delete(node.right,temp.data); 
				return node;
			}

		}
		System.out.println(node.data);
		return node;

	}

	Node findMin(Node node)
	{

		while(node.left != null)
		{
			node = node.left;
		}
		return node;
	}


	Node findMax(Node node)
	{

		while(node.right != null)
		{
			node = node.right;
		}
		return node;
	}

//Inorder Traversal -- parent in between 
	public void inorder()
	{
		inorder(root);
	}
	public void inorder(Node r)
	{
		if(r != null)
		{
			inorder(r.left);
			System.out.println("Traversed inorder " + r.data);
			inorder(r.right);
		}
	}

//Preorder traversal -- parent first 
	public void preorder()
	{
		preorder(root);
	}
	public void preorder(Node r)
	{
		if(r != null)
		{
			System.out.println("Traversed preorder " + r.data);
			preorder(r.left);
			preorder(r.right);
		}
	}

//Postorder traversal -- parent last
	public void postorder()
	{
		postorder(root);
	}
	public void postorder(Node r)
	{
		if(r != null)
		{
			postorder(r.left);
			postorder(r.right);
			System.out.println("Traversed postorder " + r.data);
		}
	}



	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BuildTree bst = new BuildTree();

		//bst.insert(10);
		//bst.insert(8);
		//bst.insert(12);
		//bst.insert(5);
		//bst.insert(9);
		//bst.insert(13);
		//bst.insert(15);


		bst.insertBT(666);
		bst.insertBT(555);
		bst.insertBT(444);
		bst.insertBT(333);
		bst.insertBT(222);
		bst.insertBT(111);

		bst.inorder();

		//bst.inorder();
		//bst.preorder();
		//bst.postorder();
		
		//bst.search(23);
		
		//bst.delete(8);
		bst.findMinData();
		bst.findMaxData();

		bst.countNodes();
	}

	
}
