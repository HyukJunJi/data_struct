package datastruct_2;


class BinaryTree{
	private TreeNode root;
	public static int count;
	public static int leafcount;
	public TreeNode makenode(TreeNode leftv,int data,TreeNode rightv) {
		root=new TreeNode(data);
		root.left=leftv;
		root.right=rightv;
		return root;
	}
	public void preorder(TreeNode root){
		if(root!=null){
			System.out.print(root.data+"," );
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(TreeNode root){
		if(root!=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+",");
		}
	}
	public void inorder(TreeNode root){
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+",");
			inorder(root.right);
		}
	}
	public int nodecount(TreeNode root){ //대략적인 코드?
		if(root!=null){
			count++;
			nodecount(root.left);
			nodecount(root.right);
		}
		return count;
	}
	public int leafcount(TreeNode root){
		if(root!=null){
			if(root.left==null&&(root.right==null)){ this.leafcount++;}
			leafcount(root.left);
			leafcount(root.right);
		}
		return this.leafcount;
	}
	public int max(int A,int B) {
		return (A>B)?A:B;
	}
	public int depthcount(TreeNode root,int depth) {
		
		
		if(root==null) {return depth;}
		return max(depthcount(root.left, depth+1),depthcount(root.right,depth+1));
	}
	private int MAX(int A, int B) {
		return (A>B)?A:B;
		}
	
	
	private int calCulationHeight(TreeNode rootNode){
		int height = -1;
		
		if(rootNode!=null) {
		height = 1 +
		MAX(calCulationHeight(rootNode.left)
		,calCulationHeight(rootNode.right));
		
		}
		return height;
		}
	void height() {
		
		System.out.println("depth: "+calCulationHeight(root));
		
		}
	public void insertBST(TreeNode tree,int x) {
		TreeNode p,q = null;
		
		p=tree;
		while(p!=null) {
			if(x==p.data) return;
			q=p;
			if(x<p.data) {
				p=p.left;
			}else p=p.right;
		}
		TreeNode newNode=new TreeNode(x);
		if(tree==null) tree=newNode;
		else if(x<q.data) q.left=newNode;
		else {
			q.right=newNode;
		}
		return ;
		
	}
}

class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data1) {
		data=data1;
		left=null;
		right=null;
	}
}
public class BT_complicate {
	public static void main(String[] args) {
		BinaryTree A = new BinaryTree();
		TreeNode node1 = A.makenode(null,1,null);
		TreeNode node2 = A.makenode(null,7,null);
		TreeNode node3 = A.makenode(node1,3,node2);
		TreeNode node4 = A.makenode(null,14,null);
		TreeNode node5 = A.makenode(node3,9,node4);
		TreeNode node6 = A.makenode(null,44,null);
		TreeNode node7 = A.makenode(null,36,node6);
		TreeNode node8 = A.makenode(null,97,null);
		TreeNode node9 = A.makenode(null,94,node8);
		TreeNode node10 = A.makenode(node7,67,node9);
		TreeNode node11 = A.makenode(node5,22,node10);
		System.out.println("Preorder");
		A.preorder(node11);
		System.out.println("\n");
		System.out.println("Postorder");
		A.postorder(node11);
		System.out.println("\n");
		System.out.println("Inorder");
		A.inorder(node11);
		System.out.println("\n");
		System.out.println("NodeCount");
		System.out.println(A.nodecount(node11));
		System.out.println("LeafCount");
		System.out.println(A.leafcount(node11));
		System.out.println("MaxDepth");
		System.out.println(A.depthcount(node11,-1));
		A.height();
		
		A.insertBST(node11, 40);
		A.inorder(node11);
		System.out.println();
		A.preorder(node11);
		
	}
}

