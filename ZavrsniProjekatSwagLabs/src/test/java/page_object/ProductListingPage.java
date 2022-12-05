package page_object;

import org.openqa.selenium.By;

public class ProductListingPage {

    public static By productTitle = By.xpath("//span[contains(text(),'Products')]");

    public static By menuButton = By.id("react-burger-menu-btn");

    public static By logOutButton = By.id("logout_sidebar_link");

    public static By item1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]");

    public static By backToProductsButton = By.id("back-to-products");

    public static By item1Name = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");

    public static By addToCartButton1 = By.id("add-to-cart-sauce-labs-backpack");

    public static By removeButton1 = By.id("remove-sauce-labs-backpack");

    public static By shoopingBagButton = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");

    public static By yourCartText = By.xpath("//span[contains(text(),'Your Cart')]");

    public static By item1Text = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]");

    public static By checkOutButton = By.id("checkout");

    public static By yourInformationText = By.xpath("//span[contains(text(),'Checkout: Your Information')]");

    public static By firstNameField = By.id("first-name");

    public static By lastNameField = By.id("last-name");

    public static By zipCodeField = By.id("postal-code");

    public static By continueButton = By.id("continue");

    public static By overviewText = By.xpath("//span[contains(text(),'Checkout: Overview')]");

    public static By finishButton = By.id("finish");

    public static By logo = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='checkout_complete_container']/img[1]");


}
