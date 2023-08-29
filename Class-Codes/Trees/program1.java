import java.util.*;

class BinaryTree{
	
		
	/*	why linked list
		efficient - O(log n )
		Ordered Storage
		Cost Efficient , dont need restructuring
		
		limitation -  unbalanced binary tree
		
		

		 Types of Binary Trees 

		 1. Complete Bianry Tree
		 2. Full/Struct Binary Tree - 0/2 Children
		 3. Perfect Binary Tree - all levels are filled
		 4. Height Balanced Tree - average height O(log n )
		 5. Screwed Bianry Tree - Every BT have single child (linekd list )
		 6. Order Binary Tree - every node has some property(left smalller right Bigger)
		 
		 Properties {
		 	
			1.Perfect Binary Tree 
				Total no of Node = 2^(n+1)-1

				Totak no of leaf nodes - 2^height

			2. No of leaf nodes = 1 + no of interal nodes with 2 children (not including root )
		 }

	*/	
		private Node root;
		
		public BinaryTree(){
			root=null;	
		}

       		private static class Node{
			int value ;
			Node left;
			Node right;

			public Node(int value){
				this.value = value;
			}
		}	
		
		

		// insert elements
		
		public void insert(Scanner scanner){
		
			boolean validInput = false;
		while(!validInput){
		try{	
			System.out.println("Enter the root Node: ");
			int value = scanner.nextInt();
			root = new Node(value);
			insert(scanner,root);
			validInput = true;

		}catch(InputMismatchException e){
			
			System.out.println("Invalid Input , please enter a valid integer");
			scanner.nextLine();

		}
		}
		}

		private void insert(Scanner scanner , Node node){
			
			boolean validInput=false;

		while(!validInput){			
		try{	
			System.out.println("Do you want to enter left of "+node.value);
			boolean left = scanner.nextBoolean();

			if(left){
				
				System.out.println("Enter the value of left of "+node.value);
				int value= scanner.nextInt();
				node.left= new Node(value);
				insert(scanner , node.left);
		
			}	
			
			System.out.println("Do you want to enter right of "+ node.value);
			boolean right = scanner.nextBoolean();

			if(right){
				
				System.out.println("Enter the value of the right of "+ node.value);
				int value=scanner.nextInt();
				node.right= new Node(value);
				insert(scanner,node.right);
			}
			validInput = true;

		}catch(InputMismatchException e){
			
			System.out.println("Invalid input , please enter true or false ");
			scanner.nextLine();
		}
	
		}
		}

		public void display(){
		
		display(root,"");
		
		}	
		private void display(Node node , String indent){
			
			if(node==null){
				return;
			}

			System.out.println(indent + node.value);
			display(node.left,indent+"\t");
			display(node.right,indent+"\t");


		}
		public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);
			BinaryTree tree = new BinaryTree();
			tree.insert(scanner);
			tree.display();
	
	}
}
