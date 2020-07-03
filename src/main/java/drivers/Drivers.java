package drivers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Drivers{
    static WebDriver driver;
    static WebDriverWait wait;
    static JavascriptExecutor jse;
    static File screenshot;
    static File directory;
    static Date date;
    static SimpleDateFormat dateFormat;

    public Drivers(WebDriver driver){ this.driver = driver; }

    public abstract void implicitWait(){ driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); }

    public void explicitWait(){ wait = new WebDriverWait(driver, 10); }

    public void windowSize(){ driver.manage().window().maximize(); }

    public void javaScriptExecutor(){ jse = (JavascriptExecutor)driver; }

    public void makeScreenshot(){
        date = new Date();
        dateFormat = new SimpleDateFormat("MM.dd.yyyy");
        String directoryName = dateFormat.format(date);

        directory = new File("\\screenshots\\" + directoryName);
        directory.mkdir();

        screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }

    public void stopDriver(){ driver.quit(); }
}
