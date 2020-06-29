import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private static WebDriver driver;

    public MainPage(WebDriver driver){ this.driver = driver; }

    private By logoBtn = By.xpath("//a[@id=\"home_img_holder\"]");

    public MainPage clickLogoBtn(){
        driver.findElement(logoBtn).click();
        return new MainPage(driver);
    }
}
