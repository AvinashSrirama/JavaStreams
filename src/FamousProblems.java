import java.util.ArrayList;
import java.util.List;

public class FamousProblems {

	public static void main(String[] args) {
	/*******************************************************************/
		//Fibonacci {0,1,1,2,3,5,8,13,21,34,55}
		/*List<Integer> intList = new ArrayList<>();
		int first = 0;
		int second = 1;
		int sum ;
		int n=10;
		
		intList.add(first);
		intList.add(second);
		for(int i=2;i<n;i++) {
			sum=first+second;
			first=second;
			second=sum;
			intList.add(sum);
		}
		
		System.out.println(intList); */
	/*******************************************************************/		
		//Find nth element in Fibonacci series
		/*
		static int fib(int n) 
	    { 
	        if (n <= 1) 
	            return n; 
	        return fib(n - 1) + fib(n - 2); 
	    } 
		*/
	/*******************************************************************/	
		//Prime Number
		/*int n =28;
		boolean flag=true;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("is prime Number");
			*/
	/*******************************************************************/	
		//Palindromes
		/*String s = "abcdedcba";
		int length = s.length();
		boolean flag=true;
		
		for(int i=0;i<length/2;i++) {
			if(s.charAt(i)==s.charAt(length-1-i))
				continue;
			else
				flag=false;
		}
		if(flag)
			System.out.println("is palindrome");
		*/
	/*******************************************************************/	
		
		System.out.println(17/3);
		System.out.println(17%3);
		
	}

}
