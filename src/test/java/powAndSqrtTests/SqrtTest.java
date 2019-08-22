package powAndSqrtTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class SqrtTest extends TryTest
{
	@Test(dataProvider = "TestDataSqrt")
	public void sqrtTest(double a,double exp){
		double result = calculator.sqrt(a);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataSqrt")
	public Object[][] sqrtValues(){
		return new Object[][]{
				{4,2},
				{-4,2},
				{1,1}
		};
	}
}
