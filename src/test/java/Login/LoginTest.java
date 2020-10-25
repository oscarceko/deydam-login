package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://deydam.com/");
        Thread.sleep(5000);

        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("oscarceko1")).sendKeys("oscarceko1");
        driver.findElement(By.id("819967890")).sendKeys("819967890");
        driver.findElement(By.linkText("Sign In")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        LoginTest test = new LoginTest();
                test.setUp();


    }
}
