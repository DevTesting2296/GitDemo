package FrameWorkTest.MavenTest;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReportTest {
	
	ExtentReports report ;
	
	@BeforeTest
	public void reportTesting()
	{
		String path = System.getProperty("user.dir")+"\\reports\\index.html" ;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path) ;
		reporter.config().setReportName("Testing Report");
		reporter.config().setDocumentTitle("Report Window");
		
		report = new ExtentReports() ;
		report.attachReporter(reporter);
		report.setSystemInfo("Tester", "Student");
				
	}
	
	@Test
	public void sampleTestOne()
	{
		report.createTest("Sample Test 1") ;
		WebDriver driver = new ChromeDriver() ;
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.getTitle()) ;
		driver.close() ;
		report.flush() ;
		
	}
	
	@Test
	public void sampleTestTwo()
	{
		report.createTest("Sample Test 2") ;
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		System.out.println(driver.getTitle()) ;
		driver.close() ;
		report.flush() ;
		
	}
	
	@Test
	public void sampleTestThree()
	{
		report.createTest("Sample Test 3") ;
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle()) ;
		driver.close() ;
		report.flush() ;
		
	}
	
	@Test
	public void sampleTestFour()
	{
		ExtentTest test = report.createTest("Sample Test 4") ;
		WebDriver driver = new ChromeDriver() ;
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//abc[@id='xyz']")) ;		
		/*Assert.assertTrue(false);
		test.fail("4th Test Case failed") ; */
		driver.close() ;
		report.flush() ;
		
	}
	

}
