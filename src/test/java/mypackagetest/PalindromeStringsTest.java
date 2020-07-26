package mypackagetest;
import mypackage.*;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeStringsTest {

	@Test
	public void test() {
		Assert.assertArrayEquals(new String[]{"aba","aca"}, PalindromeStrings.palindromeCalling(Arrays.asList("aba","aca","asdsd")).toArray());
		Assert.assertArrayEquals(new String[]{"abcdcba","aya"}, PalindromeStrings.palindromeCalling(Arrays.asList("abcdcba","afga","aya")).toArray());
	}

}
