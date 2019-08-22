package commonTest;

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
	public void launch()
	{
		calculator = new Calculator();
	}

	@AfterClass
	public void shutdown()
	{
		calculator = null;
	}

}


