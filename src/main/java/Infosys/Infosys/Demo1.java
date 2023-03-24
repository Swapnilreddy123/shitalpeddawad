package Infosys.Infosys;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("swapnil");
		driver.findElement(By.id("pass")).sendKeys("swapnil@123");
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		String date =new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
	File f=	ts.getScreenshotAs(OutputType.FILE);
	
	File fs=new File("C:\\Users\\hp\\Desktop\\Swapnil\\"+date+"Fbloginpage.png");
		
	FileUtils.copyFile(f,fs);
		
		
		
		
	}

}
