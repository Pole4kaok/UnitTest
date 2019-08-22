package geomTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class SinTest extends TryTest
{
	@Test(dataProvider = "TestDataSin")
	public void sumTest(double a,double exp){
		double result = calculator.sin(a);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataSin")
	public Object[][] cosValues(){
		return new Object[][]{
				{90, 0.8939966636005579},
				{0,0}
		};
	}
}
