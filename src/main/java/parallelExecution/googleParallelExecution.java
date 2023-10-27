package parallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class googleParallelExecution {
	WebDriver driver ;
	
	
	@Test
	public void lunchgoogle() {
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void lunchFacebook() {
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}

}
