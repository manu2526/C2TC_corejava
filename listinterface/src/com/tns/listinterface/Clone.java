package com.tns.listinterface;

import java.util.ArrayList;

public class Clone
{
    public static void main(String[] args)
    {
      ArrayList al= new ArrayList();
        Object cloneList; 
        al.add("Java");
        al.add("C++");
        al.add("Count");
      System.out.println(al);
      cloneList= al.clone(); 
      System.out.println(cloneList);
    }
}
