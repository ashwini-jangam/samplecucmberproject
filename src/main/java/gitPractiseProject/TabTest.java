package gitPractiseProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TabTest {
@Test
public void verifyTab() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://www.facebook.com/");
}
}
