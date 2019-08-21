import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.Math;

public class SumTest extends TryTest
{
	@Test(dataProvider = "TestDataSum")
	public void sumTest(double a,double b,double exp){
		double result = calculator.sum(a,b);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataSum")
	public Object[][] sumValues(){
		return new Object[][]{
				{5,6,11},
				{1,-1,0},
				{-2,-3,-5},
				{0,0,0}
		};
	}
}
