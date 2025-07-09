package org.xpath_axes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Parent and Child combination
		String xpath1 = "//input[@placeholder='Last Name']/../parent::div/child::div/input[@placeholder='First Name']";
		
		// following
		String xpath2 = "//input[@placeholder='First Name']//following::div/input[@placeholder='Last Name']";
		
		// preceding
		String xpath3 = "//input[@ng-model='EmailAdress']//preceding::textarea";
		
		// following-sibling
		String xpath4 = "(//div[@class='form-group']//following-sibling::div)[6]//input[@type='email']";
		
		// preceding-sibling
		String xpath5 = "(//input[@value='Male']//..//..//..//preceding-sibling::div)[position()=4]//input";
		
		WebElement firstName = driver.findElement(By.xpath(xpath1));
		firstName.sendKeys("Vignesh");
		
		WebElement lastName = driver.findElement(By.xpath(xpath2));
		lastName.sendKeys("Raja");
		
		WebElement address = driver.findElement(By.xpath(xpath3));
		String add = "3/282, Mariyamman kovil street, Manavalanallur, Eravanchery, Thiruvarur.";
		address.sendKeys(add);
		
		WebElement email = driver.findElement(By.xpath(xpath4));
		email.sendKeys("vigneshraja0520@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath(xpath5));
		phone.sendKeys("7094772888");	
		
	}

}
