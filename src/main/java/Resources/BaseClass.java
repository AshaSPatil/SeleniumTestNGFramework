package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public Properties prop;

	public WebDriver driver;

	public void InitializeDriver() throws IOException {

		// To read the data
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

		prop = new Properties();
		prop.load(fs);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("EdgeDriver")) {

			driver = new EdgeDriver();
		} else {
			System.out.println("Please select proper browser");
		}

	}

	@BeforeMethod
	public void launchBrowserandURL() throws IOException {
		
		InitializeDriver();

		driver.get(prop.getProperty("url"));

	}

}
