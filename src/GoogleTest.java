import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Test
public class GoogleTest {
	public void testOnChrome() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		caps.setPlatform(null);
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.29.219:4444"),caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(8000);
		driver.close();
	}


}
