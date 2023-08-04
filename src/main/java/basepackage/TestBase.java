package basepackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;


@SuppressWarnings("unused")
public class TestBase {
	public static  WebDriver driver;
	

	@BeforeMethod
	public void initializeChrome() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions ();
		option.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver = new EdgeDriver();
		 * driver.get(Constants.URL);
		 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 * driver.manage().window().maximize();
		 */
	}
	public void captureScreen(String testCaseName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting 
		File source =ts.getScreenshotAs(OutputType.FILE);//it will take screen shot 
		String destinationFile = System.getProperty("user.dir")+"/Screenshots/"+testCaseName+".png";
		
		//for fileutils class u need to add dependecy of commans.io
		FileUtils.copyFile(source,new File(destinationFile));
	}
	
	//@AfterMethod
	//public void tearDown() {
	//driver.close();
	//}
	
	
	







}