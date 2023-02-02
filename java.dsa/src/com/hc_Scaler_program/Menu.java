package com.hc_Scaler_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.TreeSet;

import com.List.LinkedList;
import com.Queue.Queue;
import com.Stack.Stack;

public class Menu extends MenuItem {
	Scanner sc = new Scanner(System.in);
	private static boolean isLevelOne = true;
	List<MenuItem> items = new ArrayList<>();

	public Menu() {
		super();
	}

	public Menu(String s) {
		super(0, s);
	}

	public Menu(int mi_index, String name) {

		super(mi_index, name);
		addMenuItem(new MenuItem(0, "Back"));
	}

	public List<MenuItem> getItems() {
		return items;
	}

	public void addMenuItem(MenuItem item) {
		item.setParent(this);
		items.add(item);
	}

	static Stack sl = new Stack();
	static LinkedList ll = new LinkedList();
	static Queue ql = new Queue();

	public void displayMi() {
		boolean dsenter = true;
		while (dsenter) {
			if (isLevelOne) {
				isLevelOne = false;
				items.forEach(e -> e.display()); // use to show DSA manu
				isLevelOne = true;
				System.out.println("Enter choice..!");
				int choice = sc.nextInt();
				if (choice == 0) { // use to check validation
//					System.out.println("Invalid choice..!");
					System.err.println("Terminate..!");
					dsenter = false;
					break;
//					displayMi();
				} else {
					MenuItem mi = getItems().stream().filter(e -> e.getMi_index() == choice).findFirst().orElse(null);

					boolean whileCon = true;
					while (whileCon) {
						if (mi == null) { // check second validation
							System.out.println("Invalid input..!");
							displayMi();
						} else if (mi instanceof Menu) {

//							TreeSet<Menu> set = new TreeSet<Menu>();
							((Menu) mi).getItems().forEach(e -> e.display()); // this line for get methods list
							// write code here
//							

							if (choice == 1) {
								Scanner s1 = new Scanner(System.in);
								System.out.print("Enter Method No: ");
								int input = s1.nextInt();
								int data = 0;
								int index = 0;
								switch (input) {
								case 1:
									System.out.print("Enter Data : ");
									ll.insert(s1.nextInt());
									break;
								case 2:
									System.out.print("Enter Data : ");
									ll.insertAtStart(s1.nextInt());
									break;
								case 3:
									System.out.print("Enter Data : ");
									data = s1.nextInt();
									System.out.print("Enter Index : ");
									index = s1.nextInt();
									ll.insertAt(index, data);
									break;
								case 4:
									System.out.print("Enter Index : ");
									index = s1.nextInt();
									ll.deleteAt(index);
									break;
								case 5:
									ll.show();
									break;
								case 0:
									displayMi();
									whileCon = false;
									break;
//							}
								}
							} else if (choice == 2) {
								Scanner s2 = new Scanner(System.in);
								System.out.print("Enter Method No: ");
								int input = s2.nextInt();
								switch (input) {
								case 1:
									System.out.print("Enter Data : ");
									ql.enqueue(s2.nextInt());
									break;
								case 2:
									ql.dequeue();
									break;

								case 0:
									displayMi();
									whileCon = false;
									break;
//							}
								}
							} else if (choice == 3) {
								Scanner s3 = new Scanner(System.in);
								System.out.print("Enter Method No: ");
								int input = s3.nextInt();
								switch (input) {
								case 1:
									System.out.print("Enter Data : ");
									sl.push(s3.nextInt());
									break;
								case 2:
									sl.pop();
									break;
								case 3:
									System.out.print("Enter Data : ");
									sl.peek(s3.nextInt());
									break;
								case 4:
									sl.fatch();
									break;
								case 5:
									sl.show();
									break;
								case 0:
									displayMi();
									whileCon = false;
									break;

								}
							}
							if (whileCon)
								whileCon = calling();
//							else
//								System.err.println("\nTerminate..!");

						}
					}
				}
			}
		}
	}

	public static boolean calling() {
		Scanner s1 = new Scanner(System.in);
		System.out.print("\nDo You Wants to Continu 'y/n' : ");
		if (s1.nextLine().equalsIgnoreCase("y")) {
			return true;
		} else
			return false;

	}

}
