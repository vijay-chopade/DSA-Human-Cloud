package com.Stack;

public class Stack {

	private int capacity = 2;
	private int stack[] = new int[capacity];
	private int position = 0;

	private boolean isEmpty() {
		return position <= 0;
	}

	public void push(int data) {
		if (size() == capacity)
			reduce();
		stack[position] = data;
		position++;
	}

	private void reduce() {
		int length = size();
		capacity *= 2;
		int[] newStack = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;

	}

	public void pop() {
		int pop = 0;
		if (position <= 0)
			System.out.println("tank is Empty.");
		else {
			position--;
			pop = stack[position];
			stack[position] = 0;
			shrink();
			System.out.println(pop);
//			show();
		}
	}

	private void shrink() {
		int length = size();
		if (length <= (capacity / 2) / 2)
			capacity /= 2;
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}

	public void fatch() {
		if (isEmpty())
			System.out.println("tank is Empty.");
		else {
			System.out.println(stack[position - 1]);
//			show();
		}
	}

	public void show() {
		if (position <= 0)
			System.out.print("Tank is empty.");
		else
			System.err.print("Stack : ");
			for (int i = 0; i < position; i++)
				System.out.print(stack[i] + " ");
		System.out.println();
	}

	private int size() {
		return position + 1;
	}

	private int capacity() {
		return capacity;
	}

	public boolean peek(int data) {
		boolean check = false;
		for (int s : stack)
			if (s == data)
				check = true;
		System.out.println(check);
		return check;
	}

}
