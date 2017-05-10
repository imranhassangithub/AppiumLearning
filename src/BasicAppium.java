import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicAppium extends AppiumBaseClass{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//tagname(classname)[@attribute='value']
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
		driver.findElementByXPath("//android.widget.EditText[@resource-id='android:id/edit']").sendKeys("Hello");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		
	}

}
