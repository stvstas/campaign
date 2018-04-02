package RegressionTests;

import InputValues.ConfigInputValues;
import Steps.RegressionTestSteps.CampaignConstraintsSteps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class VerifyCampaignConstraintsTest {
    private WebDriver driver;
    private CampaignConstraintsSteps campaignConstraintsSteps;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.createURL);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        campaignConstraintsSteps = PageFactory.initElements(driver, CampaignConstraintsSteps.class);
    }
    @After
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test

    public void selectAllConstraints() throws InterruptedException {
        campaignConstraintsSteps.showMoreButton();
        campaignConstraintsSteps.selectAllConstraints();
        campaignConstraintsSteps.selectAllConstraints();
        campaignConstraintsSteps.selectAllConstraints();
        campaignConstraintsSteps.searchForConstraints();
    }

}
