package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingClass {
	WebDriver driver;

	public BookingClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Booking() {
		driver.findElement(By.xpath("//a[text()='home']")).click();
		System.out.println("user has loged successfully and clicks on home");
		System.out.println("user selected \"Banglore\" as source and \"Hyderabad\" as destination");
		driver.findElement(By.xpath("//a[@href='bookflight?id=3']")).click();
		System.out.println("User books flight");
		driver.findElement(By.xpath("//a[text()='Click to complete booking']")).click();
		System.out.println("User completes booking");

	}
}
