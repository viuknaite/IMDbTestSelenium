import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MainPageTest {
/*    private WebDriver chromeDriver;
    private WebDriver firefoxDriver;
    private MainPage mainPage;*/

    @BeforeAll
    void setUp(){
/*        System.setProperty("webdriver.chrome.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\viuknaite\\IdeaProjects\\IMDbTestSelenium\\drivers\\geckodriver.exe");

        chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.imdb.com/");*/
        /*firefoxDriver = new drivers.FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        firefoxDriver.manage().window().maximize();
        firefoxDriver.get("https://www.imdb.com/");
        mainPage = new pages.MainPage(firefoxDriver);*/
    }

/*    @Test
    void clickLogoBtnTestChrome(){
        mainPage = new pages.MainPage(chromeDriver);
        String mainPageTitle = chromeDriver.getTitle();
        mainPage.clickLogoBtn();
        String mainPageTitleNew = chromeDriver.getTitle();
        Assertions.assertEquals(mainPageTitle, mainPageTitleNew);
        //"IMDb: Ratings, Reviews, and Where to Watch the Best Movies & TV Shows"
    }*/

    @AfterAll
    void done(){
        //chromeDriver.quit();
        //firefoxDriver.quit();
    }
}
