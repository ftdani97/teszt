package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class isEnabled
{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        Thread.sleep(3000);//URL in the browser
        //System.out.println(driver.findElement(By.cssSelector("div[data-testid$='return-date-dropdown-label-test-id']")).getDomAttribute("style"));
        driver.findElement(By.cssSelector("div[data-testid$='round-trip-radio-button']")).click(); //click on return
        if (driver.findElement(By.cssSelector("div[data-testid$='return-date-dropdown-label-test-id']")).getDomAttribute("style").contains("background-color"))
        {
            System.out.println("It is disabled");
            Assert.fail();
        }
        else {
            System.out.println("It is enabled");
        }
    }
}
