package com.tns.interf;

import java.util.Map;
import java.util.HashMap;
class Example4
{
   public static void main(String args[])
 	{

	   Map<Character,String> map=new HashMap<Character,String>();
    		map.put('a',"Anil");
    		map.put('b',"Babu");
    		map.put('c',"Charan");
    		map.put('d',"Dharani");
    		map.put('c',"charani");
             System.out.println(map);
}
}
