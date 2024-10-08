package com.ServerAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.List.LinkedList;
import com.Queue.Queue;
import com.Stack.Stack;

public class Menu extends MenuItem {
	private int id;
	private String name;
	private ArrayList<MenuItem> mi = new ArrayList<>();

	public Menu() {

	}

	public Menu(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addMI(MenuItem item) {
		item.setParent(this);
		mi.add(item);
	}

	public List<MenuItem> getMI() {
		return mi;
	}

	public void display() {
		System.out.println(id + " : " + name);
	}

	public void display1() {
		getMI().stream().forEach(e -> System.out.println(e.getId() + " : " + e.getName()));
		System.out.println();
	}

	public void display2() {
		System.out.println(">>");
		for (int i = 0; i <= 5; i++) {
			getMI().stream().forEach(e -> System.out.println(e.getId() + " : " + e.getName()));
			System.out.println(id + " : " + name);
		}
		System.out.println("<<");

	}

	public Menu(int id, String name, ArrayList<MenuItem> menuItem) {
		super();
		this.id = id;
		this.name = name;
		this.mi = menuItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + "]";
	}

}