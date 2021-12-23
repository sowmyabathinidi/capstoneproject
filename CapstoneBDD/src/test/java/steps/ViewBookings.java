package steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewBookings {
	WebDriver driver;

	public ViewBookings(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Views() {
		System.out.println("user complete booking");
		driver.findElement(By.xpath("//a[text()='See Your Bookings']")).click();
		System.out.println("user will check booking status");
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("user logout");
	}
}
