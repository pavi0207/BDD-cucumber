package stepDefinition;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SeleniumDefinition<WebDriver> {
	 ChromeDriver driver;
	@Given("User is on the login page")
	public void user_is_on_the_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Day 2 selinium\\chromedriver.exe");
		driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		driver.navigate().to("https://www.makemytrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
}
	@When("User is provide the phoneNumber {string}")
	public void user_is_provide_the_phone_number(String string) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(string);
		Thread.sleep(3000);
	    
	}
	@When("user click Continue")
	public void user_click_continue() throws InterruptedException {
		driver.findElement(By.xpath("//*[@data-cy='continueBtn']")).click();
		Thread.sleep(3000);
	}
	@Then("OTP is send {string}")
	public void otp_is_send(String string1) throws InterruptedException {
		
		driver.findElement(By.name("otp")).sendKeys(string1);
		Thread.sleep(3000);
	}
	@Then("user is unable to login")
	public void user_is_unable_to_login() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		 js.executeScript("document.elementFromPoint(0,0).click()");
	    
	}



	




}
