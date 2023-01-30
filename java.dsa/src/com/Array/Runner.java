package com.Array;

public class Runner {

//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Array arr = new Array();		
		arr.add(3);
		arr.add(1);
		arr.add(2);
//		arr.show();
		arr.insertAt(2, 77);
		arr.show();
		System.out.println(arr.size());
		System.out.println("End");
		
	}
}
