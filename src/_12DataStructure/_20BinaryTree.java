package _12DataStructure;

public class _20BinaryTree {
 
	Node root;
	static Node temp = null;
	class Node{
		int data;
		Node left,right;
		
		
		public Node(int data){
			this.data=data;
			left = null;
			right = null;
		}
	}
	
	public void insertLeft(int value) {
		
		if(root==null) {
			Node newNode = new Node(value);
			root = newNode;
			System.out.println(root);
			temp = root;
			System.out.println(temp.left );
			System.out.println(temp.right);
			System.out.println(temp.data);
			System.out.println("--------------");
		}else {
			Node newNode = new Node(value);
			
			temp.left = newNode; 
			System.out.println(temp.left );
			System.out.println(temp.right);
			temp = newNode;
			System.out.println("******");
////			System.out.println(root);
//			System.out.println(temp);
		
			System.out.println(temp.data);
		}
	}
	
	public void insertRight(int value) {
		if(root==null) {
			Node newNode = new Node(value);
			root = newNode;
			temp = root;
			System.out.println(temp.data);
			System.out.println("left"+ temp.left);
			System.out.println("right"+temp.right);
			System.out.println("-----***-----");
		}else {
			Node newNode = new Node(value);
			temp.right = newNode; 
			temp = newNode;
			System.out.println(temp.data);
			System.out.println("left"+ temp.left);
			System.out.println("right"+temp.right);
			System.out.println("------------");
		}
	}
	
	
	private void rootNull() {
		
	}
}
