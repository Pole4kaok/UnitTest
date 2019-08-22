package geomTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class TgTest extends TryTest
{
	@Test(dataProvider = "TestDataTg")
	public void tagTest(double a,double exp){
		double result = calculator.tg(a);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataTg")
	public Object[][] tagValues(){
		return new Object[][]{
				{180, 1.33869021035},
				{0,0}
		};
	}
}
