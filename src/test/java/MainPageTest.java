import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainPageTest {
    private WebDriver chromeDriver;
    private WebDriver firefoxDriver;
    private MainPage mainPage;

    @BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\geckodriver.exe");

        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.imdb.com/");
        /*firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firefoxDriver.manage().window().maximize();
        firefoxDriver.get("https://www.imdb.com/");
        mainPage = new MainPage(firefoxDriver);*/
    }

    @Test
    public void clickLogoBtnTestChrome(){
        mainPage = new MainPage(chromeDriver);
        String mainPageTitle = chromeDriver.getTitle();
        mainPage.clickLogoBtn();
        String mainPageTitleNew = chromeDriver.getTitle();
        Assertions.assertEquals(mainPageTitle, mainPageTitleNew);
        //"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows"
    }

    @AfterAll
    public void done(){
        //chromeDriver.quit();
        //firefoxDriver.quit();
    }
}
