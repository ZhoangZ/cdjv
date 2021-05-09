package lab5;

public class MyArrayList<T> {
	public final static int LENGTH_ARRAY_EMPTY=5;
	int size=0;
	
	T[] array;
	public MyArrayList(){
		this.array= (T[]) new Object[LENGTH_ARRAY_EMPTY];
	}
	public boolean add(T t) {
		if(size%5==0) {
			T[] tmp = (T[]) new Object[LENGTH_ARRAY_EMPTY*(size+1)];
			for (int i = 0; i < this.array.length; i++) {
				tmp[i] =this.array[i];
			}
			this.array=tmp;
		}
		this.array[size]=t;
		size++;
		return true;
		
	}
	public T remove(int index) {
		T removed= this.array[index];
		for (int i = index+1; i < this.array.length; i++) {
			this.array[i-1]=this.array[i];
		}
		this.size--;
		return removed;
	}
	public T get(int index) {
		return this.array[index];
	}
	public int size() {
		return this.size;
	}
	
	

}
