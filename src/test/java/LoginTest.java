import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Test(priority = 1)
    public void setUp(){
        driver = new FirefoxDriver();
    }

    @Test(priority = 2)
    public void doLogin(){
        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("lol@qw.qw");
        driver.findElement(By.cssSelector("#identifierNext > div > button")).sendKeys("haslo");
        driver.findElement(By.id("GignIn")).click();
    }

    @AfterSuite
    public void  tearDown(){
        driver.quit();
    }
}
