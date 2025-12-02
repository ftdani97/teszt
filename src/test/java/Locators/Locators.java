package Locators;// ezek mondják el a programnak, hogy a HTML komponens hol található

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //waiting for objects to show up on the page
        driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("gelemb");
        driver.findElement(By.name("inputPassword")).sendKeys("gelemb123");
        driver.findElement(By.className("submit")).click(); //az oldalra navigálunk, beírjuk a helytelen adatokat és error üzenetet kapunk
        System.out.print(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        //Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dani");
        driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("dani@scolia.hu");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("asd@scolia.hu");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("+3669696969");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click(); //ez lehet //div[@class='forgot-pwd-btn-container']/button[1] is
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul"); //cssSelector with id
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
    }
}
