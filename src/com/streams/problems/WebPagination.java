package com.streams.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WebPagination {

	public static void main(String[] args) {
		List<List<String>> arrayList1 = new ArrayList<List<String>>();
		List<String> l1 = new ArrayList<String>();
		l1.add("A");
		l1.add("B");
		List<String> l2 = new ArrayList<String>();
		l2.add("F");
		l2.add("G");
		arrayList1.add(l1);
		arrayList1.add(l2);


		List<List<String>> arrayList2 = new ArrayList<List<String>>(); 
		List<String>   l3 = new ArrayList<String>();
		l3.add("A"); 
		l3.add("B"); 
		List<String> l4 = new ArrayList<String>();
		l4.add("F");
		l4.add("G"); 
		arrayList2.add(l3);
		arrayList2.add(l4);


		ListComparator<String> listCompare = new ListComparator<String>();
		System.out.println(listCompare.compare(arrayList1, arrayList2));

	}

	public static class ListComparator<T> {

		public Boolean compare(List<List<T>> a, List<List<T>> b) {
			if (a.size() != b.size()) {
				return false;
			}
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).size() != b.get(i).size()) {
					return false;
				}
				for (int k = 0; k < a.get(i).size(); k++) {
					if(!a.get(i).get(k).equals(b.get(i).get(k))) {
						return false;
					}
				}
			}
			return true;
		}

	}


}


