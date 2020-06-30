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

public class Drivers {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static JavascriptExecutor jse;
    private static File screenshot;
    private static Date date;
    private static DateFormat dateFormat;
    private static Calendar calendar;

    public Drivers(WebDriver driver){ this.driver = driver; }

    public void implicitWait(){ driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); }

    public void explicitWait(){
        wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf());
    }

    public void windowSize(){ driver.manage().window().maximize(); }

    public void javaScriptExecutor(){
        jse = (JavascriptExecutor)driver;
        //jse.executeScript("");
    }

    public void makeScreenshot(){
        //date = new Date();
        dateFormat = DateFormat.getDateInstance();
        calendar = Calendar.getInstance();
        String currentDate = dateFormat.format(calendar.getTime());
        String filename = currentDate + ".png";
        screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {

        } catch (){

        }
        //TODO создавать вложенные папки с датой и названием теста
/*        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy_MM_dd hh_mm_ss");
        String fileName = dateFormat.format(date) + ".png";

       File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // ctrl + alt + t
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\viuknaite\\IdeaProjects\\JSandBrowserTest\\screenshots\\" + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public void stopDriver(){ driver.quit(); }
}
