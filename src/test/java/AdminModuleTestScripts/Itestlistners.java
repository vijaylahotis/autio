package AdminModuleTestScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import basepackage.TestBase;


@SuppressWarnings("unused")
public class Itestlistners extends AdminModule implements ITestListener {
	public ExtentSparkReporter htmlReporter;
	public ExtentReports reports;
	public ExtentTest logger;

	
	
	public void configReport() {
		htmlReporter =new ExtentSparkReporter("Extent-Report.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		reports.setSystemInfo("Enviornment","DEV");
		reports.setSystemInfo("User", "Nagendra");
		
		htmlReporter.config().setReportName("TalentSavvy Report");
		htmlReporter.config().setDocumentTitle("TalentSavvy Project");
		htmlReporter.config().setTheme(Theme.DARK);
	}
	
//	public void captureScreen(String testCaseName) throws IOException
//	{
//		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting 
//		File source =ts.getScreenshotAs(OutputType.FILE);//it will take screen shot 
//		String destinationFile = System.getProperty("user.dir")+"/Screenshots/"+testCaseName+".png";
//		
//		//for fileutils class u need to add dependecy of commans.io
//		FileUtils.copyFile(source,new File(destinationFile));
//	}
	
	@Override
	public void onFinish(ITestContext Result) {
		System.out.println("On Finish method invoked...");
		reports.flush();
	}

	@Override
	public void onStart(ITestContext Result) {
		configReport();
		System.out.println("On Start method invoked...");
		
	}

	@Override
	public void onTestFailure(ITestResult Result) {
		
		logger=reports.createTest(Result.getName());
		logger.log(Status.FAIL, MarkupHelper.createLabel(Result.getName(), ExtentColor.RED));
		try {
			
			captureScreen(Result.getName());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+Result.getName()+".png";
		File f=new File(screenshotPath);
		if(f.exists()) {
			try {
		logger.fail("Screenshot is below:"+logger.addScreenCaptureFromPath(screenshotPath))	;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
			}

	@Override
	public void onTestSkipped(ITestResult Result) {
		logger=reports.createTest(Result.getName());
		logger.log(Status.SKIP, MarkupHelper.createLabel(Result.getName(), ExtentColor.ORANGE));
	}
		
	

	@Override
	public void onTestStart(ITestResult Result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult Result) {
		logger=reports.createTest(Result.getName());
		logger.log(Status.PASS, MarkupHelper.createLabel(Result.getName(), ExtentColor.GREEN));
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
		
	}

}


