package lesson10.problem1;

// code for the user implemenation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	private int numberOfLeafs = 0;
	private int size = 0;

	public MyBST() {
		root = null;
		numberOfLeafs = 0;
		size = 0;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			size++;
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
						size++;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						size++;
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {// implement VIew - Left - Right

		if (t != null) {
			System.out.print(t.element + ",");
			preOrder(t.left);
			preOrder(t.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BinaryNode t) {// implement Left-View-Right

		if (t != null) {
			preOrder(t.left);
			preOrder(t.right);
			System.out.print(t.element + ",");
		}
	}

	/*
	 * public boolean contains(int key) {
	 * 
	 * if (root == null) return false;
	 * 
	 * else if (root.element == key) return true; else { if (key > root.element)
	 * contains(root.left, key);
	 * 
	 * else contains(root.right, key);
	 * 
	 * return false; // implement }
	 * 
	 * } }
	 */

	public boolean contains(int key) {

		if (root == null)
			return false;

		return contains(root, key);

	}

	public boolean contains(BinaryNode root, int key) {

		if (root == null)
			return false;

		if (root.element == key)
			return true;
		if (root.element > key)
			return contains(root.left, key);

		return contains(root.right, key);

	}

	public boolean isEmpty() {// implement // check the tree is empty or not

		return (root == null);
	}

	public Integer findMin() {
		return findMin(root);
	}

	private Integer findMin(BinaryNode x) {
		// TODO Auto-generated method stub
		if (x.left == null)
			return x.element;
		return (findMin(x.left));

		// return x.element;

	}

	public Integer findMax() {
		return findMax(root);
	}

	private Integer findMax(BinaryNode x) {
		// TODO Auto-generated method stub
		if (x.right == null)
			return x.element;
		return findMax(x.right);

	}

	/*
	 * private boolean contains(BinaryNode x, int key) { // TODO Auto-generated
	 * method stub boolean result = false; while (x != null) { if (x.element != key)
	 * { contains(x.left, key); } else { result = true; } } return result;
	 * 
	 * }
	 */
	public Integer getRoot() {// implement

		return root.element;
	}

	public Integer leafNodes() {

		return leafNodes(root);
	}

	private int leafNodes(BinaryNode x) {
		// TODO Auto-generated method stub
		if (x == null)
			return 0;
		if (x.left == null && x.right == null)
			return 1;
		else
			return leafNodes(x.left) + leafNodes(x.right);
	}

	public int size() {
		return size;
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;

		}

	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 1, 5, 9, 56, 7, 16, 89, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}

		System.out.println("\nThe tree in sorted ordering - InOrdering ");
		mybst.printTree();

		mybst.insert(19);

		System.out.print("\nThe tree in sorted - InOrdering \n");
		mybst.printTree();

		System.out.print("\nThe tree in PreOrdering \n");
		mybst.preOrder();

		System.out.println("\n Contains 1? : ");
		boolean x = mybst.contains(5);
		System.out.println(x);

		System.out.println("Root: " + mybst.getRoot());

		System.out.println("No of Leafs : " + mybst.leafNodes());

		System.out.println("Size : " + mybst.size());

		System.out.println("Is Empty? : " + mybst.isEmpty());

		System.out.println("Max :" + mybst.findMax());

		System.out.println("Min :" + mybst.findMin());

	}
}
