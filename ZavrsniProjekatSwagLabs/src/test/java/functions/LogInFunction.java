package functions;

import JSONFiles.JSONManagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.LogInPage;
import page_object.ProductListingPage;

import java.io.IOException;

public class LogInFunction {


    public static void emptyUsername (WebDriver driver, WebDriverWait wait) throws IOException {

        driver.findElement(LogInPage.userNameField).sendKeys(JSONManagement.readProperty("lockedOutUser"));
        driver.findElement(LogInPage.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPage.ErrorMessageEmptyUsername));

    }

        public static void logInValidUser (WebDriver driver, WebDriverWait wait) throws IOException {

            driver.findElement(LogInPage.userNameField).sendKeys(JSONManagement.readProperty("standardUser"));
            driver.findElement(LogInPage.passwordField).sendKeys(JSONManagement.readProperty("password"));
            driver.findElement(LogInPage.logInButton).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(ProductListingPage.productTitle));

        }

    public static void logOut (WebDriver driver, WebDriverWait wait) {

        driver.findElement(ProductListingPage.menuButton).click();
        driver.findElement(ProductListingPage.logOutButton).click();
        driver.findElement(LogInPage.logo).isDisplayed();

    }

}
