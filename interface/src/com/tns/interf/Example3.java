package com.tns.interf;

import java.util.Map;
import java.util.HashMap;
public class Example3
{        
	public static void main(String [] args)
      {               
          Map<String,String> map=new HashMap<>();
        	map.put("Name","Tanay");
        	map.put("500","Engineer");
        	map.put("Country","India");
        	System.out.println(map.get(500));
	}
}
