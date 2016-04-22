
public class MyBinarySearchTreePlus <T extends KeyedItem<KT>,KT extends Comparable<? super KT>> extends MyBinarySearchTree<T,KT> implements BSTPInterface{

	public int getHeight(){			
		return get_Height(root);
	}


	//Get height helper method
	private int get_Height(TreeNode<T> currentNode){
		if(currentNode==null){
			return 0;
		}
		else{
			int sizeLeft = get_Height(currentNode.getLeftChild());
			int sizeRight = get_Height(currentNode.getRightChild());
			return sizeLeft>sizeRight?sizeLeft+1:sizeRight+1;
		}		
	}

	public int getSize(){
		return get_Size(root);	
	}

	//Get size helper method
	private int get_Size(TreeNode<T> currentNode){
		if(currentNode==null){
			return 0;
		}
		else{
			return get_Size(currentNode.getLeftChild())+ get_Size(currentNode.getRightChild())+ 1;								
		}		
	}


	public String toStringPreorder(){		
		return toString_PreOrder(root);
	}

	//toStringPreOrder helper method
	private String toString_PreOrder(TreeNode<T> currentNode){
		if(currentNode==null){
			return "";
		}
		else{
			String s = currentNode.getItem().getKey() + " ";
			s += toString_PreOrder(currentNode.getLeftChild());
			s += toString_PreOrder(currentNode.getRightChild());	
			return s;
		}

	}

	public String toStringInorder(){

		return toStringInorder(root);
	}
	//toStringInOrderHelper	
	private String toStringInorder(TreeNode<T> currentNode){
		if(currentNode==null){
			return "";
		}
		else{
			String s = "";
			String s2 = "";
			s = toStringInorder(currentNode.getLeftChild());
			s += currentNode.getItem().getKey() + " ";
			s2 = toStringInorder(currentNode.getRightChild());
			return s + s2 ;
		}		
	}


	public String toStringPostorder(){
		return toStringPostorder(root);

	}

	private String toStringPostorder(TreeNode<T> currentNode){

		if(currentNode==null){
			return "";
		}
		else{
			String s = "";
			s += toStringPostorder(currentNode.getLeftChild());		
			s += toStringPostorder(currentNode.getRightChild());
			s += currentNode.getItem().getKey() + " ";
			return s ;
		}
	}

	public BinarySearchTree getCopyOfTree(){
		return null;
	}

}
