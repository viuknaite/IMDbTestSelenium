import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    static WebDriver chromeDriver;
    static WebDriver firefoxDriver;
    public static void main(String[] args){
        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\geckodriver.exe");

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

        //TODO сделать общий класс Driver с отдельными методами для задержек различного вида, установки параметров окна, возможности запуска в headless режиме, JavascriptExecutor и завершения работы. В конструктор передать драйвер
        //TODO сделать отдельные классы для каждого браузера, в которых осуществить подгрузку драйвера, инициализацию и создать экземпляр класса Driver с переданным инициализированным драйвером
        //TODO сделать сьюты для тестов в каждом отдельном браузере, перед всем сьютом создавать экземпляр класса нужного драйвера,
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
