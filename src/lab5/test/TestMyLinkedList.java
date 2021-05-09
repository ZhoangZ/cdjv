package lab5.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab5.MyLinkedList;

public class TestMyLinkedList {

	@Test
	public void test() {
		MyLinkedList<Integer> myLinkedList= new MyLinkedList<>();
		myLinkedList.add(1);
		myLinkedList.add(2);
		assertArrayEquals(new Integer[] {1,2}, myLinkedList.toArray());
		assertEquals(2, myLinkedList.size());
		assertEquals(1, (int)myLinkedList.remove(0));
		assertEquals(1, myLinkedList.size());
		assertEquals(2, (int)myLinkedList.get(0));
		assertArrayEquals(new Integer[] {2}, myLinkedList.toArray());
		assertEquals(0, myLinkedList.indexOf(new Integer(2)));
	}

}
