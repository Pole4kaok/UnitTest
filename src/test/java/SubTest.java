import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest extends TryTest
{
	@Test(dataProvider = "TestDataSub")
	public void subTest(double a,double b,double exp){
		double result = calculator.sub(a,b);
		Assert.assertEquals(result,exp);
	}

	@DataProvider(name = "TestDataSub")
	public Object[][] subValues(){
		return new Object[][]{
				{6,5,1},
				{1,-1,2},
				{2,3,-1},
				{0,0,0}
		};
	}
}
