package Lesson_7;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPage {
    private WebDriver driver;

    public NavigationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@href, 'controller=my-account')]")
    private WebElement signIn;
    @FindBy(xpath = "//*[@title=\"Dresses\"]")
    private WebElement dresses;
    @FindBy(xpath = "//*[contains(@href, 'controller=contact')")
    private WebElement contactUs;
    @FindBy(xpath = "//a[contains(@title, 'View my')]")
    private  WebElement cart;
    public void openContactUsPage() {
        contactUs.click();
    }
    public  void openCartPage()
    {
        cart.click();
    }

    public void openSignPage()
    {
        signIn.click();
    }
    public void openDresses()
    {
        dresses.click();
    }
    }