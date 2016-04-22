
public class MyBinarySearchTreePlus <T extends KeyedItem<KT>,KT extends Comparable<? super KT>> extends MyBinarySearchTree<T,KT> implements BSTPInterface{

	public int getHeight(){
		int leftHeight = 1;
		int rightHeight = 1;
		if(root==null){
			return 0;
		}
		else{
			if(root.getLeftChild()!=null){
				leftHeight = getHeight(root.getLeftChild(),0) + 1;
			}
			if(root.getRightChild()!=null){
				rightHeight = getHeight(root.getRightChild(),0) + 1;
			}
		}
		System.out.println("Left Height " + leftHeight);
		System.out.println("Right Height " + rightHeight);
		return leftHeight>rightHeight?leftHeight:rightHeight;
	}
	
	//Get height helper method
	private int getHeight(TreeNode<T> node, int level){
		if(node.getLeftChild()==null && node.getRightChild()==null){
			++level;
		}
		else if(node.getLeftChild()!=null){
			level = getHeight(node.getLeftChild(), ++level);
		}
		else if(node.getRightChild()!=null){
			level = getHeight(node.getRightChild(), ++level);
		}
		return level;	
	}


	public int getSize(){
		int leftHeight = 0;
		int rightHeight = 0;
		if(root.getLeftChild()!=null){
			leftHeight = getSize(root.getLeftChild(),0);
		}
		if(root.getRightChild()!=null){
			rightHeight = getSize(root.getRightChild(),0);
		}
		return leftHeight + rightHeight + 1;
	}
	
	//Get size helper method
	private int getSize(TreeNode<T> node, int totalNodes){
		if(node.getLeftChild()==null && node.getRightChild()==null){
			++totalNodes;
		}
		else if(node.getLeftChild()!=null){
			totalNodes += getSize(node.getLeftChild(), ++totalNodes);
		}
		else if(node.getRightChild()!=null){
			totalNodes += getSize(node.getRightChild(), ++totalNodes);
		}
		return totalNodes;
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
			s += toStringInorder(node.getRightChild(),  " " + (Integer)node.getItem().getKey() + " ");		
		}	
		return s;
	}
	

	public String toStringPostorder(){
		String s1 = "";
		String s2 = "";
		if(root.getLeftChild()!=null){
			s1 += toStringInorder(root.getLeftChild(), s1);
		}
		if(root.getRightChild()!=null){
			s2 += toStringInorder(root.getRightChild(), s2);
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
