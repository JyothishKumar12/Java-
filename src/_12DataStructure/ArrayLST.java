package _12DataStructure;

public class ArrayLST<T> {

	private T arr[];
	private int capacity;
	private int size;



	@SuppressWarnings("unchecked")
	public ArrayLST(){
		capacity=4;
		size =0;
		arr = (T[])new Object[capacity];
	}	



	public void add(T value){
		if(size==capacity) {
			expandArraySize();
			}
		arr[size]=value;
		size++;
	}



	private void expandArraySize() {
		capacity = 2*capacity;
		arr = java.util.Arrays.copyOf(arr,capacity);
	}
	
	
	public void display() {
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i] +" ");
		}	
	}
	
	
	
	public void insertAt(int pos,T value) {
		if(size==capacity) {
			expandArraySize();
		}
		System.out.println("----------");
		for(int i=size-1;i>=pos;i--){
			arr[i+1]=arr[i];
		}
		arr[pos]=value;
		size++;
	}
	
	public void deleteAtPosition(int position) {
	
		for(int i = position+1;i<size;i++) {
			arr[i-1]=arr[i];
		}
		size--;
		
		shrinkArray();
	}
	
	public int size() {
		return size;
	}
	
	private void shrinkArray() {
		if(capacity>size && capacity>(3*size)) {
			capacity = capacity/2;
			arr = java.util.Arrays.copyOf(arr,capacity);
		}
	}
}
