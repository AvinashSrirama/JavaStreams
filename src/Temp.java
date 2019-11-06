import java.util.Arrays;
import java.util.List;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 2};
		// no generics because of type erasure
		List listOfArrays = Arrays.asList(new Object[]{array});
		System.out.println(listOfArrays);

	}

}
