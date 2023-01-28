package com.Queue;

public class Queue {
// FIFO
	private int queue[] = new int[5], front = 0, rear = 0, size = 0;

	public void enqueue(int data) {
		queue[rear] = data;
		rear = (rear + 1) % 5;
		size++;
	}

	public int dequeue() {
		int data = queue[front];
		front = (front + 1) % 5;
		size--;
		return data;
	}

	public void show() {
		if (front == 0)
			System.out.print("Queue is Empty.");
		else
			for (int i = 0; i < size; i++)
				System.out.print(queue[(front + i) % 5] + " ");
		System.out.println();
	}
}
