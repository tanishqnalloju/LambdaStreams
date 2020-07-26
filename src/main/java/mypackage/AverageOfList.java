package mypackage;
import java.util.*;
import java.util.function.Function;
public class AverageOfList {
	public static int Average(List<Integer> a) {
		Function<List<Integer>,Integer> sum = s ->{int u=0; for(Integer i:s) u+=i; return u;};
		Function<List<Integer>, Integer> function = b -> {int y=sum.apply(a); return y/b.size();};
		return function.apply(a);
	}
	
	public static void main(String args[]) {
		System.out.println(Average(Arrays.asList(10,20,30)));
		System.out.println(Average(Arrays.asList(40,50,30)));
		
	}
}
