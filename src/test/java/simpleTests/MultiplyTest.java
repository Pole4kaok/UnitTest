package simpleTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class MultiplyTest extends TryTest
{
	@Test(dataProvider = "TestDataMult", groups = "simple test")
	public void multTest(double a,double b,double exp){
		double result = calculator.mult(a,b);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataMult")
	public Object[][] subValues(){
		return new Object[][]{
				{3,3,9},
				{1,-1,-1},
				{1,250,250},
				{0,0,0},
				{-2,-2,4}
		};
	}
}
