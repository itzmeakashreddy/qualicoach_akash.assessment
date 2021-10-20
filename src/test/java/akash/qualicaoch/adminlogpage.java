package akash.qualicaoch;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageobjects.adminlogin;
import resources.base;

public class adminlogpage extends base{

	public class AdminLoginPage extends base{
		
		@Test(priority=1)
		public void createUser() throws IOException, InterruptedException
		{
			
			driver=initializeDriver();
			driver.get("https://test.qualicoach.org/admin/search.php");
			driver.manage().window().maximize();
			adminlogin l = new adminlogin(driver);
			l.getUserid().sendKeys("admin60");
			l.getPass().sendKeys("Admin@4801");
			l.getlogin().click();
			Thread.sleep(1000);
			l.getcid().click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			l.getc1id().click();
			Thread.sleep(1000);
			l.getc2id().sendKeys("admin10006");
			Thread.sleep(1000);
			l.getc3id().click();
			Thread.sleep(1000);
			l.getc4id().click();
			l.getc4id().click();
			Thread.sleep(2000);
			l.getc4id().sendKeys("Hello125");
			js.executeScript("window.scrollBy(0,300)");
			l.getc5id().sendKeys("abc10006");
			Thread.sleep(1000);
			l.getc6id().sendKeys("xyz10006");
			Thread.sleep(1000);
			l.getc7id().sendKeys("XYZ10004@qualitestgroup.com");
			Thread.sleep(1000);
			l.getc8id().click();
			Thread.sleep(1000);
			l.getc9id().sendKeys("Davangere");
			Thread.sleep(1000);
			l.getc10id().click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,200)");
			l.getc11id().sendKeys("Qualitest Employee Fresher");
			js.executeScript("window.scrollBy(0,1000)");
			l.getdc12id().click();
		
			close();
			
		}
		@Test(priority=2)
		public void editUser() throws  IOException ,InterruptedException
		{
			driver=initializeDriver();
			driver.get("https://test.qualicoach.org/admin/search.php");
			driver.manage().window().maximize();
			adminlogin l = new adminlogin(driver);
			l.getUserid().sendKeys("admin72");
			l.getPass().sendKeys("Admin@9146");
			l.getlogin().click();
			Thread.sleep(1000);
			l.geteid().click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			l.gete1id().click();
			Thread.sleep(1000);
			l.gete2id().sendKeys("Test");
			Thread.sleep(1000);
			l.gete3id().click();
			Actions a = new Actions(driver);
			WebElement e =l.gete4id();
			a.moveToElement(e).click().build().perform();
			l.gete5id().clear();
			l.gete5id().sendKeys("usernamechanged");
			//l.gete6id().click();
			close();
	}
		@Test(priority=3)
		public void deleteUser() throws  IOException ,InterruptedException
		{
			driver=initializeDriver();
			driver.get("https://test.qualicoach.org/admin/search.php");
			driver.manage().window().maximize();
			adminlogin l = new adminlogin(driver);
			l.getUserid().sendKeys("admin55");
			l.getPass().sendKeys("Admin@6155");
			l.getlogin().click();
			Thread.sleep(1000);
			l.geteid().click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			Thread.sleep(1000);
			l.gete1id().click();
			Thread.sleep(2000);
			l.gete2id().sendKeys("example");
			Thread.sleep(1000);
			l.gete3id().click();
			Actions a = new Actions(driver);
			WebElement e =l.geted1id();
			a.moveToElement(e).click().build().perform();
			//l.geted2id().click();
			
		}
		
		@Test(priority=4)
		public void createcourse() throws IOException, InterruptedException
		{
			driver=initializeDriver();
			driver.get("https://test.qualicoach.org/admin/search.php");
			driver.manage().window().maximize();
			adminlogin l = new adminlogin(driver);
			l.getUserid().sendKeys("admin64");
			l.getPass().sendKeys("Admin@9149");
			l.getlogin().click();
			Thread.sleep(1000);
			l.getcrid().click();
			Thread.sleep(1000);
			l.getcr1id().click();
			Thread.sleep(1000);
			l.getcr2id().click();
			Thread.sleep(1000);
			l.getcr3id().click();
			Thread.sleep(1000);
			l.getcr4id().sendKeys("C Basic1");
			Thread.sleep(4000);
			l.getcr5id().sendKeys("10009");
			Thread.sleep(2000);
			l.getcr6id().sendKeys("This is a course which is basic of c");
			Thread.sleep(1000);
			l.getcr7id().click();
			Thread.sleep(1000);
			l.getcr8id().click();
			Thread.sleep(1000);
			l.getcr9id().click();
			Thread.sleep(1000);
			l.getcr10id().sendKeys("python Basic Course1");
			Thread.sleep(1000);
			l.getcr11id().sendKeys("javabasic");
			Thread.sleep(1000);
			l.getcr12id().sendKeys("14");
			Thread.sleep(1000);
			l.getcr13id().sendKeys("python Basic Programing Course 2");
			Thread.sleep(1000);
			l.getcr14id().click();
			Thread.sleep(1000);
			close();
			
		}

	@Test(priority=5)
	public void downloadReport() throws InterruptedException, IOException 
	{
		driver=initializeDriver();
		driver.get("https://test.qualicoach.org/my/");
		driver.manage().window().maximize();
		adminlogin l = new adminlogin(driver);
		l.getUserid().sendKeys("admin57");
		l.getPass().sendKeys("Admin@8125");
		l.getlogin().click();
		Thread.sleep(1000);
		l.getd1id().click();
		Thread.sleep(4000);
		l.getd2id().click();
		Thread.sleep(1000);
		close();
	}

	public void close()
	{
		driver.close();
	}
}
}