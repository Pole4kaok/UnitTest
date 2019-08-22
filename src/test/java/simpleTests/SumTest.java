package simpleTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.Math;
import java.util.Date;

import commonTest.TryTest;

public class SumTest extends TryTest
{
	@Test(dataProvider = "TestDataSum",groups = "simple test")
	public void sumTest(double a,double b,double exp){
		double result = calculator.sum(a,b);
		Assert.assertEquals(result,exp);
		long id = Thread.currentThread().getId();
		System.out.println("Hi, I'm sum " + id);
	}

	@DataProvider(name = "TestDataSum")
	public Object[][] sumValues(){
		return new Object[][]{
				{5,6,11},
				{1,-1,0},
				{-2,-3,-5},
				{0,0,0}
		};
	}
}
