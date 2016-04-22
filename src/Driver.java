import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {
	
	/*
	 * Purpose: Data Structure and Algorithms Lab 11 Problems 1, 2, and 3
	 * Status: Complete and thoroughly tested
	 * Last update: 04/22/16
	 * Submitted:  04/22/16
	 * Comment: test suite and sample run attached
	 * @author: Sal Ficara
	 * @version: V1
	 */

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		MyBinarySearchTreePlus<Data,String> MBST = new MyBinarySearchTreePlus();
		MBST.insert(new Data("7"));
		MBST.insert(new Data("5"));
		MBST.insert(new Data("1"));
		MBST.insert(new Data("3"));
		MBST.insert(new Data("6"));
		MBST.insert(new Data("2"));
		MBST.insert(new Data("4"));
		MBST.insert(new Data("0"));
		MBST.insert(new Data("9"));
		MBST.insert(new Data("8"));

		
		while(true){
			Integer select = Integer.parseInt(read.readLine());
			System.out.println("\t1.  Insert key in BST");
			System.out.println("\t2.  Delete key from BST");
			System.out.println("\t3.  Search for key in BST");
			System.out.println("\t4.  Display height of BST");
			System.out.println("\t5.  Display size of BST");
			System.out.println("\t6.  Display content of BST in inorder");
			System.out.println("\t7.  Display content of BST in preorder");
			System.out.println("\t8.  Display content of BST in postorder");
			System.out.println("\t9.  Build copy of the tree, and test it");
			System.out.println("\t10. Exit program");
			System.out.println("Make a selection: " + select);

			try{
				switch(select){			
				case 1: 
						String currentKey = read.readLine();
						System.out.println("Enter key to insert into tree : " + currentKey);
						TreeNode<Data> newNode;						
						if(MBST.root==null){
							newNode = new TreeNode<Data>(new Data(currentKey));
							MBST.root = newNode;
						}
						else{							
							MBST.insert(new Data(currentKey));
						}
						
						break;
				case 2: 
						String removeKey = read.readLine();
						System.out.println("Enter a key to remove: " + removeKey);						
						MBST.delete(MBST.retrieve(removeKey));
						System.out.println("The key " + removeKey + " has been removed");
						break;
				case 3: 
						String searchKey = read.readLine();
						System.out.println("Enter a key to search for: " + searchKey);						
						Data n = MBST.retrieve(searchKey);
						System.out.println("The key " + n.getKey() + " has been found");
						break;
				
				case 4: 
						System.out.println("The binary tree height is : " + MBST.getHeight());
						break;
						
				case 5: 
						System.out.println("The Binary tree size is: " + MBST.getSize());						
						break;
						
				case 6: 
						System.out.println("Binary tree contents displayed In-Order: " + 
						MBST.toStringInorder());
						break;
				case 7: 
						System.out.println("Binary tree contents displayed Pre-Order: " + 
						MBST.toStringPreorder());
						break;
						
				case 8: 
						System.out.println("Binary tree contents displayed Post-Order: " + 
						MBST.toStringPostorder());
						break;
						
				case 9: 						
						break;
				
				case 10: 
						System.out.println("Goodbye");
						System.exit(0); 
						 break;


				}
			}

			catch(IOException e){

			}
		}
	}
}
