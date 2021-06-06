package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class parallelDriver {

    private  static ThreadLocal<WebDriver> driverThreadLocal=new ThreadLocal<>();
    private parallelDriver(){

    }

    public synchronized static WebDriver getDriver(){
        String browser=configurationReader.getProperty("browser");
        if (driverThreadLocal.get()==null) {

            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverThreadLocal.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverThreadLocal.set(new FirefoxDriver());
                    break;
                default:
                    throw new RuntimeException("Unimplemented driver type!");
            }
        }
        return driverThreadLocal.get();

    }

    public synchronized void closeDriver(){
        if (driverThreadLocal.get()!=null) {
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }

    }
}
