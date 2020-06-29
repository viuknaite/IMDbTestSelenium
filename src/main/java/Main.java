import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    static WebDriver chromeDriver;
    static WebDriver firefoxDriver;
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\geckodriver.exe");

        chromeDriver = new ChromeDriver();
        firefoxDriver = new FirefoxDriver();
    }
}
