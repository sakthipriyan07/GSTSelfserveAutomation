package Keymethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;


import PageFactory.LoginPageobjects;


public class GSTRegistration {

	ExtentTest test;
	
	ScreenShot screenshot = new ScreenShot();
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());
	public void GstRegistration(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("ddsshhmm");
		String Date12 = dateFormat2.format(new Date());
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("GST Registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);
		// HelpdeskPageobject.TaxCompliance.click();
		long start = System.currentTimeMillis();
		WebElement element3 = driver.findElement(By.xpath("(//a[contains(text(),'GST Registration')])[3]"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);
		WebElement findElement = driver.findElement(By.xpath("//input[@id='email']"));
		findElement.click();
		
		
		//*******************************//
		screenshot.screenshot1(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot1.png",
				"CriticalNote").build());
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load - " + totalTime);

		test.log(Status.PASS, "GST registration Page redirection  " + totalTime + "ms");
		// HelpdeskPageobject.GSTRegistration.click();
        //********************************
		findElement.sendKeys("shakthi" + Date1GstRegistration + "@yopmail.com");

		LoginPageobjects.Phonenumber.sendKeys("67" + Date12);
		Thread.sleep(2000);
		WebElement findElement2 = driver.findElement(By.xpath("((//input[@type='text'])[1])[1]"));
		JavascriptExecutor findElement54 = (JavascriptExecutor) driver;
		findElement54.executeScript("arguments[0].click();", findElement2);

		findElement2.sendKeys("chen");
		Thread.sleep(10000);
		try {
		WebElement findElement222 = driver.findElement(By.xpath("//li[@class='hover:clib-bg-[#E6EAEE] clib-cursor-pointer clib-px-3 clib-py-2 clib-text-black']"));
		findElement222.click();
		}catch (Exception selection) {
			WebElement findElement222 = driver.findElement(By.xpath("//li[contains(text(),'Chengalpattu, Tamil Nadu')]"));
			findElement222.click();
			
		}

		Robot robot = new Robot();

//		if (LoginPageobjects.whatsapptogleoff.isSelected()) {
//
//			test.log(Status.PASS, "whatsapptogle off");
//		} else {
//System.out.println("failed");
//			test.log(Status.FAIL, "whatsapptogleoff Failed");
//		}

		Thread.sleep(2000);
		long start1 = System.currentTimeMillis();

		WebElement element300 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		JavascriptExecutor executor300 = (JavascriptExecutor) driver;
		executor300.executeScript("arguments[0].click();", element300);

		System.out.println("succes1");

		long finish1 = System.currentTimeMillis();
		long totalTime1 = finish1 - start1;
		System.out.println("Age of Business Page Redirection " + totalTime1);

		Thread.sleep(3500);
		screenshot.screenshot2(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot2.png",
				"CriticalNote").build());
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(
					By.xpath("//label[contains(text(),'No, I don’t have a company name')]/parent::div")));
			driver.findElement(By.xpath("//label[contains(text(),'No, I don’t have a company name')]/parent::div"))
					.click();
			screenshot.screenshot3(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot3.png",
					"Age of Business selection page ").build());
			
			
			Thread.sleep(2000);
			LoginPageobjects.Next.click();
			Thread.sleep(3000);
			LoginPageobjects.Software.click();
			Thread.sleep(2000);

//			Thread.sleep(2000);
//			LoginPageobjects.Ageofbusiness.click();
//			robot.keyPress(KeyEvent.VK_DOWN);
//			robot.keyRelease(KeyEvent.VK_DOWN);
//
//			robot.keyPress(KeyEvent.VK_ENTER);
//			robot.keyRelease(KeyEvent.VK_ENTER);
//			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//			Thread.sleep(3000);
		} catch (Exception e) {
			screenshot.screenshot4(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot4.png",
					"Age of Business selection page ").build());
			System.out.println(e);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(),'New business')]")));
			driver.findElement(By.xpath("//label[contains(text(),'New business')]")).click();

			test.log(Status.PASS, "Payment Cart PageTotal Time for page load " + totalTime1);
			LoginPageobjects.Next.click();
			Thread.sleep(4000);
			System.out.println(e);
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//label[contains(text(),'No, I don’t have a company name')]")));

			JavascriptExecutor executor34 = (JavascriptExecutor) driver;
			executor34.executeScript("arguments[0].click();", LoginPageobjects.noidonthaveacompanyNameGSTRig);

			Thread.sleep(2000);
			LoginPageobjects.Next.click();
			Thread.sleep(4500);
			LoginPageobjects.Software.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		long start21 = System.currentTimeMillis();
		LoginPageobjects.Next.click();
		try {
			wait.until(ExpectedConditions

					.elementToBeClickable(By.xpath("//button[@class='styles_sendBtn__xW91N']")));
			driver.findElement(By.xpath("//button[@class='styles_sendBtn__xW91N']")).click();
			long finish21 = System.currentTimeMillis();
			long totalTime21 = finish21 - start21;
			System.out.println("Payment Page Redirection - " + totalTime21);
			screenshot.screenshot5(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot5.png",
					"Mobile OTP verification page").build());
			

			driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("0");
			driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("0");
			driver.findElement(By.xpath("(//input[@type='number'])[4]")).sendKeys("0");
			driver.findElement(By.xpath("(//input[@type='number'])[5]")).sendKeys("0");
			Thread.sleep(1500);
			LoginPageobjects.Next.click();
		} catch (Exception open) {

			System.out.println("Experiment 2");
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='styles_btnContainer__u7tnS']")))
				.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='styles_leftSection__isIh8 false'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='cardNumber']")).click();
		driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("5123456789012346");
		screenshot.screenshot6(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot6.png",
				"Payment cart page").build());
		driver.findElement(By.xpath("//input[@name='cardExpiry']")).click();
		driver.findElement(By.xpath("//input[@name='cardExpiry']")).sendKeys("1224");
		driver.findElement(By.xpath("//input[@name='cardCVV']")).click();
		driver.findElement(By.xpath("//input[@name='cardCVV']")).sendKeys("123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		try {

			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#password")));
			driver.findElement(By.cssSelector("#password")).click();
			driver.findElement(By.cssSelector("#password")).sendKeys("123456");

			driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
			Thread.sleep(6000);
//		List<String> all29 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(all29.get(0));
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			String parentWindow = driver.getWindowHandle();
			driver.switchTo().window(parentWindow);
			Thread.sleep(5000);

		} catch (Exception uop) {
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='card-num'])[3]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='cardNumber']"))).click();
			
			
			driver.findElement(By.xpath("//input[@name='cardNumber']")).sendKeys("5123456789012346");
			driver.findElement(By.xpath("//input[@name='cardExpiry']")).click();
			driver.findElement(By.xpath("//input[@name='cardExpiry']")).sendKeys("1224");
			driver.findElement(By.xpath("//input[@name='cardCvv']")).click();
			driver.findElement(By.xpath("//input[@name='cardCvv']")).sendKeys("123");
			screenshot.screenshot7(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot7.png",
					"Mobile OTP verification page").build());
			driver.findElement(By.xpath("//input[@name='cardOwnerName']")).click();
			driver.findElement(By.xpath("//input[@name='cardOwnerName']")).sendKeys("TESTING");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//button[@class='common-btn'])[5]")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#password")).click();
			driver.findElement(By.cssSelector("#password")).sendKeys("123456");

			driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
			Thread.sleep(6000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(7000);
			String parentWindow = driver.getWindowHandle();
			driver.switchTo().window(parentWindow);
			Thread.sleep(5000);
		}
		screenshot.screenshot8(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot8.png",
				"Start application").build());
		try {
			driver.findElement(By.xpath("//p[contains(text(),'Start application')]")).click();
			Thread.sleep(7000);
			
			driver.findElement(By.xpath("//p[contains(text(),'Send OTP')]")).click();

		} catch (Exception Boom) {
			Thread.sleep(7000);
			driver.findElement(By.xpath("//p[contains(text(),'Send OTP')]")).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='flex gap-5 ']/child::input)[1]")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='flex gap-5 ']/child::input)[1]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class='flex gap-5 ']/child::input)[2]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class='flex gap-5 ']/child::input)[3]")).sendKeys("0");
		driver.findElement(By.xpath("(//div[@class='flex gap-5 ']/child::input)[4]")).sendKeys("0");
		Thread.sleep(3000);
		screenshot.screenshot9(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot9.png",
				"Email OTP Validation").build());
	}

	public void SoleProprietorship(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("SoleProprietorship");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement findElement4 = driver.findElement(By.xpath("(//input[@id='dropdown'])[2]"));
		Thread.sleep(2500);

		JavascriptExecutor executo = (JavascriptExecutor) driver;
		executo.executeScript("arguments[0].click();", findElement4);
		WebElement findElement5 = driver.findElement(By.xpath("//li[contains(text(),'Sole Proprietorship')]"));

		JavascriptExecutor execut = (JavascriptExecutor) driver;
		execut.executeScript("arguments[0].click();", findElement5);
		Thread.sleep(3000);
		
		
		
		screenshot.screenshot10(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot10.png",
				"Sole Proprietorship").build());
		
		
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='px-4
		// py-[20px] text-[14px] bg-[#F7F9FA]']/child::input"))).click();
		WebElement findElement6 = driver
				.findElement(By.xpath("//section[@class='px-4 py-[20px] text-[14px] bg-[#F7F9FA]']/child::input"));

		JavascriptExecutor execut6 = (JavascriptExecutor) driver;
		execut6.executeScript("arguments[0].click();", findElement6);
		driver.findElement(By.xpath("//section[@class='px-4 py-[20px] text-[14px] bg-[#F7F9FA]']/child::input"))
				.sendKeys("Testing");

		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		driver.findElement(By.xpath("//div[@class='flex flex-col gap-2']/child::input")).sendKeys("Milk");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/d/YYYY");
		String Date19897 = dateFormat.format(new Date());
		driver.findElement(By.xpath(
				"//input[@class='datepicker_input__QSqJQ mantine-Input-input mantine-DateInput-input mantine-gszoqu']"))
				.sendKeys(Date19897);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Submit')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
				.click();
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button")));
		} catch (Exception Next) {
			System.out.println(Next);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
					.click();
		}

		// driver.findElement(By.xpath("(//div[@class='grow flex
		// justify-end'])[1]/child::button")).sendKeys("\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\IMG_20220527_111203.jpg");
		// Thread.sleep(6000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button")));
		WebElement findElement3 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement3.click();
		screenshot.screenshot11(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot11.png",
				"Personal Document collection").build());
		Thread.sleep(5000);
		String text1 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Pancard.JPG";
		String text2 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\KARTHIK AADHATR.pdf";
		for (char c : text1.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		WebElement findElement4342 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement4342.click();

		Thread.sleep(5000);

		for (char c : text2.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement findElement43421 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement43421.click();

		Thread.sleep(5000);

		for (char c : text2.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		WebElement findElement434211 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement434211.click();

		Thread.sleep(5000);

		for (char c : text2.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		screenshot.screenshot12(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot12.png",
				"Document Upload").build());
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
				.click();
	}

	public void PropertyType1(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("SoleProprietorship Property 1");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);
		WebElement findElementopo = driver.findElement(By.xpath("(//input[@id='dropdown'])[2]"));
		JavascriptExecutor findElementop = (JavascriptExecutor) driver;
		findElementop.executeScript("arguments[0].click();", findElementopo);
		Thread.sleep(3500);

		WebElement findElementopos = driver.findElement(By.xpath(
				"(//li[@class='select-option relative px-[16px] py-[20px] cursor-pointer event-track after:w-full after:h-[1px] after:absolute after:bg-[#F0F1F3] after:top-[100%] after:left-0'])[1]"));
		JavascriptExecutor findElementops = (JavascriptExecutor) driver;
		findElementops.executeScript("arguments[0].click();", findElementopos);
		Thread.sleep(3000);
		screenshot.screenshot12(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot12.png",
				"Property type").build());
	}

	public void PropertyType2(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("SoleProprietorship Property 2");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);
		WebElement findElementopo = driver.findElement(By.xpath("(//input[@id='dropdown'])[2]"));
		JavascriptExecutor findElementop = (JavascriptExecutor) driver;
		findElementop.executeScript("arguments[0].click();", findElementopo);
		Thread.sleep(4500);

		WebElement findElementopos = driver.findElement(By.xpath(
				"(//li[@class='select-option relative px-[16px] py-[20px] cursor-pointer event-track after:w-full after:h-[1px] after:absolute after:bg-[#F0F1F3] after:top-[100%] after:left-0'])[2]"));
		JavascriptExecutor findElementops = (JavascriptExecutor) driver;
		findElementops.executeScript("arguments[0].click();", findElementopos);
		Thread.sleep(3000);
		screenshot.screenshot13(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot13.png",
				"Property type").build());
	}

	public void PropertyType3(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("SoleProprietorship Property 3");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);

		WebElement findElementopo = driver.findElement(By.xpath("(//input[@id='dropdown'])[2]"));
		JavascriptExecutor findElementop = (JavascriptExecutor) driver;
		findElementop.executeScript("arguments[0].click();", findElementopo);
		Thread.sleep(3500);

		WebElement findElementopos = driver.findElement(By.xpath(
				"(//li[@class='select-option relative px-[16px] py-[20px] cursor-pointer event-track after:w-full after:h-[1px] after:absolute after:bg-[#F0F1F3] after:top-[100%] after:left-0'])[3]"));
		JavascriptExecutor findElementops = (JavascriptExecutor) driver;
		findElementops.executeScript("arguments[0].click();", findElementopos);
		Thread.sleep(3000);
		screenshot.screenshot14(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot14.png",
				"Property type").build());
	}

	public void Property(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("Rented poperty document");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);

		Thread.sleep(4500);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"))).click();

		Thread.sleep(4500);
		String text3 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Eb111111111.JPG";

		String text4 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Sale111111111.pdf";

		Thread.sleep(4500);
		for (char v : text3.toCharArray()) {
			int keyCode1 = KeyEvent.getExtendedKeyCodeForChar(v);

			robot.keyPress(keyCode1);
			robot.keyRelease(keyCode1);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement4342111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement4342111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		screenshot.screenshot15(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot15.png",
				"Rented documents Upload").build());
		WebElement findElement43421111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement43421111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement434211111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement434211111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		
	try {
		String tagName3 = driver.findElement(By.xpath("//img[@alt='verified']")).getTagName();
		String a13 ="img"; 
		tagName3.contains(a13);
		screenshot.screenshot16(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot16.png",
				"Documentation Status").build());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
				.click();
		
	} catch (Exception e) {
		screenshot.screenshot16(driver, extentreport);
		test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot16.png",
				"Documentation Status").build());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")));
		
	}
		
	
		
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
		screenshot.screenshot16(driver, extentreport);
		test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
				"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot16.png",
				"Documentation Status").build());
	}

	public void Owned(WebDriver driver, String Username, String Mobilenumber, String Date11, ExtentReports extentreport)
			throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("Owned poperty document");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);

		Thread.sleep(4500);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"))).click();

		Thread.sleep(4500);
		String text3 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Eb111111111.JPG";

		String text4 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Sale111111111.pdf";

		Thread.sleep(4500);
		for (char v : text3.toCharArray()) {
			int keyCode1 = KeyEvent.getExtendedKeyCodeForChar(v);

			robot.keyPress(keyCode1);
			robot.keyRelease(keyCode1);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement4342111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement4342111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement43421111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement43421111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		
		try {
			String tagName2 = driver.findElement(By.xpath("//img[@alt='verified']")).getTagName();
			String a12 ="img"; 
			tagName2.contains(a12);
			screenshot.screenshot17(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot17.png",
					"Documentation Status").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
					.click();
			
		} catch (Exception e) {
			screenshot.screenshot17(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot17.png",
					"Documentation Status").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")));
			
		}
		
	
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
	}

	public void FamilyProperty(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("Family Property Document");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(3500);

		Thread.sleep(4500);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"))).click();

		Thread.sleep(4500);
		String text3 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Eb111111111.JPG";

		String text4 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Sale111111111.pdf";

		Thread.sleep(4500);
		for (char v : text3.toCharArray()) {
			int keyCode1 = KeyEvent.getExtendedKeyCodeForChar(v);

			robot.keyPress(keyCode1);
			robot.keyRelease(keyCode1);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement4342111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement4342111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement43421111 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement43421111.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement434211110 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement434211110.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);

		WebElement findElement4342111100 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end']/child::button)[1]"));
		findElement4342111100.click();
		Thread.sleep(4500);
		for (char c : text4.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		
		try {
			String tagName = driver.findElement(By.xpath("//img[@alt='verified']")).getTagName();
			String a1 ="img"; 
			tagName.contains(a1);
			screenshot.screenshot18(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot18.png",
					"Documentation Status").build());
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
					.click();
			
		} catch (Exception e) {
			screenshot.screenshot18(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\" + Date1 + "\\Screenshot18.png",
					"Documentation Status").build());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")));
			
		}
		String parentWindow = driver.getWindowHandle();
		driver.switchTo().window(parentWindow);
	}

	// ************************************************************************************************************
	public void PrivateLimitedCompany(WebDriver driver, String Username, String Mobilenumber, String Date11,
			ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, LoginPageobjects.class);
		Robot robot = new Robot();
		SimpleDateFormat dateFormat1GstRegistration = new SimpleDateFormat("wwmmyyyyhhmm");
		String Date1GstRegistration = dateFormat1GstRegistration.format(new Date());
		test = extentreport.createTest("GST Registration");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement findElement4 = driver.findElement(By.xpath("(//input[@id='dropdown'])[2]"));
		Thread.sleep(2500);

		JavascriptExecutor executo = (JavascriptExecutor) driver;
		executo.executeScript("arguments[0].click();", findElement4);
		WebElement findElement5 = driver.findElement(By.xpath("//li[contains(text(),'Private Limited Company')]"));

		JavascriptExecutor execut = (JavascriptExecutor) driver;
		execut.executeScript("arguments[0].click();", findElement5);
		Thread.sleep(3000);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@class='px-4
		// py-[20px] text-[14px] bg-[#F7F9FA]']/child::input"))).click();

		driver.findElement(By.xpath("//input[@placeholder='Company/Shop name']")).sendKeys("Tata");
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//p[contains(text(),'TATTAVIT INNOVATION TECHNOLOGY LLP')])[1]")));
		driver.findElement(By.xpath("(//p[contains(text(),'TATTAVIT INNOVATION TECHNOLOGY LLP')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Company PAN Number']")).sendKeys("DDWPD1939M");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		driver.findElement(By.xpath("//input[@placeholder='eg. Saris, Shoes, Milk, Food, Alcohol*']")).sendKeys("Milk");
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/d/YYYY");
		String Date19897 = dateFormat.format(new Date());
		driver.findElement(By.xpath(
				"//input[@class='datepicker_input__QSqJQ mantine-Input-input mantine-DateInput-input mantine-gszoqu']"))
				.sendKeys(Date19897);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Submit')]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'+ Add director')]"))).click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
				.click();
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button")));
		} catch (Exception Next) {
			System.out.println(Next);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
					.click();
		}

		// driver.findElement(By.xpath("(//div[@class='grow flex
		// justify-end'])[1]/child::button")).sendKeys("\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\IMG_20220527_111203.jpg");
		// Thread.sleep(6000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button")));
		WebElement findElement3 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement3.click();

		Thread.sleep(5000);
		String text1 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\Pancard.JPG";
		String text2 = "\\\\14.140.167.188\\Vakilsearch\\AutomatonLeadCreation5\\KARTHIK AADHATR.pdf";
		for (char c : text1.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		WebElement findElement4342 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement4342.click();

		Thread.sleep(5000);

		for (char c : text2.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		WebElement findElement43421 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement43421.click();

		Thread.sleep(5000);

		for (char c : text2.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		WebElement findElement434211 = driver
				.findElement(By.xpath("(//div[@class='grow flex justify-end'])[1]/child::button"));
		findElement434211.click();

		Thread.sleep(5000);

		for (char c : text2.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);

		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(4500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]/parent::button")))
				.click();
	}

}
