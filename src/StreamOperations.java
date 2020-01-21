import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperations {

	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		/*
		//Filtering 
		memberNames.stream().filter(p -> p.startsWith("A")).forEach(System.out::println);
		memberNames.stream().filter(p -> p.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
		//Sorting
		memberNames.stream().sorted().map(String::toLowerCase).forEach(System.out::println);
		memberNames.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//using comparator
		memberNames.stream().sorted((str1, str2) 
                -> Character.compare(str1.charAt(str1.length() - 1),str2.charAt(str2.length() - 1))).forEach(System.out::println);
		
		Map<Integer, String> hmap = new HashMap<Integer, String>(); 
        hmap.put(11, "Apple"); 
        hmap.put(22, "Orange"); 
        hmap.put(33, "Kiwi");  
        hmap.put(44, "Banana"); 
        
        */
        Comparator<String> com = new Comparator<String>() {
        	
        	@Override
        	public int compare(String s1, String s2){
        		return s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1) ;
        	}
        };
        
        
        memberNames.stream().sorted(com).forEach(System.out::println);
        memberNames.sort(com);
        for (String developer : memberNames) {
			System.out.println(developer);
		}
        memberNames.stream().sorted((l1,l2) -> (l1.charAt(l1.length() - 1)) - (l2.charAt(l2.length() - 1))).forEach(System.out::println);
        
        System.out.println("hjjjjjjj");
        memberNames.stream().sorted(Comparator.comparing(i -> i.charAt(i.length()-1))).forEach(System.out::println);

	}

}
