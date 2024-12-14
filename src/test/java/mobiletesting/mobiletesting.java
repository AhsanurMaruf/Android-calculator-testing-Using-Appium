package mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

public class mobiletesting {

    private AndroidDriver driver;
    private URL url;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        BaseOptions options = new BaseOptions()
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:platformName", "Android")
                .amend("appium:platformversion", "11")
                .amend("appium:deviceName", "8PTGAM4XMVEQPBEE")
                .amend("appium:appPackage", "com.bng.calculator")
                .amend("appium:appActivity", "com.bng.calc.MainActivity")
                .amend("appium:newCommandTimeout", "3600")
                .amend("appium:connectHardwareKeyboard", "true");
        
        url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, options);
    }

    @Test
    public void sampleTest() {
        // Test Addition
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_5")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/plus")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_2")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/equal")).click();

        // Test Subtraction
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_4")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/minus")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_2")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/equal")).click();

        // Test Multiplication
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_4")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/multi")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_2")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/equal")).click();

        // Test Division
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_4")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/divi")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/btn_2")).click();
        driver.findElement(AppiumBy.id("com.bng.calculator:id/equal")).click();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    // Main method to run this TestNG class
    public static void main(String[] args) {
        org.testng.TestNG testng = new org.testng.TestNG();
        testng.setTestClasses(new Class[] { mobiletesting.class });
        testng.run();
    }
}
