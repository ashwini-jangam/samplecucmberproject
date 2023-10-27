package gitPractiseProject;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class WindowsAndTabDiff {
	@Test
	public void windowTest() {
      // WebDriverManager.chromedriver().setup();
      // ChromeOptions options = new ChromeOptions();
      // options.addArguments("--remote-allow-origins=*");
		
       WebDriver driver = new ChromeDriver();//(options);
       driver.get("https://www.google.com/");
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.navigate().to("https://www.facebook.com/");
	}

}
