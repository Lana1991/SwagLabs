import functions.LogInFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BeforeAll;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PLPSorting extends BeforeAll {

        @Test
        public void sortingPLP() throws IOException {

            LogInFunction.logInValidUser(driver, wait);

            List<WebElement> beforeFilterPrice = driver.findElements(By.className("inventory_item_price"));

            //Remove the $ symbol,  Convert String to Double
            List<Double> beforeFilterPriceList = new ArrayList<>();
            for (WebElement element : beforeFilterPrice){
                beforeFilterPriceList.add(Double.valueOf(element.getText().replace("$", "")));
            }

            Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
            dropdown.selectByVisibleText("Price (high to low)");

            List<WebElement> afterFilterPrice = driver.findElements(By.className("inventory_item_price"));

            //Remove the $ symbol,  Convert String to Double
            List<Double> afterFilterPriceList = new ArrayList<>();
            for (WebElement element: afterFilterPrice){
                afterFilterPriceList.add(Double.valueOf(element.getText().replace("$", "")));
            }

            Collections.sort(beforeFilterPriceList);
            Collections.reverse(beforeFilterPriceList);

            Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
        }

    }
