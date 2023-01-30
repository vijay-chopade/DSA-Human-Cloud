package com.Array;

public class Array {

//	private int i;
	private int capacity = 10;
	private int position = 0;
	private int[] arr = new int[capacity];

//	public Array() {
//		i = 1;
////		System.err.println("is a default constructor!");
//	}
//
//	public Array(int val) {
//		i = val;
////		System.err.println("is a param. constructor!");
//	}

	public void add(int data) {
		arr[position] = data;
		position++;
	}

	public void show() {
		for (int k = 0; k <= capacity - 1; k++) {
			if (arr[k] != 0)
				System.out.println(arr[k]);
			else
				continue;
		}
		System.out.println();
	}

	public int size() {
		return capacity;
	}

	public void insertAt(int index, int data) {
		arr[index] = data;
	}

}

////////////////////////////////////

//public class Array<T> {
//
//	private T i;
//	private int capacity = 10;
//	private int index = 0;
//	private Array<T>[] arr = new Array[capacity];
//
//	public Array() {
//		i = null;
////		System.err.println("is a default constructor!");
//	}
//
//	public Array(T val) {
//		i = val;
////		System.err.println("is a param. constructor!");
//	}
//
//	public void add(T data) {
//		arr[index] = new Array<T>(data);
//	}
//
//	public void show() {
//		for (int k = 0; k <= index; k++) {
//			System.out.println(arr[k]);
//		}
//	}
