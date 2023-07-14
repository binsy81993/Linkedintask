package steps;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Baseclass {
	
	//private WebDriver driver;	
	
	@Given("Open the browser")
	public void Open_the_browser() {

		Baseclass.initialization("Chrome");
	   System.out.println("Website Launched ");	
	   
	}

	@When("^Enter date and register (.*)and(.*)with(.*)$")
	public void enter_date(String phone , String password, String name ) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[contains(@class,'mod-input mod-login-input-phone')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys(phone);
		driver.findElement(By.xpath("//div[contains(@class,'mod-input mod-input-password')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Minimum 8 characters with number, letter and characters.']")).sendKeys(password);
		driver.findElement(By.xpath	("//span[@class='next-select-inner']")).click();
		driver.findElement(By.xpath("//li[@value='5']//following::li[1]")).click();
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//li[@class='next-menu-item' and text()='12']")).click();
		driver.findElement(By.xpath("//span[text()='Year']")).click();
		driver.findElement(By.xpath("//li[@class='next-menu-item' and text()='2023']")).click();
		driver.findElement(By.xpath("//span[@class = 'next-select-placeholder' and text()='Select']")).click();
		driver.findElement(By.xpath("//li[text()='male']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'mod-input mod-login-input-name')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Last']")).sendKeys(name);
		WebElement slider = driver.findElement(By.xpath("//span[@id= 'nc_2_n1z']"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 400,0).build();
        action.perform();
		driver.findElement(By.id("enableSmsNewsletter")).click();
		driver.findElement(By.xpath("//button[@class='next-btn next-btn-primary next-btn-large']")).click();
		
		
		
		
		
//		driver.findElement(By.cssSelector("span.next-select-inner")).click();
//		driver.findElement(By.cssSelector("li[value='5'] + li")).click();
//		driver.findElement(By.cssSelector("span.next-select-placeholder")).click();
//		driver.findElement(By.cssSelector("span:contains('Day')")).click();
//		driver.findElement(By.cssSelector("li.next-menu-item[value='10']")).click();
		//driver.findElement(By.cssSelector("span:contains('Year')")).click();
		//driver.findElement(By.cssSelector("li.next-menu-item:contains('2023')")).click();
	}

	@Then("User entered date successfully")
	public void user_entered_date_successfully() {
	   System.out.println("Month selected and User cannot be registered until correct otp has been enetered ");
	}
}