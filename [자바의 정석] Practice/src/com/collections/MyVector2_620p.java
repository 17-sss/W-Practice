package com.collections;

import java.util.Iterator;

public class MyVector2_620p extends MyVector_591p implements Iterator {
	int cursor=0;
	int lastRet=-1;
	
	public MyVector2_620p(int capacity) {
		super(capacity);
	}
	public MyVector2_620p() {
		this(10);
	}
	public String toString() {
		String tmp="";
		Iterator it = iterator();
		
		for (int i=0; it.hasNext(); i++) {
			if(i!=0) tmp+=", ";
			tmp+= it.next();	//tmp +=next().toString();
		}
		return "["+tmp+"]"; //tmp +=next().toString();
	}
	public Iterator iterator() {
		cursor=0; //cursor�� lastRet�� �ʱ�ȭ�Ѵ�.
		lastRet=-1;
		return this;
	}
	@Override
	public boolean hasNext() {
		return cursor != size();
	}

	@Override
	public Object next() {
		Object next = get(cursor);
		lastRet=cursor++;
		return next;
	}
	
	public void remove() {
		// ���̻� ������ ���� ������ IllegalStateException�� �߻���Ų��.
		if(lastRet==-1) {
			throw new IllegalStateException();
		} else {
			remove(lastRet);
			cursor--;	//���� �Ŀ� cursor�� ��ġ�� ���ҽ�Ų��.
			lastRet=-1;	//lastRet�� ���� �ʱ�ȭ�Ѵ�.
		}
	}

} //class
