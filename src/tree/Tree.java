package tree;

public class Tree {

	Dnode root;
	void creatTree() {
		root = null;
	}
	
	void insert(Dnode r, Dnode n) {
		if(root == null) {
			root = n;
		}
		else {
			if(n.data < r.data) {
				if(r.left == null) 
					r.left = n;
				else 
					insert(r.left, n);
			}
			else {
				if(r.right == null)
					r.right = n;
				else
					insert(r.right, n);
			}
		}
	}
	
	
	void inorder(Dnode r) {
		int count = 0;
		if(r!=null) {
			inorder(r.left);
			System.out.println(r.data + ":");
			inorder(r.right);
		}
	}
	
	void leaf(Dnode r) {
		int count = 0;
		if(r!=null) {
			if(r.left == null && r.right==null) {
				count++;
			}
		}
		System.out.println("leaf : " + count);
	}
	
	int getHeight(Dnode r) {
		if(r==null) {
			return 0;
		}
		else {
		int lheight = 	getHeight(r.left);
		int rheight =   getHeight(r.right);
		return (Math.max(lheight, rheight)+1);
		}
	}
	
	 boolean isbalanced(Dnode r) {
		 if(r==null)
			 return true;
		int lheight = 	getHeight(r.left);
		int rheight =   getHeight(r.right);
		int res = Math.abs(lheight - rheight);
		if(res  > 1) 
			return false;
		return (isbalanced(r.left) && isbalanced(r.right));
	}
	
	public static void main(String[] args) {
		Tree t=new Tree();
	         Dnode n1=new Dnode(100);
	         t.insert(t.root,n1);
	         Dnode n2=new Dnode(50);
	         t.insert(t.root,n2);
	         Dnode n3=new Dnode(20);
	         t.insert(t.root,n3);
	          Dnode n4=new Dnode(120);
	         t.insert(t.root,n4);
	         t.inorder(t.root);
	         int height = t.getHeight(t.root);
	         System.out.println("\nHeight is:"+ (height-1));
	         System.out.println(t.isbalanced(t.root));
	         t.leaf(t.root);
	}

}
