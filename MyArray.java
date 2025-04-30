package com.dyashin.assignmentprograms30;

public class MyArray{
	

     	private static final int initialCapacity=10;

     	private String[] StringArr;

     	int size=0;

     	public MyArray() {

     		StringArr=new String[10];

     	}

     	public void add(String newStr) {

     		checkCapacity();

     		StringArr[size]=newStr;	

     		size++;

     		}

     	private void checkCapacity() {

     		if(size==StringArr.length) {

     			int newCapacity=size*2;

     			String[] newArr=new String[newCapacity];

     			String[] copyArray=copyArray(newArr);

     			StringArr=copyArray;

     		}

     	}

     	private String[] copyArray(String[] newArr) {

     		for(int i=0;i<StringArr.length;i++) {

     			newArr[i]=StringArr[i];

     		}

     		return newArr;

     	}

     	public String getString(int index) {

     		if(index<0 ||index>size) {

     			System.out.println("Enter valid index");

     		}

     		String getStr=StringArr[index];

     		return getStr;

     	}

     	public void display() {

     		for(int i=0;i<size;i++) {

     			System.out.println(StringArr[i]);

     		}

     	}

      
     }
      
     
