package Test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tesr76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\aparnaod\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching the Web site 
		driver.get("https://www.saucedemo.com/");
		
		//Locating and entering values
		By uName = By.id("user-name");
		driver.findElement(uName);
		//.sendKeys("problem_user");
		
		By pWord = By.id("password");
		driver.findElement(pWord);
		//.sendKeys("secret_sauce");
		
		By loginBtn = By.id("login-button");
		driver.findElement(loginBtn).click();
		
		//driver.quit();
		
		//change1 for the first branch
		//git changes for the main

	}

}
