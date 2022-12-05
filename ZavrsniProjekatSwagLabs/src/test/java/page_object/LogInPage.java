package page_object;

import org.openqa.selenium.By;

public class LogInPage {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static By logInButton = By.id("login-button");
    public static By ErrorMessageEmptyUsername = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");

    public static By logo = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]");
}

