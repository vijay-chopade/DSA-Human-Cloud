package com.stack;

public class Runner {

	public static void main(String[] args) {
		Stack list = new Stack();
		for(int i=20;i>=1;i--) {
			list.push(i);
		}
		list.show();
		System.out.println(list.capacity());
		for(int i=0;i<19;i++) {
			list.pop();
		}
		list.show();
		System.out.println(list.capacity());
	}
}
