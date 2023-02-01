package com.ServerAPI;

import java.util.Scanner;

import com.List.LinkedList;
import com.Queue.Queue;
import com.Stack.Stack;

public class ManuController {

	public static boolean oprationLL() {
		Scanner ss = new Scanner(System.in);
		boolean whileCon3 = true;
		LinkedList ll = new LinkedList();
		while (whileCon3) {
			System.out.print("Enter Method No: ");
			int input = ss.nextInt();
			int data = 0;
			int index = 0;
			switch (input) {
			case 1:
				System.out.print("Enter Data : ");
				ll.insert(ss.nextInt());
				break;
			case 2:
				System.out.print("Enter Data : ");
				ll.insertAtStart(ss.nextInt());
				break;
			case 3:
				System.out.print("Enter Data : ");
				data = ss.nextInt();
				System.out.print("Enter Index : ");
				index = ss.nextInt();
				ll.insertAt(index, data);
				break;
			case 4:
				System.out.print("Enter Index : ");
				index = ss.nextInt();
				ll.deleteAt(index);
				break;
			case 5:
				ll.show();
				break;
			case 0:
				whileCon3 = false;
				break;
			}
			System.out.println();
		}
		if (whileCon3)
			return true;
		else
			return false;
//		ss.close();
	}

	public static boolean oprationQL() {
		Scanner ss = new Scanner(System.in);
		boolean whileCon3 = true;
		Queue ql = new Queue();
		while (whileCon3) {
			System.out.print("Enter Method No: ");
			int input = ss.nextInt();
			switch (input) {
			case 1:
				System.out.print("Enter Data : ");
				ql.enqueue(ss.nextInt());
				break;
			case 2:
				ql.dequeue();
				break;
			
			case 0:
				whileCon3 = false;
				break;
			}
			System.out.println();
		}
		if (whileCon3)
			return true;
		else
			return false;
//		ss.close();
	}

	public static boolean oprationSL() {
		Scanner ss = new Scanner(System.in);
		boolean whileCon3 = true;
		Stack sl = new Stack();
		while (whileCon3) {
			System.out.print("Enter Method No: ");
			int input = ss.nextInt();
			switch (input) {
			case 1:
				System.out.print("Enter Data : ");
				sl.push(ss.nextInt());
				break;
			case 2:
				sl.pop();
				break;
			case 3:
				System.out.print("Enter Data : ");
				sl.peek(ss.nextInt());
				break;
			case 4:
				sl.fatch();
				break;
			case 5:
				sl.show();
				break;
			case 0:
				whileCon3 = false;
				break;
			}
			System.out.println();
		}
		if (whileCon3)
			return true;
		else
			return false;
//		ss.close();
	}

	public static void setList() {
		Scanner sc = new Scanner(System.in);
		boolean whileCon1 = true;
		int i = 0;
		while (whileCon1) {
			boolean whileCon2 = true;
			Menu listMenu = new Menu(1, "LinkedList");
			Menu queMenu = new Menu(2, "Queue");
			Menu stackMenu = new Menu(3, "Stack");
//			Menu backMenu = new Menu(4, "Exit");
			listMenu.display();
			queMenu.display();
			stackMenu.display();
//			backMenu.display();
			System.out.println();
			while (whileCon2) {
				System.out.print("Enter DSA No: ");
				i = sc.nextInt();

				if (i == 1) {
					listMenu.addMI(new MenuItem(1, "insert()"));
					listMenu.addMI(new MenuItem(2, "insertStart()"));
					listMenu.addMI(new MenuItem(3, "insertAt()"));
					listMenu.addMI(new MenuItem(4, "deleteAt()"));
					listMenu.addMI(new MenuItem(5, "show()"));
					listMenu.addMI(new MenuItem(0, "Back to Main Menu"));
					listMenu.display1();
					whileCon2 = ManuController.oprationLL();

				} else if (i == 2) {
					queMenu.addMI(new MenuItem(1, "enQue()"));
					queMenu.addMI(new MenuItem(2, "deQue()"));
//					queMenu.addMI(new MenuItem(3, "show()"));
					queMenu.addMI(new MenuItem(0, "Back to Main Menu"));
					queMenu.display1();
					whileCon2 = ManuController.oprationQL();
				} else if (i == 3) {
					stackMenu.addMI(new MenuItem(1, "Push"));
					stackMenu.addMI(new MenuItem(2, "pop()"));
					stackMenu.addMI(new MenuItem(3, "peek()"));
					stackMenu.addMI(new MenuItem(4, "fatch()"));
					stackMenu.addMI(new MenuItem(5, "show()"));
					stackMenu.addMI(new MenuItem(0, "Back to Main Menu"));
					stackMenu.display1();
					whileCon2 = ManuController.oprationSL();
				} else if (i == 0) {
					whileCon2 = false;
					break;
				} else if (i == 4) {
					whileCon1 = false;
					break;
				}
			}
		}
		System.err.println("\nEnd >> ");
		sc.close();
	}
}
