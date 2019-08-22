import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlSuite;

import TestListener.TestListener;

public class CustomRunner
{
	public static void main(String[] args){
		TestNG testNG = new TestNG();
		testNG.addListener(new TestListener());

		XmlSuite suite = new XmlSuite();
		suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));


		List<XmlSuite> suites = new ArrayList<>();
		suites.add(suite);

		testNG.setXmlSuites(suites);
		testNG.run();
	}
}
