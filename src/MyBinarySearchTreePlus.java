
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
			return get_Size(currentNode.getLeftChild())+get_Size(currentNode.getRightChild())+1;								
		}		
	}
	

	public String toStringPreorder(){
		String s1 = "";
		String s2 = "";
		if(root.getLeftChild()!=null){
			s1 += toStringPreOrder(root.getLeftChild(), s1);
		}
		if(root.getRightChild()!=null){
			s2 += toStringPreOrder(root.getRightChild(), s2);
		}
		
		return root.getItem().getKey() + s1 + s2;
	}
	
	//toStringPreOrder helper method
	private String toStringPreOrder(TreeNode<T> node, String s){
		if(node.getLeftChild()==null && node.getRightChild()==null){
			s += (String)node.getItem().getKey();
		}
		else if(node.getLeftChild()!=null){
			s += toStringPreOrder(node.getLeftChild(), " " + (String)node.getItem().getKey() + " ");
		}
		else if(node.getRightChild()!=null){
			s += toStringPreOrder(node.getRightChild(), " " + (String)node.getItem().getKey() + " ");
		}
		return s;
	}

	public String toStringInorder(){
		String s1 = "";
		String s2 = "";
		if(root.getLeftChild()!=null){
			s1 += toStringInorder(root.getLeftChild(), s1);
		}
		if(root.getRightChild()!=null){
			s2 += toStringInorder(root.getRightChild(), s2);
		}		
		return s1 + " " + root.getItem().getKey() +  s2;
	}
	//toStringInOrderHelper
	private String toStringInorder(TreeNode<T> node, String s){
		if(node.getLeftChild()==null && node.getRightChild()==null){
			s += (String)node.getItem().getKey();
		}
		else if(node.getLeftChild()!= null){
			toStringInorder(node.getLeftChild(),  "");
		}
		else if(node.getRightChild()!=null){
			s += toStringInorder(node.getRightChild(),  " " + (String)node.getItem().getKey() + " ");		
		}	
		return s;
	}
	

	public String toStringPostorder(){
		String s1 = "";
		String s2 = "";
		if(root.getLeftChild()!=null){
			s1 += toStringPostorder(root.getLeftChild(), s1);
		}
		if(root.getRightChild()!=null){
			s2 += toStringPostorder(root.getRightChild(), s2);
		}		
		return s1 +  s2 + " " + root.getItem().getKey();
		
	}
	
	private String toStringPostorder(TreeNode<T> node, String s){
		if(node.getLeftChild()==null && node.getRightChild()==null){
			s += (String)node.getItem().getKey();
		}
		else if(node.getLeftChild()!=null){
			toStringPostorder(node.getLeftChild(), "");
		}
		else if(node.getRightChild()!=null){
			toStringPostorder(node.getLeftChild(), "");
		}
		return s;
	}

	public BinarySearchTree getCopyOfTree(){
		return null;
	}

}
