package PAckageJenkins;
// alt+insert - short cut to add depedemcy in POM file
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
    static WebDriver driver;
    @Test

    public void seleniumDriver()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kamma\\OneDrive\\Desktop\\downloads\\chromedriver.exe");
         driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();

    }
}
