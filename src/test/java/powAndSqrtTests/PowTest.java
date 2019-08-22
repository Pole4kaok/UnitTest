package powAndSqrtTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class PowTest extends TryTest
{
	@Test(dataProvider = "TestDataPow")
	public void powTest(double a,double b,double exp){
		double result = calculator.pow(a,b);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataPow")
	public Object[][] powValues(){
		return new Object[][]{
				{2,2,4},
				{3,3,27},
				{-2,2,4},
				{0,0,1}
		};
	}
}
