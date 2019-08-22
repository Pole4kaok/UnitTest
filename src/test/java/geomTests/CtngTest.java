package geomTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class CtngTest extends TryTest
{
	@Test(dataProvider = "TestDataCtg")
	public void tagTest(double a,double exp){
		double result = calculator.ctg(a);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataCtg")
	public Object[][] ctgValues(){
		return new Object[][]{
				{90, -0.50120278338},
				{180,0.74699881441}
		};
	}
}
