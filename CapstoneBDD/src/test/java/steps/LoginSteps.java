package steps;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	public static WebDriver driver;
	SignupClass signup=new SignupClass(driver);
	LoginClass login=new LoginClass(driver);
	BookingClass booking=new BookingClass(driver);
	ViewBookings views=new ViewBookings(driver);



	@Given("user has opened Application")
	public void user_has_opened_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Installs\\chromedriver_win32 (1)\\chromedriver.exes");
//	     WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/FlyAway/");
		driver.manage().window().maximize();
	    System.out.println("user has opened Application");
	}
	@When("user opens Home page")
	public void user_opens_home_page() {
	    // Write code here that turns the phrase above into concrete action
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	    System.out.println("user opens Home page");
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		
	    System.out.println("user should be navigated to home page");
	    
	}
	
	@Given("user has opened login page")
	public void user_has_opened_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		signup.SignUp();
		

//		driver.findElement(By.xpath("//a[text()='Login/Signup']")).click();
//	    System.out.println("user has opened login page");
	}
	@Given("user opts to register")
	public void user_opts_to_register() {
	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//a[text()='Not a member? Signup']")).click();
//	    System.out.println("user opts to register");
	}
	@When("user enters details required")
	public void user_enters_details_required() {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		driver.findElement(By.name("email_id")).sendKeys("sowmya@domain.com");
		driver.findElement(By.name("pwd")).sendKeys("sowmya");
		driver.findElement(By.name("pwd2")).sendKeys("sowmya");
	driver.findElement(By.name("name")).sendKeys("sowmya");
		System.out.println("user enters details required");
	}
	@Then("user registered successfully")
	public void user_registered_successfully() {

	    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[text()='Signup']")).click();
		driver.findElement(By.xpath("//a[text()='Already a member? Login']")).click();
	    System.out.println("user registered successfully");
	}
	@Given("user opened login page and enter details")
	public void user_opened_login_page_and_enter_details() {
		login.Login();
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("email_id")).sendKeys("sowmya@domain.com");
		driver.findElement(By.name("pwd")).sendKeys("sowmya");
	    System.out.println("user opened login page and enter details");
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()='Login']")).click();
    System.out.println("user clicks on login button");
	}
	@Then("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
   System.out.println("user is on login page");
	}
	@Given("user has loged successfully and clicks on home")
	public void user_has_loged_successfully_and_clicks_on_home() {
		booking.Booking();
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Home']")).click();
	    System.out.println("user has logged successfully and clicks on home");
	}
	@When("Select {string} as source and {string} as destination")
	public void select_as_source_and_as_destination(String str1, String str2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Select {string} as source and {string} as destination"+str1+""+str2);
	}
	@When("User books flight")
	public void user_books_flight() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='bookflight?id=3']")).click();
	    System.out.println("User books flight");
	}
	@Then("User completes booking")
	public void user_completes_booking() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Click to complete booking']")).click();
	    System.out.println("User completes booking");
	}
	@Given("user complete booking")
	public void user_complete_booking() {
		views.Views();
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user complete booking");
	}
	@Then("user will check booking status")
	public void user_will_check_booking_status() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='See Your Bookings']")).click();
	    System.out.println("user will check booking status");
	}
	@Then("user logout")
	public void user_logout() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	    System.out.println("user logout");
	}
	

}  
