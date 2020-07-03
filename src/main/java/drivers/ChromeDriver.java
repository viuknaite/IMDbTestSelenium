package drivers;

import org.openqa.selenium.WebDriver;

public class ChromeDriver{
    private static WebDriver chromeDriver;
    //private static Drivers drivers;

    public ChromeDriver(WebDriver driver){ this.chromeDriver = driver; }

    public Drivers init(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Vi\\IdeaProjects\\IMDbTestSelenium\\drivers\\chromedriver.exe");
        chromeDriver = new org.openqa.selenium.chrome.ChromeDriver();
        return new Drivers(chromeDriver);
    }
}
