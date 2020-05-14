import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {


        //File f=new File("resources");

        File fs=new File("/Users/ekotliar/IdeaProjects/BrowserStackTesting1/src/test/resources/WikipediaSample(1).apk");
        //File fs=new File("/Users/ekotliar/IdeaProjects/BrowserStackTesting1/src/test/resources/original.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5556");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

        AndroidDriver<AndroidElement>driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(10000);

        //driver.findElementByClassName("android.widget.TextView"@ )
        

        driver.quit();
    }

}
