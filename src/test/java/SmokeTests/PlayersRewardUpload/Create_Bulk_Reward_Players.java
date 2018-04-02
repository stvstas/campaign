package SmokeTests.PlayersRewardUpload;

import InputValues.ConfigInputValues;
import Steps.SmokeTestSteps.Reward_Bulk_Upload;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Create_Bulk_Reward_Players {
    private WebDriver driver;
    private Reward_Bulk_Upload reward_bulk_upload;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.rewardUploadURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        reward_bulk_upload = PageFactory.initElements(driver, Reward_Bulk_Upload.class);

    }

    @After
    public void after() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test

    public void bulkReward() throws AWTException, InterruptedException {
        reward_bulk_upload.bulkRewardCashMoneyback();
        reward_bulk_upload.bulkRewardCashJustice();
        reward_bulk_upload.bulkRewardFreebetJustice();
        reward_bulk_upload.bulkRewardFreebetMoneyback();


    }
}
