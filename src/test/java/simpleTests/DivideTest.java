package simpleTests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import commonTest.TryTest;

public class DivideTest extends TryTest
{
	@Test(dataProvider = "TestDataDiv", groups = "divide")
	public void divTest(long a,long b,long exp){
		long result = calculator.div(a,b);
		Assert.assertEquals(result,exp);
		long id = Thread.currentThread().getId();
		System.out.println("Hi, I'm DIVIDE " + id);
	}

	@DataProvider(name = "TestDataDiv")
	public Object[][] subValues(){
		return new Object[][]{
				{6L,3L,2L},
				{1L,-1L,-1L},
				{-6L,-3L,2L},
				{0L,0L,0L}
		};
	}
}
