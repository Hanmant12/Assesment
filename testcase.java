package sqrt;

import org.junit.Test;

import junit.framework.Assert;

public class testcase {

	@Test
	public void sqrtTestcase()
	{
		 arithmatic instance = new  arithmatic();

		double expResult = 2.5;

		double result = instance.findSquareroot(6.25);
		Assert.assertEquals("findSquareroot",expResult, result, 0.0);
	}
}
