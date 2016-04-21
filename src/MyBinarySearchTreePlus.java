
public class MyBinarySearchTreePlus <T extends KeyedItem<KT>,KT extends Comparable<? super KT>> extends MyBinarySearchTree<T,KT> implements BSTPInterface{

	public int getHeight(){
		int level = 1;
		TreeNode<T> currentNode = root;
		if(currentNode.getLeftChild()==null && currentNode.getRightChild()==null){
			level++;
		}
		else if(currentNode.getLeftChild()!=null){
			currentNode = currentNode.getLeftChild();
			getHeight();
		}
		else{
			currentNode = currentNode.getRightChild();
			getHeight();		
		}
		return level;
	}

	public int getSize(){
		return 0;
	}

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
