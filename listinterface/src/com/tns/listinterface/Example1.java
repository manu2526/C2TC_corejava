package com.tns.listinterface;

import java.util.*;
public class Example1
{
    public static void main(String args[])
    {
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        while(num!=0)
        {
            list.add(s.nextInt());
            num--;
        } 
        Collections.shuffle(list);
        System.out.println(list);
    }
}



