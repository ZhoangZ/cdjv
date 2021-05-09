package lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedList<T> {
	@Test
	public void bug() {
		MyLinkedList<Integer> myLinkedList= new MyLinkedList<>();
		myLinkedList.add(1);
		myLinkedList.add(2);
		assertEquals(1, (int)myLinkedList.remove(0));
		assertEquals(0, myLinkedList.indexOf(new Integer(2)));
	}
	private T current;
	private MyLinkedList<T> after;
	public boolean add(T t) {
		
		MyLinkedList<T> tmp=this;
		while(tmp.after!=null) {
			tmp=tmp.after;
		}
		MyLinkedList<T> lastMyLinkedList= new MyLinkedList<T>();
		lastMyLinkedList.current=t;
		lastMyLinkedList.after=null;
		tmp.after=lastMyLinkedList;
		
		return true;
	}
	public int indexOf(T t) {
		int i=0;
		MyLinkedList<T> tmp=this.after;
		do {
			if(tmp.current.equals(t)) {
				return i;
			}
			i++;
			tmp=tmp.after;
		} while(tmp.after!=null);
		
		
		return -1;
	}
	public T remove(int index) {
		MyLinkedList<T> tmp = getLinkedList(index-1);
		if(tmp!=null) {
			MyLinkedList<T> current = getLinkedList(index);
			if(current.after!=null) {
				tmp.after=current.after;
			}
			return current.current;
		}
		else {
			T removed= this.after.current;
			this.after=this.after.after;
			return removed;
		}
		
	}
	public T get(int index) {
		MyLinkedList<T> current = getLinkedList(index);
		return current.current;
	}
	private MyLinkedList getLinkedList(int index) {
		if(index==-1)return null;
		MyLinkedList<T> tmp=this.after;
		int i=-1;
		while(tmp!=null) {
			i++;
//			System.out.println(tmp.current);
			if(i==index)break;
			tmp=tmp.after;
		}
		return tmp;
		
	}
	public T[] toArray() {
		T[] rs= (T[]) new Object[this.size()];
		MyLinkedList<T> tmp=this.after;
		int i=0;
		while(tmp!=null) {
			rs[i]=tmp.current;
			i++;
			tmp=tmp.after;
		}
		return rs;
		
	}
	public int size() {
		int size=0;
		MyLinkedList<T> tmp=this.after;
		while(tmp!=null) {
			size++;
			tmp=tmp.after;
		}
		return size;
		
	}
	
}
