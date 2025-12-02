package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class entireSearchTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/"); //get to the page

        //select DELHI
        driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();
        driver.findElement(By.xpath("//div[text()='DEL']")).click();

        //select Chennai MAA
        driver.findElement(By.cssSelector("div[data-testid='to-testID-destination']")).click();
        driver.findElement(By.xpath("//div[text()='MAA']")).click();

        //departure calendar
        driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-17b3b9k r-1otgn73 r-1aockid']")).click();

        //checking if return date is enabled
        if (driver.findElement(By.cssSelector("div[data-testid$='return-date-dropdown-label-test-id']")).getDomAttribute("style").contains("background-color")) {
            System.out.println("It is disabled");
            Assert.assertTrue(true);
        } else {
            System.out.println("It is enabled");
            Assert.fail();
        }

        // adding 3 passengers
        driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
        Thread.sleep(2000);
        for (int i = 1; i<3; i++)
        {
            driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
        }
        driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();



        //family and friends
        driver.findElement(By.xpath("(//*[name()='circle'])[5]")).click();

        //click on round trip button
        driver.findElement(By.cssSelector("div[data-testid$='round-trip-radio-button']")).click();

        //return dropwdown
        if (driver.findElement(By.cssSelector("div[data-testid$='return-date-dropdown-label-test-id']")).getDomAttribute("style").contains("background-color")) {
            System.out.println("It is disabled");
            Assert.fail();
        } else {
            System.out.println("It is enabled");

        }
        driver.findElement(By.cssSelector("div[data-testid='return-date-dropdown-label-test-id']")).click();
        driver.findElement(By.cssSelector("div[data-testid='undefined-month-December-2025'] div[data-testid='undefined-calendar-day-12']")).click();

        //click on search
        driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();
        Thread.sleep(3000);

        //Friends and Family Fare text search
        WebElement element = driver.findElement(By.cssSelector("div[class='css-76zvg2 r-1t4w9z3 r-1i10wst r-1kfrs79']"));
        Assert.assertTrue(element.isDisplayed(),"Element is not displayed");
        driver.close();
        }




    }

