package com.tns.string;

public class LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is last index of example";
		int index = str.lastIndexOf("last");
		System.out.println(index);
		index = str.lastIndexOf("of",25);
		System.out.println(index);
		index = str.lastIndexOf("of",10);
		System.out.println(index);
	}

}
