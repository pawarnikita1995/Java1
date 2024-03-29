package com.syn.java.basics.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.syn.java.basics.variables.Person;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		List al = new LinkedList();
		
		al.add(25);
		al.add(23.3);
		al.add("abcd");
		al.add(new Person());
		
		printCollectionUsingForloop(al);
		
		al.add(0, "new element");
		printCollectionUsingForloop(al);
		
		al.remove("new element");
		printCollectionUsingForloop(al);
		
	
	}

	private static void printCollection(List al) {
		System.out.println("----------------------------------------------");
		System.out.println("Total elements in collection " + al.size());
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	
	
	
	private static void printCollectionUsingForloop(List al) {
		System.out.println("----------------------------------------------");
		System.out.println("Total elements in collection " + al.size());
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println("Element at index " + i + " is " +  al.get(i));
		}
	}
}
