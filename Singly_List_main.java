package DSA_assignment5;

import java.util.Scanner;

public class Singly_List_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner in = new Scanner(System.in);
		Singly_List obj = new Singly_List();
		System.out.println("Enter data : ");
		int e;
		obj.create_list();
		;

		do {
			System.out.println("Linked list Menu..");
			System.out.println("--------------------------");	
			System.out.println("1.Insert Last");
			System.out.println("2.Print list");
			System.out.println("3.Search list");
			System.out.println("0.Exit");
			System.out.println("--------------------------");
			System.out.println("Choice : ");
			ch = in.nextInt();

			switch (ch) {
			
			case 1:
				System.out.println("Enter element: ");
				e = in.nextInt();
				obj.insert_last(e);
				break;

			case 2:
				obj.print_list();
				break;
			case 3:
				if (obj.root != null) {
					System.out.println("Enter a data to search:");
					int data = in.nextInt();
					obj.search_list(data);
				} else
					System.out.println("List is empty..");
				break;
			 
			case 0:
				System.out.println("Thank...");
				break;
			default:
				System.out.println("Check entrered choice....");
			}
		} while (ch != 0);

	}
}
