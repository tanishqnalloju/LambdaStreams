package mypackage;

import java.util.*;
import java.util.function.Predicate;

public class PalindromeStrings {
	public static List<String> palindromeCalling(List<String> s){
		Predicate<String> predicate = PalindromeStrings::checking;
		List<String> finalStrings=new ArrayList<>();
		for(String i:s) {
			if(predicate.test(i))
				finalStrings.add(i);
		}
		return finalStrings;
		
	}
	
	public static boolean checking(String s) {
		for(int i=0;i<s.length()/2;i++)
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
				return false;
		return true;
	}
	
	public static void main(String args[]) {
		System.out.println(palindromeCalling(Arrays.asList("aba","aca")));
		System.out.println(palindromeCalling(Arrays.asList("abcdcba","aya")));
	}
}
