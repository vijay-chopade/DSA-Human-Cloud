package com.stack;

public class Stack {

	private int capacity = 2;
	int stack[] = new int[capacity];
	private int position = 0;

	public boolean isEmpty() {
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

	public int pop() {
		int pop = 0;
		if (position <= 0)
			System.out.println("tank is Empty.");
		else {
			position--;
			stack[position] = 0;
			pop = stack[position];
			shrink();
		}
		return pop;
	}

	public void shrink() {
		int length = size();
		if (length <= (capacity / 2) / 2)
			capacity /= 2;
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}

	public int fatch() {
		return stack[position - 1];
	}

	public void show() {
		if(position <= 0) 
			System.out.print("Tank is empty.");
		else
			for (int i = 0; i < position; i++)
				System.out.print(stack[i] + " ");
		System.out.println();
	}

	public int size() {
		return position + 1;
	}

	public int capacity() {
		return capacity;
	}

	public boolean pick(int data) {
		boolean check = false;
		for (int s : stack)
			if (s == data)
				check = true;
		return check;
	}

}
