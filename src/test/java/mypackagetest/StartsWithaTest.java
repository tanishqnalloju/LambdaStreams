package mypackagetest;
import mypackage.*;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class StartsWithaTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"abc","acd"}, StartsWitha.StartsWithaLen3(Arrays.asList("abc","acd","audi")).toArray());
		Assert.assertArrayEquals(new String[] {"abc", "aur"}, StartsWitha.StartsWithaLen3(Arrays.asList("abc","bcdfd","asdsd","aur","utr")).toArray());
		
	}

}
