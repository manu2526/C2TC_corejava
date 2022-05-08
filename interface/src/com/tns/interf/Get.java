package com.tns.interf;

import java.util.Map;
import java.util.HashMap;
public class Get
{        
	public static void main(String [] args)
      {               
           Map<String,String> map=new HashMap<>();
        	map.put("Name","Tanay");
        	map.put("Occupation","Engineer");
        	map.put("Country","India");
        	
        	System.out.println(map.get("Name"));
	}
}

//get(): It is used to return the value of specified key.
