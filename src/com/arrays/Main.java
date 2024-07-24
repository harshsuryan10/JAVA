package com.arrays;

public class Main {

	public static void main(String[] args) {
		ArrayUtils array = new ArrayUtils(5);
		System.out.println(ArrayUtils.addProduct(0, "hello"));
		System.out.println(ArrayUtils.addProduct(1, "hell"));
		System.out.println(ArrayUtils.getProduct(1));
		System.out.println(ArrayUtils.updateProduct(0, "Laptop"));
		System.out.println(ArrayUtils.deleteProduct(0));

	}

}
