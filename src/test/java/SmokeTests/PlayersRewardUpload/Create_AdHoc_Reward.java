package SmokeTests.PlayersRewardUpload;

import InputValues.ConfigInputValues;
import Steps.SmokeTestSteps.Player_AdHoc_Reward;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Create_AdHoc_Reward {
    private WebDriver driver;
    private Player_AdHoc_Reward promotionsAdHocReward;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.playerURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        promotionsAdHocReward = PageFactory.initElements(driver, Player_AdHoc_Reward.class);

    }

    @After
    public void after() throws InterruptedException{
        Thread.sleep(5000);
        driver.close();
    }

    @Test
    public void adHocReward() throws InterruptedException, AWTException {
        promotionsAdHocReward.adHocRewardAction();
    }
}

