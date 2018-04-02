package SmokeTests.CampaignCreationDetails;

import InputValues.ConfigInputValues;
import Steps.SmokeTestSteps.Campaign_Creation_Details;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Verify_Campaign_Details {
    private WebDriver driver;
    private Campaign_Creation_Details campaign_creation_details;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.createURL);
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        campaign_creation_details = PageFactory.initElements(driver, Campaign_Creation_Details.class);

    }

    @After
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void CampaignsElementsTest() throws InterruptedException, AWTException {
        campaign_creation_details.setCampaignDescription(0);
        campaign_creation_details.setCampaignScheduling();
        campaign_creation_details.setExposureManagement();
        campaign_creation_details.setCampaignConstraints();
        campaign_creation_details.setAudience();
        campaign_creation_details.setCostCentre();

    }
}
