package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Pers {
	String s = "»ç¶÷";
	int i = 20;

	@Override
	public String toString() {
		return "Pers [s=" + s + ", i=" + i + "]";
	}

}

public class IteratorEx1_616p_1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new IteratorEx1_616p_1());
		list.add(new Pers());
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

	} // main
}
