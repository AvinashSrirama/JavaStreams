package com.streams.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringProblems {

	public static void main(String[] args) {

		/* String s = "abcdde";
       String[] newS = s.split("");
       Set<String> tree= new HashSet<String>();
       Arrays.stream(newS).forEach(i -> tree.add(i));
       System.out.println(tree.toString().replaceAll(",", ""));
       */
	   
	   String sentence = "This is very very big sentence trying to solve using using streams";
	   String[] bannedWords = {"very","is"};
	   System.out.println(Arrays.stream(sentence.split(" ")).filter(i -> !Arrays.asList(bannedWords).contains(i)).collect(Collectors.toList()));
	   List<String> list =  Arrays.stream(sentence.split(" ")).filter(i -> !Arrays.asList(bannedWords).contains(i)).collect(Collectors.toList());
	   
	   Map<String,Integer> map = new HashMap<>();
	   for(String s : list) {
		   if(map.containsKey(s)) {
			   map.put(s, map.get(s)+1);
		   }
		   else {
			   map.put(s,1);
		   }
	   }
	   System.out.println(map);
	   
	   String maxVal = "";
	   
	   String maxKey = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
	   System.out.println(maxKey);
	   
	   }
	   
	   
	}
	
	

