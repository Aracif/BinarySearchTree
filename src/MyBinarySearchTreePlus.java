
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
		return getHeight(root.getLeftChild(),0) + getHeight(root.getRightChild(),0) + 1;
	}
	
//	private int getSize(TreeNode<T> node, int nodeTotal){
//		if(node.getLeftChild()==null && node.getRightChild()==null){
//			return ++nodeTotal;
//		}
//		else if(node.getLeftChild()!=null){
//			nodeTotal = getSize(node.getLeftChild(), ++nodeTotal);
//		}
//		else if(node.getRightChild()!=null){
//			nodeTotal = getSize(node.getRightChild(), ++nodeTotal);
//		}	
//	}

	public String toStringInorder(){
		return null;
	}

	public String toStringPreorder(){
		return null;
	}

	public String toStringPostorder(){
		return null;
	}

	public BinarySearchTree getCopyOfTree(){
		return null;
	}

}
