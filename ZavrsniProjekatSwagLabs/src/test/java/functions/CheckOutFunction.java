package functions;

import JSONFiles.JSONManagement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import page_object.LogInPage;
import page_object.ProductListingPage;

import java.io.IOException;

public class CheckOutFunction {

    public static void checkOut (WebDriver driver, WebDriverWait wait) throws IOException{

        driver.findElement(ProductListingPage.item1).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.backToProductsButton));

        String name1 = driver.findElement(ProductListingPage.item1Name).getText();
        System.out.println(name1);

        driver.findElement(ProductListingPage.addToCartButton1).click();
        driver.findElement(ProductListingPage.removeButton1).isDisplayed();
        driver.findElement(ProductListingPage.shoopingBagButton).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.yourCartText));

        String name2 = driver.findElement(ProductListingPage.item1Text).getText();
        System.out.println(name2);

        Assert.assertEquals(name1, name2);

        driver.findElement(ProductListingPage.checkOutButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.yourInformationText));
        driver.findElement(ProductListingPage.firstNameField).sendKeys(JSONManagement.readProperty("firstName"));
        driver.findElement(ProductListingPage.lastNameField).sendKeys(JSONManagement.readProperty("lastName"));
        driver.findElement(ProductListingPage.zipCodeField).sendKeys(JSONManagement.readProperty("zipCode"));
        driver.findElement(ProductListingPage.continueButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.overviewText));
        driver.findElement(ProductListingPage.finishButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.logo));

    }

}
