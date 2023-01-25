package com.UserAPI;

import java.util.Scanner;

import com.List.LinkedList;
import com.Queue.Queue;
import com.Stack.Stack;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cases;
		String inCases = "";
		System.out.println("1.LinkedList\n2.Queue\n3.Stack\n\nSelect Operation: ");
		int op1 = sc.nextInt();
//		
		switch (op1) {
		case 1:
			cases = "LinkedList";
			LinkedList ll = new LinkedList();
			System.out.print(
					"1.insert()\n2.insertStart()\n3.insertAt()\n4.deleteAt()\n5.deleteAll()\n6.show()\n\nSelect Operation: ");
			int op2 = sc.nextInt();
			switch (op2) {
			case 1:
				inCases = " insert()";
				System.out.print("Enter value = ");
				ll.insert(sc.nextInt());
				break;
			case 2:
				inCases = " insertStart()";
				System.out.print("Enter value = ");
				ll.insertAtStart(sc.nextInt());
				break;
			case 3:
				inCases = " insertAt()";
				System.out.print("Enter value = ");
				int val = sc.nextInt();
				System.out.print("On index = ");
				int index = sc.nextInt();
				ll.insertAt(val, index);
				break;
			case 4:
				inCases = " deleteAt()";
				System.out.print("index no = ");
				int at = sc.nextInt();
				ll.deleteAt(at);
				break;
			case 5:
				inCases = " deleteAll()";
				ll.deleteAll();
				System.out.print("Data Deleted");
				break;
			case 6:
				inCases = " show()";
				ll.show();
				break;
			default:
				System.out.println("In LinkedList NO Such Option Found!");
			}
			break;
		case 2:
			cases = "Queue";
			Queue que = new Queue();
			System.out.println("1.enQue()\n2.deQue()\n3.show()");
			int op3 = sc.nextInt();
			switch (op3) {
			case 1:
				System.out.print("Enter value = ");
				que.enqueue(sc.nextInt());
				break;
			case 2:
				que.dequeue();
				break;
			case 3:
				que.show();
				break;
			default:
				System.out.println("In Queue NO Such Option Found!");
			}
			break;
		case 3:
			cases = "Stack";
			Stack st = new Stack();
			System.out.println("1.push()\n2.pop()\n3.fatch()\n4.show()\n5.size()\n6.isEmpty()\n7capacity()\n8.pick()");
			System.out.print("Select Option: ");
			int op4 = sc.nextInt();
			switch (op4) {
			case 1:
				System.out.print("Enter value = ");
				st.push(sc.nextInt());
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.fatch();
				break;
			case 4:
				st.show();
				break;
			case 5:
				st.size();
				break;
			case 6:
				st.isEmpty();
				break;
			case 7:
				st.capacity();
				break;
			case 8:
				System.out.print("Enter value: ");
				st.pick(sc.nextInt());
			}
			break;
		default:
			cases = "Option Not Found!";
		}
		System.err.println("You operation on '" + cases + "' class using '" + inCases + "' method");

	}
}
