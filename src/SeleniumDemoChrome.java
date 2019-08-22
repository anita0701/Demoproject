import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoChrome {

	
		 public static void main(String[] args) {
			 //String exePath = "/home/anita/eclipse-workspace/Demo/resources/driver/chromedriver.exe";
			// System.setProperty("webdriver.chrome.driver", exePath);
			 WebDriver driver = new ChromeDriver();
			 driver.get("http://google.com");
			 }		

	

}
