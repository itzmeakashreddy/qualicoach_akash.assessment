package akash.qualicaoch;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.studentlog;
import resources.base;

public class studentlogin extends base{

	@Test(priority=1)
	public void loginUser() throws IOException
	{
		
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/");
		driver.manage().window().maximize();
		studentlog l=new studentlog(driver);
		l.getUserid().sendKeys("user170");
		l.getPass().sendKeys("User@6177");
		l.getlogin().click();
		
		
	}
	
	@Test(priority=2)
	public void enrollcourse() throws IOException, InterruptedException
	{
	    loginUser();	
		studentlog l=new studentlog(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Actions a = new Actions(driver);
		WebElement move = l.getcourseid();
		a.moveToElement(move).click().build().perform();
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		l.getcoursesub().click();
		close();

	}
	@Test(priority=3)
	public void takequiz() throws IOException, InterruptedException
	{
		loginUser();
		studentlog l=new studentlog(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		WebElement move = l.getcourseid();
		a.moveToElement(move).click().build().perform();
		l.gettid().click();
		l.gett1id().click();

	}
	
	@Test(priority=4)
	public void quiz() throws IOException, InterruptedException
	{

		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/");
		driver.manage().window().maximize();
		studentlog l=new studentlog(driver);
		l.getUserid().sendKeys("user94");
		l.getPass().sendKeys("User@7014");
		l.getlogin().click();
		Actions a = new Actions(driver);
		WebElement move = l.getqid();
		a.moveToElement(move).click().build().perform(); 
		l.getq1id().click();
		WebElement z = (WebElement)l.getq2id();
		a.moveToElement(z).click().build().perform();
		l.getq3id().click();
		Thread.sleep(2000);
		close();
		
	}
	
	@Test(priority=5)
	public void certificate() throws IOException, InterruptedException
	{

		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/");
		driver.manage().window().maximize();
		studentlog l=new studentlog(driver);
		l.getUserid().sendKeys("user88");
		l.getPass().sendKeys("User@9146");
		l.getlogin().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Actions a = new Actions(driver);
		WebElement move11 = l.getcid();
		Thread.sleep(1000);
		a.moveToElement(move11).click().build().perform();
		Thread.sleep(1000);
		WebElement x = (WebElement) l.getc1id();
		a.moveToElement(x).click().build().perform();
		WebElement d = (WebElement) l.getc2id();
		a.moveToElement(d).click().build().perform();
		Thread.sleep(3000);
		WebElement y= (WebElement)l.getc3id();
		a.moveToElement(y).click().build().perform();
		
		close();
	}
	
	@Test(priority=6)
	public void editUser() throws InterruptedException, IOException
	{
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/my/");
		driver.manage().window().maximize();

		studentlog l=new studentlog(driver);
		l.getUserid().sendKeys("user170");
		l.getPass().sendKeys("User@6177");
		l.getlogin().click();
		//driver.manage().window().maximize();
		Thread.sleep(2000);
		l.geteid().click();
		Thread.sleep(2000);
		l.gete1id().click();
		Thread.sleep(2000);
		l.gete2id().click();
		Thread.sleep(2000);
		l.gete3id().clear();
		Thread.sleep(1000);
		l.gete4id().sendKeys("Test1");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(1000);
		l.gete5id().click();
		close();
		
	}
	
	
	public void close()
	{
		driver.close();
	}
}
