import drivers.ChromeDriver;
import drivers.Drivers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver driver;
    static ChromeDriver chromeDriver;
    static Drivers chromeDriverActions;
    //static WebDriver firefoxDriver;
    public static void main(String[] args){

        chromeDriver = new ChromeDriver(driver);
        chromeDriver.init();
        chromeDriverActions = new Drivers(driver);
        chromeDriverActions.implicitWait();
        chromeDriverActions.windowSize();

        /*System.setProperty("webdriver.chrome.driver","\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","\\drivers\\geckodriver.exe");

        chromeDriver = new drivers.ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        firefoxDriver = new drivers.FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firefoxDriver.manage().window().maximize();

        chromeDriver.get("https://www.imdb.com/");
        firefoxDriver.get("https://www.imdb.com/");*/

        //chromeDriver.quit();
        //firefoxDriver.quit();

        //TODO сделать сьюты для тестов в каждом отдельном браузере, перед всем сьютом создавать экземпляр класса нужного драйвера
    }

/*    // main slider check
    public static void mainSliderCheck(){
        // rotation check
        String firstName;
        String secondName;

        try{
            if (driver.findElement(mainPageView).isDisplayed()) {
                firstName = driver.findElement(mainSliderElementName).getText();
                do {
                    driver.findElement(rotateMainSlideRight).click();
                    secondName = driver.findElement(mainSliderElementName).getText();
                } while (!firstName.equals(secondName));
                do {
                    driver.findElement(rotateMainSlideLeft).click();
                    secondName = driver.findElement(mainSliderElementName).getText();
                } while (!firstName.equals(secondName));
            }
        } catch (Throwable t){
            t.printStackTrace();
        }
        try{
            if(driver.findElement(mainPageView1).isDisplayed()){
                firstName = driver.findElement(mainSliderElementName1).getText();
                do {
                    driver.findElement(rotateMainSlideRight1).click();
                    secondName = driver.findElement(mainSliderElementName1).getText();
                } while (!firstName.equals(secondName));
                do {
                    driver.findElement(rotateMainSlideLeft1).click();
                    secondName = driver.findElement(mainSliderElementName1).getText();
                } while (!firstName.equals(secondName));
            }
        } catch (Throwable t1){
            t1.printStackTrace();
        }
    }*/
}
