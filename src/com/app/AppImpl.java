package com.app;

import java.util.ArrayList;
import java.util.List;

public class AppImpl {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Sandip");
		myList.add("Karande");
		myList.add("Patil");
		
		myList.stream().forEachOrdered(listElement->System.out.println(listElement));
		
		System.out.println("Successfully Run jenkin Job...........");
	}
}
