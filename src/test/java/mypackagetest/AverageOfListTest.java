package mypackagetest;
import mypackage.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;



public class AverageOfListTest {

	@Test
	public void test() {
		
		Assert.assertEquals(2,AverageOfList.Average(Arrays.asList(1,2,3)),0);
		Assert.assertEquals(4,AverageOfList.Average(Arrays.asList(5,4,3)),0);

	}

}
