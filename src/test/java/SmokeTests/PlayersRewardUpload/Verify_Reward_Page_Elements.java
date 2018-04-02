package SmokeTests.PlayersRewardUpload;

import InputValues.ConfigInputValues;
import Steps.SmokeTestSteps.Reward_Upload_Page_Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Verify_Reward_Page_Elements {
    private WebDriver driver;
    private Reward_Upload_Page_Elements reward_upload_page_elements;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.rewardUploadURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        reward_upload_page_elements= PageFactory.initElements(driver,Reward_Upload_Page_Elements.class);

    }

    @After
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test

    public void verifyRewardUploadPage(){
        reward_upload_page_elements.verifyRewardPage();

    }
}
