package com.arrays;

import java.util.Arrays;

public class ArrayUtils {
	//create a reference
	static String[] product;
	static int size;
	ArrayUtils(int size){
		this.size = size;
		this.product = new String[size];//creating an array object with given size
		//Array.toString
//		System.out.println(Arrays.toString(this.product));
	}
	public static String addProduct(int index,String value) {
		if(index < 0 || index >= size) {
			return "Invalid index position";
		}
		else if(product[index] != null) {
			return "Position is not empty!";
		}
		product[index] = value;
		return "Product Added SuccessFull..";
	}
	public static String getProduct(int index) {
		if(index < 0 || index >= size) {
			return "Invalid index position";
		}
		else if(product[index] == null) {
			return "Position is not empty!";
		}
		return product[index];
		
	}
	public static String updateProduct(int index,String updatevalue) {
		if(index < 0 || index >= size) {
			return "Invalid index position";
		}
		else if(product[index] == null) {
			return "Position is not empty!";
		}
		product[index] = updatevalue;
		return "Product update successfully..";
	}
	public static String deleteProduct(int index) {
		if(index < 0 || index >= size) {
			return "Invalid index position";
		}
		else if(product[index] == null) {
			return "Position is not empty!";
		}
		String temp = product[index];
		product[index]=null;
		return temp + "deleted Successfully..";
	}
	public static int searchProduct(String key) {
		if(key.equals(null)) return -1;
		for(int i=0;i<size;i++) {
			if(product[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}
	public static void printArray() {
//		System.out.println(Arrays.toString(product));
//		for(int i=0;i<size;i++) {
//			System.out.print(product[i] + " ");
//		}
		for(String str : product) {
			System.out.print(str + " ");
		}
	}
}
