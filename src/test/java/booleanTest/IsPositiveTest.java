package booleanTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class IsPositiveTest extends TryTest
{
	@Test(dataProvider = "TestDataPosit")
	public void sumTest(long a, boolean exp){
		boolean result = calculator.isPositive(a);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataPosit")
	public Object[][] posValues(){
		return new Object[][]{
				{6,true},
				{-1,false},
				{0,false}
		};
	}
}
