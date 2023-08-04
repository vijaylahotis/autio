package basepackage;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;


import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




@SuppressWarnings("unused")
public class TestAction {
	WebDriver driver;
	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	private static final String CAPITAL_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final SecureRandom RANDOM = new SecureRandom();
	Logger log = LogManager.getLogger(TestAction.class);
	
	public TestAction(WebDriver driver) {
		this.driver=driver;
	}
//	Logger log = Logger.getLogger(TestActions.class);

	public void navigateUrl(String url) {
		try {
			log.info("navigates to url"+url);
			driver.get(url);
		} catch (Exception e) {
			log.info("Failure to navigate to URL"+ url+e.getMessage().toString());
		}}		
	
	public void click(WebElement element) {
		try {
			System.out.println("successfully click on the element " + element);
			log.info("successfully click on the element"+element);
			waitForEle(element).click();
		}catch (NoSuchElementException e) {
			// Handle NoSuchElementException
			System.out.println("Element not found: " + element);
			e.printStackTrace();
		} catch (Exception e) {
			// Handle other exceptions
			System.out.println("Error occurred while clicking element: " + element);
			e.printStackTrace();
		}}	

	public void sendkeys(WebElement element,String input) {
		try {
			log.info("successfully enter sendkeys"+input);
			waitForEle(element).sendKeys(input); 
		} catch (Exception e) {
			// TODO: handle exception
			log.info("Failure to enter sendkeys"+input);
		}	}	
	
	public void verifyElementDispaly(WebElement element) {
		try {
			if(waitForEle(element).isDisplayed()) {
				System.out.println("Emailid displayed successfully ");
			}else {
				System.out.println("Email is not displayed ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			}}

	public WebElement waitForEle(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			e.printStackTrace();}
		return element;
	}

	public int getRandomInt( ) {
		Random randomGenerator = new Random(); 
		int randomInt = randomGenerator.nextInt(1000);
		return randomInt;
	}

	public static String generateRandomString(int length) {
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int randomIndex = RANDOM.nextInt(CAPITAL_CHARACTERS.length());
			char randomChar = CAPITAL_CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}
	
	public static String generateRandomRole(int length) {
		StringBuilder sb = new StringBuilder(length);
		sb.append("Role");
		for (int i = 0; i < length; i++) {
			int randomIndex = RANDOM.nextInt(CAPITAL_CHARACTERS.length());
			char randomChar = CAPITAL_CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}
	
	public static String generateRandomRegionName(int length) {
		StringBuilder sb = new StringBuilder(length);
		sb.append("Location");
		for (int i = 0; i < length; i++) {
			int randomIndex = RANDOM.nextInt(CAPITAL_CHARACTERS.length());
			char randomChar = CAPITAL_CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}
	
	public void selectDropdownOptions(List<WebElement> listOfElement,String dropdownElement ) {
		for (WebElement liElement : listOfElement) {
			if (liElement.getText().trim().equals(dropdownElement)) {
				liElement.click();
				break;
			}}}
	
	public void selectMultipleCharges(List<WebElement> listOfElement,WebElement dropdown) {
		click(dropdown);
	// Select the desired options
    for (WebElement liElement : listOfElement) {
        // Check if the option needs to be selected
        if (liElement.getText().equals("LOADING CHARGES") || liElement.getText().equals("UNLOADING CHARGES") || liElement.getText().equals("CUSTOM CLEARANCE")) {
            // Perform the desired action (e.g., clicking or marking a checkbox)
        	liElement.click();
        }
    }
  //  click(dropdown);
	}
	
	public static String generateRandomEmail(int length) {
        Random random = new Random();
        StringBuilder emailBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            char randomChar = CHARACTERS.charAt(randomIndex);
            emailBuilder.append(randomChar);
        }
        emailBuilder.append("@gmail.com");
        return emailBuilder.toString();
    }

	public static String generateRandomContainerCode(int length) {
        Random random = new Random();
        StringBuilder emailBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(CAPITAL_CHARACTERS.length());
            char randomChar = CAPITAL_CHARACTERS.charAt(randomIndex);
            emailBuilder.append(randomChar);
        }
        emailBuilder.append("1234567");
        return emailBuilder.toString();
    }

	public void captureScreen(String testCaseName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;//typecasting 
		File source =ts.getScreenshotAs(OutputType.FILE);//it will take screen shot 
		String destinationFile = System.getProperty("user.dir")+"/Screenshots/"+testCaseName+".png";
		
		//for fileutils class u need to add dependecy of commans.io
		FileUtils.copyFile(source,new File(destinationFile));
	}
	
	
	

	public void windowhandles()
	{
	String MainWindow = driver.getWindowHandle();
	//System.out.println("Parent/Main window handle is " + MainWindow);
	
	// To handle all new opened window
	Set<String> s1 = driver.getWindowHandles();
	//System.out.println("Child window handle is" + s1);
	Iterator<String> i1 = s1.iterator();
	{
	
	// Here we will check if child window has other child windows and when child window
	//is the main window it will come out of loop.
	
	while (i1.hasNext()) {
		String ChildWindow = i1.next();
		if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
			driver.switchTo().window(ChildWindow);
			driver.close();
			System.out.println("Child window closed");
			// Switch back to the main window which is the parent window.
			driver.switchTo().window(MainWindow);
		}
	}
	}
	}
	public static void waitForPageToLoad(WebDriver driver, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));

        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete';"));

      //  wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return jQuery.active == 0;"));
    }

	public void wait(WebDriver driver) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//i[@class='anticon anticon-eye'])[1]")));
}
	
     // @Step("Find dynamic element {txtReplace}")
        public WebElement findDynamicElement(String element, String txtReplace) throws Exception {
            WebElement el = null;
            String finallocator = null;
            try {
                finallocator = element.replaceAll("#", txtReplace.trim());
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
               wait.until(ExpectedConditions.elementToBeClickable(By.xpath(finallocator)));
                el = driver.findElement(By.xpath(finallocator));
               // logger.info("Dynamic element has been found " + finallocator);
            } catch (Exception e) {
                //logger.warn("Error finding dynamic element " + e.getMessage());
                throw e;
            }
            return el;
        }
        
        
        protected void clickUsingJavaScriptExecutor(WebElement element, int waitTime) {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            try {
                wait.until(ExpectedConditions.elementToBeClickable(element));
                executor.executeScript("arguments[0].click();", element);
            } catch (WebDriverException e) {
                //logger.warn("Failed to click on element " + e.getMessage());
                throw e;
            }
        }
        
        public void clickOnDynamicElement(String element, String txtReplace) throws Exception {
            WebElement el = findDynamicElement(element, txtReplace);
            // logger.info("Clicking on element " + element);
            try {
                this.click(el);
            } catch (NoSuchElementException e) {
                //logger.warn("Failed to click on the element " + e.getMessage());
                throw e;
            } catch (WebDriverException e) {
                try {
                    this.clickUsingJavaScriptExecutor(el, 20);
                } catch (WebDriverException e1) {
                    Actions actions = new Actions(driver);
                    actions.moveToElement(el).click().build().perform();
                    //logger.warn("Element is clicked successfully ");
                }
            } catch (Exception e) {
                //logger.warn("Failed to click on the element " + e.getMessage());
                throw e;
            }
        }
     // Select index item from list
        public void selectByVisibleText(WebElement element, int value) throws Exception {
            //logger.info("select element by index value ");
            try {
                Select select = new Select(element);
                select.selectByIndex(value);
            } catch (NoSuchElementException e) {
                //logger.warn("Failed to select element " + e.getMessage());
                throw e;
            } catch (Exception e) {
               // logger.warn("Error selecting the element " + e.getMessage());
                throw e;
            }
        }
        
        public void selectByValue(WebElement element, String value) throws Throwable {
            //logger.info("select element by index value ");
            try {
               Select se = new Select(element);
                se.selectByVisibleText(value);
            } catch (NoSuchElementException e) {
                //logger.warn("Failed to select element " + e.getMessage());
                throw e;
            } catch (Exception e) {
               // logger.warn("Error selecting the element " + e.getMessage());
                throw e;
            }
        }
    
}
	