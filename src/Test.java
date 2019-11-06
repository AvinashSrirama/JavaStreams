import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	static Map<Integer,Integer> intMap = new HashMap();
		
	public static void main(String[] args) {

		int[] intArray = new int[]{ 2, 1, 4,3};
		
		
		  System.out.println(Arrays.stream(intArray).boxed().mapToInt(Integer::valueOf).sum()); 
		  System.out.println(Arrays.stream(intArray).boxed().reduce(0, (e1,e2)-> e1+e2)); 
		  Integer s = Arrays.stream(intArray).boxed().collect(Collectors.summingInt(Integer::valueOf));
		  
		  System.out.println(s);
		 
		
		
		/*
		 * int sum = 5; IntStream.range(0, intArray.length). forEach(i ->
		 * IntStream.range(0, intArray.length). filter(j -> i!=j && intArray[i]+
		 * intArray[j]==sum). forEach(j -> addPairs(intArray[i], intArray[j])));
		 * 
		 * intMap.entrySet().stream().forEach(action);
		 * System.out.println(IntStream.range(1, 5).anyMatch(i -> i % 2 == 0));
		 */
		
		List<Integer> oddNumbers = IntStream.rangeClosed(1, 10)
	            .filter(n -> n % 2 != 0).boxed().collect(Collectors.toList());
		System.out.println(oddNumbers);
		
		
	}

	private static void addPairs(int i, int j) {
		if(!intMap.containsKey(i)) {
				intMap.put(i, j);	
		}
		// System.out.println("("+i+ ","+j+")");
	}

}