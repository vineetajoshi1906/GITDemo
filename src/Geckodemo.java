import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Geckodemo {

	public static void main(String[] args) {
       System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Softwares\\geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("https://www.google.com");
	}

}
