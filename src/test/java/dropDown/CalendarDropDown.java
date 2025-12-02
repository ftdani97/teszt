package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1p4rafz r-1otgn73'][2]")).click(); //round trip
        driver.findElement(By.cssSelector("div[data-testid='departure-date-dropdown-label-test-id']")).click();
        WebElement departureDay = driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-17b3b9k r-1otgn73 r-1aockid']"));
        boolean selected = departureDay.getAttribute("class").contains("r-16ru68a r-y47klf r-1loqt21");
        Assert.assertTrue(selected);
        System.out.println(selected);
        /*driver.findElement(By.cssSelector("div[class='css-1dbjc4n r-1awozwy r-16ru68a r-y47klf r-1loqt21 r-17b3b9k r-1otgn73 r-1aockid']")).click();
        driver.findElement(By.cssSelector("div[class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar r-icoktb']")).click();*/




       /*
       Assert.assertTrue
       driver.findElement(By.cssSelector("div[class='css-76zvg2.r-jwli3a.r-ubezar.r-16dba41']")).click();

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

*/

    }


}
