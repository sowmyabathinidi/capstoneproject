package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass {
	WebDriver driver;

	public LoginClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Login() {
		driver.findElement(By.name("email_id")).sendKeys("sowmya@domain.com");
		driver.findElement(By.name("pwd")).sendKeys("sowmya");
		System.out.println("user opened login page and enter details");
		driver.findElement(By.xpath("//button[text()='login']")).click();
		System.out.println("user clicks on login button");
		System.out.println("user is on login page");
	}
}
