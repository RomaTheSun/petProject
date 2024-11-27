package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import util.PropertyReader;

public class DriverProvider {
    private static WebDriver driver;

    // Singleton implementation for WebDriver
    public static WebDriver getDriver() {
        if (driver == null) { // Ensure only one instance of WebDriver is created
            String browser = PropertyReader.getProperty("browser");
            switch (browser.toLowerCase()) {
                case "chrome": {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                }
                case "safari": {
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unsupported browser: " + browser);
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    // Quit and clean up the WebDriver instance
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
