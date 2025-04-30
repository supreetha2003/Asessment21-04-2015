package com.dyashin.assignmentprograms30;

public class Driver {

	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		myArray.add("Apple");
		myArray.add("Banana");
		myArray.add("Cherry");
		myArray.add("Dragon fruit");
		myArray.add("Fruits");
		myArray.display();
		System.out.println(myArray.getString(1));

	}
}
