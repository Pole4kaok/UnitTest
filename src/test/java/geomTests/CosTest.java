package geomTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class CosTest extends TryTest
{
	@Test(dataProvider = "TestDataCos")
	public void sumTest(double a,double exp){
		double result = calculator.cos(a);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataCos")
	public Object[][] cosValues(){
		return new Object[][]{
				{90, -0.44807361612},
				{0,1}
		};
	}
}
