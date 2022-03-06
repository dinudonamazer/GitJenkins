package Sample2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test 
	public void validategoogle() throws IOException {
		WebDriverManager .chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www2.bing.com//");
		
		wd.findElement(By.name("q")).sendKeys("Chennai");
		wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(src,new File("C:/Users/dinud/workspace/vcentry/GitJenkinsTest/src/test/java/Ss/bing.jpeg"));
	}

}