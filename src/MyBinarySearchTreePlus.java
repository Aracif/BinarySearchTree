
public class MyBinarySearchTreePlus <T extends KeyedItem<KT>,KT extends Comparable<? super KT>> extends MyBinarySearchTree<T,KT> implements BSTPInterface{

	public int getHeight(){
		if(root==null){
			return 1;
		}
		else{
		return getHeight(root.getLeftChild(),0)>getHeight(root.getRightChild(),0)
				?getHeight(root.getLeftChild(),1)+1
				:getHeight(root.getRightChild(),1)+1;
		}
	}
	
	private int getHeight(TreeNode<T> node, int level){
		if(node.getLeftChild()==null && node.getRightChild()==null){
			++level;
		}
		else if(node.getLeftChild()!=null){
			getHeight(node.getLeftChild(), ++level);
		}
		else if(node.getRightChild()!=null){
			getHeight(node.getRightChild(), ++level);
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
