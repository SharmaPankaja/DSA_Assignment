package DSA_assignment5;

import java.util.Scanner;

public class Doubly_List_Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			int ch;
			Scanner in = new Scanner(System.in);
			Doubly_List obj = new Doubly_List();
			System.out.println("Enter data : ");
			int e;
			obj.create_list();
			

			do {
				System.out.println("Linked list Menu..");
				System.out.println("--------------------------");
				System.out.println("1.Insert left");
				System.out.println("2.Insert Right");
				System.out.println("3.Delete left");
				System.out.println("4.Delete Right");
				System.out.println("5.Print list");
				System.out.println("6.Print Odd list");
				System.out.println("7.Print Reverse list");
				System.out.println("0.Exit");
				System.out.println("--------------------------");
				System.out.println("Choice : ");
				ch = in.nextInt();

				switch (ch) {
				case 1:
					System.out.println("Enter element: ");
					e = in.nextInt();
					obj.insert_left(e);
					break;
				case 2:
					System.out.println("Enter element: ");
					e = in.nextInt();
					obj.insert_right(e);
					break;

				case 3:
					obj.delete_left();
					break;
				case 4:
					obj.delete_right();
					break;
				case 5:
					obj.print_list();
					break;
				case 6:
					obj.print_odd_list();
					break;
				case 7:
					obj.print_list_Reverse();
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
