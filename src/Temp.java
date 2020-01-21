import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Temp {

	public static void main(String[] args) {
		String s1 = "AA BB CC BB BB CC BB";
		String[] strings = s1.split(" ");
		  // Finding distinct values
		  HashMap<String,Integer> map = new HashMap<String,Integer>();
		  for (String s : strings) {
		    Integer i = (Integer) map.get(s);
		    if (i != null) {
		      map.put(s, i+1);
		    } else {
		    map.put(s, 1);
		  }
		}
		  
		 map.entrySet().stream().forEach(i -> System.out.println(i));
		 
		 
		 String str = "abcde";
		 char[] charArray = str.toCharArray();
		 int i=0;
		 int j=str.length()-1;
		 
		 for(i=0,j=str.length()-1;i<j;i++,j--)
		 {
			 char c = charArray[j];
			 charArray[j]=charArray[i];
			 charArray[i]=c;
			 
		 }
		 System.out.println(new String(charArray));
		 
		 IntStream.range(0,charArray.length).mapToObj(k -> charArray[(charArray.length-1)-k]).forEach(System.out::print);
		 List<Character> s = IntStream.range(0,charArray.length).mapToObj(k -> charArray[(charArray.length-1)-k]).collect(Collectors.toList());
		 
		 List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
         
	        List<Integer> listOfIntegers = listOfStrings.stream()
	                                        .map(Integer::parseInt)
	                                        .collect(Collectors.toList());
		 
	}

}
