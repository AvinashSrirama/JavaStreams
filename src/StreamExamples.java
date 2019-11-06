import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

	public static void main(String[] args) {
		
		Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p));
        
		Stream<String> stream1 = Stream.of("A$B$C".split("\\$"));
        stream1.forEach(p -> System.out.println(p));
        
        //Convert Streams to collections or other data structures
        //To List
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        List<Integer> newList = list.stream().filter(p -> p%2 == 0).collect(Collectors.toList());
        System.out.println(newList);
       
        //To Array
        Integer[] newIntArray = list.stream().filter(p -> p%2 == 0).toArray(Integer[]::new);
        System.out.println(newIntArray);
        
        //To Map
        Map<Integer, String> hmap = new HashMap<Integer, String>(); 
        hmap.put(11, "Apple"); 
        hmap.put(22, "Orange"); 
        hmap.put(33, "Kiwi");  
        hmap.put(44, "Banana"); 
        
        Map<Integer, String> newMap = hmap.entrySet().stream().filter(p -> p.getValue() == "Apple").collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        System.out.println("Result: " + newMap);
        
        Map<Integer, String> newMap2 = hmap.entrySet().stream().filter(p -> p.getKey().intValue() == 22).collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        System.out.println("Result: " + newMap2);
        
        //Aggregate methods
        String s = "kjgsdfKhds";
		char c = 'k';
		System.out.println(s.chars().filter(p -> (p == Character.toLowerCase(c) || p == Character.toUpperCase(c))).count());
        
        
        
	}

}
