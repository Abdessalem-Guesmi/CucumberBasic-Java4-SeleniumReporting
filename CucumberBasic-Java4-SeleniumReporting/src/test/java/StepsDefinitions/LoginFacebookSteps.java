package StepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFacebookSteps {
	public WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();

		System.out.println("i'm a Given method: user on login page");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_user1_and_user1(String username, String password) {
		System.out.println("\n        the username is: " + username + "\n        ");
		System.out.println("\n        the password is: " + password + "\n        ");
		WebElement user = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		user.sendKeys(username);
		pass.sendKeys(password);

	}

	@And("clicks on button")
	public void clicks_on_button() {
		System.out.println("i'm a And method: user clicks on button");
		WebElement connect = driver.findElement(By.name("login"));
		connect.sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("i'm a Then method: user navigated to the home page");
		String currentUrl = driver.getCurrentUrl();
		System.out.println("----------" + currentUrl);
		String expectedUrl = "https://www.facebook.com/mobileprotection?source=mobile_mirror_nux";
		// Assert.assertEquals("not equal", expectedUrl, currentUrl);
		driver.quit();

	}

}
