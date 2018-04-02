package RegressionTests;

import InputValues.ConfigInputValues;
import Steps.RegressionTestSteps.LoginSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class VerifyLoginTest {
    private WebDriver driver;
    private LoginSteps loginSteps;
    private ConfigInputValues configInputValues = new ConfigInputValues();


    @Before
    public void before(){
        String PROXY = "custproxy.openbet.com:8080";
        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setHttpProxy(PROXY)
                .setFtpProxy(PROXY)
                .setSslProxy(PROXY);
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(CapabilityType.PROXY, proxy);
        driver = new ChromeDriver(cap);
        driver.manage().window().maximize();
        driver.navigate().to(configInputValues.referenceUpgradeURL);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        loginSteps = PageFactory.initElements(driver, LoginSteps.class);
    }
    @After
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test

    public void loginTest() throws InterruptedException {
        loginSteps.successfulLoginAttempt();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        loginSteps.failedLoginAttempt();
        loginSteps.clearForm();

    }

}
