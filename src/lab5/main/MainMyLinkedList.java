package lab5.main;

import java.util.Arrays;

import lab5.MyLinkedList;

public class MainMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList<Integer> myLinkedList= new MyLinkedList<>();
		myLinkedList.add(1);
		myLinkedList.add(2);
//		System.out.println(myLinkedList.size());
//		System.out.println(myLinkedList.remove(0));
//		System.out.println(myLinkedList.size());
//		System.out.println(myLinkedList.get(0));
//		myLinkedList.toArray();
		System.out.println(Arrays.toString(myLinkedList.toArray()));
	}
}
