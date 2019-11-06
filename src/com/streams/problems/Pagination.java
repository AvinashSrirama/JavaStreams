package com.streams.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pagination {

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

		DynamicComparator d = new DynamicComparator (0);
		Collections.sort(arrayList1, d.compareBy(1));


	}
	
	public static class DynamicComparator implements Comparator<List<List<String>>>{
	    private static int compareBy = 0;

	    public DynamicComparator(int compareBy) {
	        this.compareBy = compareBy;
	    }

	    public DynamicComparator compareBy(int compareBy) {
	        this.compareBy = compareBy;
	        return this;
	    }

	    public int compare(List<List<String>> a, List<List<String>> b) {
	        if (a.size() != b.size()) {
				return 0;
			}
			for (int i = 0; i < a.size(); i++) {
				if (a.get(i).size() != b.get(i).size()) {
					return 0;
				}
					if(!a.get(i).get(compareBy).equals(b.get(i).get(compareBy))) {
						return 0;
					}
			}
			return 1;
			
	    }
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


