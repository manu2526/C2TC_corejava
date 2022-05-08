package com.tns.interf;
import java.util.NavigableMap;
import java.util.TreeMap;

class NavigableMap1 {
	public static void main(String[] args) {

	NavigableMap<Integer,String> b1 = new TreeMap<Integer,String>();
	b1.put(7,"Tamilnadu");
	b1.put(4,"Gujrat");
	b1.put(2,"Meghalaya");
	b1.put(1,"Kerala");
	b1.put(9,"Rajsthan");
	b1.put(8,"Orissa");
	b1.put(6,"Karnataka");
	b1.put(5,"Zarkhand");
	b1.put(2,"MP");
	b1.put(3,"UP");
	System.out.println(b1);
	System.out.println(b1.headMap(6));
}
}