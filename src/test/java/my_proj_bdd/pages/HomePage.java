package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(xpath = "//button[@data-testid='cookie-popup-accept']")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//h2[@data-testid='cookie-popup-accept']")
    private WebElement cookieHeader;

    // Actions
    public void  clickAcceptCookiesButton() {
        acceptCookiesButton.click();
    }

    public void openHomePage() {
        driver.get("https://www.mega-image.ro/");
    }

    // Validations
    public void validateCookieHeader() {
        // msg if validation is not working, the expected, what is on the site
        Assert.assertEquals("Header title is incorrect" ,"Cookie-uri pe mega-image.ro", cookieHeader.getText());
    }

}
