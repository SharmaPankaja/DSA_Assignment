package DSA_assignment5;

public class Doubly_List {
	Dnode root;

	void create_list() {
		root = null;
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;// n becomes 1st so root
		} else {
			n.right = root;
			root.left = n;
			root = n;

		}
		System.out.println(root.data + "inserted..");
	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty List");
		} else {
			Dnode t;
			t = root;// 1
			root = root.right;// 2
			root.left=null;
			System.out.println(t.data + " deleted");
		}
	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;// n becomes 1st so root
		} else {
			Dnode t = root;
			while (t.right != null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
		System.out.println(root.data + "inserted..");
	}

	void delete_right() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Dnode t, t2;
			t = root;// 1
			while (t.right != null) {
				t = t.right;
			}
			if (t == root)// single node
				root = null;// reset root as only node left
			else
			{
				t2 = t.left;
			    t2.right = null;
			}
			System.out.println(t.data + " deleted");
		}
	}
	
	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
			while (t != null) {
				
				System.out.print("<-|" + t.data + "|->");
				t = t.right;
				
			}
		}
	}

	void print_odd_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
			while (t != null) {
				if(t.data%2!=0)
				{
				System.out.print("<-|" + t.data + "|->");
				
				}
				t = t.right;
			}
		}
	}

	void print_list_Reverse() {
		if (root == null)
            System.out.println("List Empty");
        else {
            Dnode t = root;
            while (t.right != null)
                        t = t.right;
            while(t!=null)
            {
                System.out.print("<-|" + t.data + "|->");
                t = t.left;
            }
		}
	}
}