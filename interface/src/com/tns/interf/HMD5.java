package com.tns.interf;

import java.util.NavigableMap;
import java.util.TreeMap;
class HMD5
{  
   public static void main(String args[])
 	{  
          NavigableMap<Integer,String> b1 = new TreeMap<Integer,String>();  
  b1.put(3,"Tamilnadu");  
  b1.put(2,"Gujarat");  
  b1.put(4,"Orissa");
  b1.put(1,"Kerala");
         System.out.println(b1);
         System.out.println(b1.pollFirstEntry());
         System.out.println(b1);
}
}