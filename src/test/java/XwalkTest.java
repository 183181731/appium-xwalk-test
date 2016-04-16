import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**e
 * Created by wang on 16-4-16.
 */
public class XwalkTest {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception {

        //Appium setup for the app
        //needs to be installed on target device before the test
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.nd.pad.smartclass");
        capabilities.setCapability("appActivity", "");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "4.4.2");

        driver = new AndroidDriver(new URL("http://192.168.99.100:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void refillTest() throws InterruptedException {
        System.out.println(driver.getContext());
    }
}
