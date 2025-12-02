package functionalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class addingItemsToCarts {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String [] itemsNeeded = {"Cucumber", "Brocolli"}; //veggies that you want to add to the cart
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i<products.size();i++) //30x ismétlődik
        {
            String chosenProduct= products.get(i).getText(); //bekéri minden alkalommal a nevet
            //convert array to array list for easy search
            //checking whether name you extracted is present in array or not
            List itemsNeededList = Arrays.asList(itemsNeeded); //arrayListet csinálunk az Arrayből

            //mielőtt az arrayListtel compare-eljük, trimmelni kell a zöldségeket a -1Kg tagtól
            if(itemsNeededList.contains(chosenProduct)) //csekkolja h tartalmazza-e az itemsNeeded arrayből az egyiket
            {
                //click on Add to cart - csak akkor megy bele ebbe az if-be a program, ha már a Cucumber szó megvan
                driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();

            }

        }

    }
}
