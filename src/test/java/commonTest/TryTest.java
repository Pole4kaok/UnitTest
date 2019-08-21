import com.epam.tat.module4.Calculator;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TryTest
{
	public Calculator calculator;

	@BeforeClass
	public void launch(){ calculator = new Calculator(); }

	@AfterClass
	public void shutdown(){ calculator = null; }


/*
	@Test
	public void testSum()
	{
		Assert.assertEquals(5.0, calculator.sum(2.0, 3.0));
	}

	@Test
	public void testMinus(){
		Assert.assertEquals(4,calculator.sub(-2, 6));
	}


	@Test
	public  void testCos(){
		double result = Math.cos(90);
		Assert.assertEquals(result,calculator.cos(90));
	}
*/
}


