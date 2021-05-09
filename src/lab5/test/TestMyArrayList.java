package lab5.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab5.MyArrayList;
import lab5.MyLinkedList;

public class TestMyArrayList {

	@Test
	public void test() {
		MyArrayList<Integer> myArrayList= new MyArrayList<>();
		myArrayList.add(1);
		myArrayList.add(2);
		assertEquals(2, myArrayList.size());
		assertEquals(1, (int)myArrayList.remove(0));
		assertEquals(1, myArrayList.size());
		assertEquals(2, (int)myArrayList.get(0));
	}

}
