import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Amex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "this is old laptop";
		String s2 = "this is new laptop";
		
		//Sol 1
		List<String> newList = Stream.of(s1.split(" ")).filter(i -> !Arrays.asList(s2.split(" ")).contains(i)).collect(Collectors.toList());
		System.out.println(Stream.of(s2.split(" ")).filter(i -> !Arrays.asList(s1.split(" ")).contains(i)).collect(Collectors.toCollection(() -> newList)));
		
		//Sol 2
		List<String> destList = Stream.concat(Arrays.asList(s1.split(" ")).stream(), Arrays.asList(s2.split(" ")).stream()).collect(Collectors.toList());
		Map<String,Integer> map = new HashMap<>();
		   for(String s : destList) {
			   if(map.containsKey(s)) {
				   map.put(s, map.get(s)+1);
			   }
			   else {
				   map.put(s,1);
			   }
		   }
		   
		   List<String> list = new ArrayList<String>();
		   List<String> newwList = map.entrySet().stream().filter(i -> i.getValue()==1).map(x -> x.getKey()).collect(Collectors.toList());
		  //map.entrySet().stream().filter(i -> i.getValue()==1).peek(x -> list.add(x.getKey())).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		int even2 = number.stream().filter(i ->i%1==0).reduce(0, Integer::sum);
		
		System.out.println(number.stream().filter(i -> i%2==0).reduce((ans,i)-> ans+i).get());
		
         		
	}

}
