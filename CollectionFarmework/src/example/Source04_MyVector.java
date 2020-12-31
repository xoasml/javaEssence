package example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.StringJoiner;

public class Source04_MyVector<E> implements List{
	Object[] data = null;	// 객체를 담기 위한 객체배열을 선언한다.
	private int capacity = 0 ;		// 용량
	private int size = 0;			// 크기
	
	public Source04_MyVector(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
		}
		
		this.capacity = capacity;
		this.data = new Object[capacity];
	}
	
	public Source04_MyVector() {
		this(10);		// 크기를 지정하지 않으면 크기를 10으로 한다.
	}
	
	// 최소한의 저장공간(capacity)를 확보하는 메서드
	public void ensureCapacity(int minCapacity) {
		if (minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}
	
	public boolean add(Object obj) {
		// 새로운 객체를 저장하기 전에 저장할 공간을 확보한다.
		ensureCapacity(size+1);
		data[size++] = obj;
		return true;
	}
	
	public void sizeCheck(int index) {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
		}
	}
	
	public Object get(int index) {
		sizeCheck(index);
		return data[index];
	}
	
	public Object remove(int index) {
		sizeCheck(index);
		Object oldObj = null;
		
		oldObj = data[index];
		
		// 삭제하고자 하는 객체가 마지막 객체가 아니라면, 배열복사를 통해 빈자리를 채워줘야 한다.
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		
		// 마지막 데이터를 null로 한다. 배열은 0 부터 시작하므로 마지막 요소는 index가 size-1이다.
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
	public boolean remove(Object obj) {
		for(int i = 0 ; i < size ; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity >= capacity) {
			return;
		}
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void clear() {
		for (int i = 0 ; i < size ; i++ ) {
			data[i] = null;
		}
		size = 0;
	}
	
	public Object[] toArray() {
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);
		return result;
	}
	
	public int capacity() {
		return capacity;
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		for (int i = 0 ; i < size ; i++) {
			sj.add((CharSequence) data[i]);
		}
		return sj.toString();
	}
	
	@Override
	public boolean contains(Object o) {
		boolean isExists = false;
		for(int i = 0 ; i < size ; i++) {
			String str = (String)data[i];
			if(str.equals(o)) {
				isExists = true;
				break;
			}
		}
		return isExists;
	}
	
	public boolean equals(List l) {
		if(this.size() != l.size()) {
			return false;
		}
		for(int i = 0 ; i < size ; i++) {
			String str1 = String.valueOf(data[i]);
			String str2 = String.valueOf(l.get(i));
			if(!str1.equals(str2)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public Object set(int index, Object element) {
		sizeCheck(index);
		Object oldObj = null;
		data[index] = element;
		oldObj = data;
		return oldObj;
	}

	@Override
	public void add(int index, Object element) {
		ensureCapacity(size+1);
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException("범위를 벗어 났습니다.");
		}
		
		if(index == size) {
			data[index] = element;
		} else {
			
			Object tmp[] = new Object[size-index+1];
			
			tmp[0] = element;
			
			System.arraycopy(data, index, tmp, 1, tmp.length-1);
			
			System.arraycopy(tmp, 0, data, index, tmp.length);
			
		}
		size++;
	}

	@Override
	public int indexOf(Object o) {
		int index = -1;
		for(int i = 0 ; i < size ; i++) {
			String str = (String)data[i];
			if(str.equals(o)) {
				index = i;
				break;
			}
		}
		return index;
	}

	@Override
	public int lastIndexOf(Object o) {
		int index = -1;
		int cnt = 0;
		for(int i = size-1 ; i >= 0 ; i--) {
			String str = (String)data[i];
			if(str.equals(o)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Source04_MyVector v = new Source04_MyVector(3);
		v.add("2");
		v.add("2");
		v.add("2");
		v.add("2");
		v.add(4, "1");
		
		System.out.println(v);
	}
	//----------------------------------------
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
}























