package com.tns.interf;


import java.util.*; 
public class Hash_map_Demo2 { 
  public static void main(String[] args) 
  { 
     HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
          hash_map.put(1, "eat"); 
          hash_map.put(2, "mobile"); 
          hash_map.put(3, "sleep"); 
          hash_map.put(4, "repeat"); 
         System.out.println("Initial Map : " + hash_map); 
     HashMap<Integer, String> new_map = new HashMap<Integer,String>(hash_map);
          System.out.print(new_map);
  } 
}

//
//The java.util.HashMap.clone() method is used to return a shallow copy of the mentioned hash map. It just creates a copy of the map.