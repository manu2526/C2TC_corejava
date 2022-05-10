package com.tns.lam;

import java.util.ArrayList;

public class Foreach {

	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Mansi");
		obj.add("sayli");
		obj.add("diksha");
		obj.add("aparna");
		for(String a : obj)
		{
			System.out.println(a);
		}
		
	}
}
