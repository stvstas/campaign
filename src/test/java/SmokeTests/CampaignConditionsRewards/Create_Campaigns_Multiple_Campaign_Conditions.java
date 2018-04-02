package SmokeTests.CampaignConditionsRewards;

import InputValues.ConfigInputValues;
import Steps.SmokeTestSteps.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Create_Campaigns_Multiple_Campaign_Conditions {
    private WebDriver driver;
    private Campaign_Creation_Conditions campaign_creation_conditions;
    private Campaign_Creation_Rewards campaign_creation_rewards;
    private Campaign_Creation_Details campaign_creation_details;
    private Campaign_Creation_Inclusions campaign_creation_inclusions;
    private ConnectionToDatabase connectionToDatabase;
    private Campaigns_Page_Elements campaigns_page_elements;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.createURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        campaign_creation_details = PageFactory.initElements(driver, Campaign_Creation_Details.class);
        campaign_creation_conditions = PageFactory.initElements(driver, Campaign_Creation_Conditions.class);
        campaign_creation_rewards = PageFactory.initElements(driver, Campaign_Creation_Rewards.class);
        campaign_creation_inclusions=PageFactory.initElements(driver, Campaign_Creation_Inclusions.class);
        connectionToDatabase=PageFactory.initElements(driver,ConnectionToDatabase.class);
        campaigns_page_elements=PageFactory.initElements(driver,Campaigns_Page_Elements.class);
    }

    @After
    public void after() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void CreateCampaignsWithMultipleConditions() throws Exception{
        //campaign with Sportsbet and Audience condition
        campaign_creation_details.setCampaignDescription(8);
        campaign_creation_details.setCampaignScheduling();
        campaign_creation_details.setExposureManagement();
        campaign_creation_details.setCampaignConstraints();
        campaign_creation_details.setAudience();
        campaign_creation_details.setCostCentre();
        campaign_creation_conditions.setConditionName();
        campaign_creation_conditions.sportsbetCondition();
        connectionToDatabase.connectToDatabaseUpdate("update tev set start_time = TODAY + 5");
        campaign_creation_inclusions.addClassesInclusion();
        campaign_creation_inclusions.addTypesInclusions();
        campaign_creation_inclusions.addEventsInclusions();
        campaign_creation_inclusions.addMarketsInclusions();
        campaign_creation_conditions.audienceMemberCondition();
        campaign_creation_rewards.addRewardCash();
        campaign_creation_conditions.saveCampaignConditions();

        //campaign with Deposit and Promocode
        campaigns_page_elements.createCampButtonMultiple();
        campaign_creation_details.setCampaignDescription(9);
        campaign_creation_details.setCampaignScheduling();
        campaign_creation_details.setExposureManagement();
        campaign_creation_details.setCampaignConstraints();
        campaign_creation_details.setAudience();
        campaign_creation_details.setCostCentre();
        campaign_creation_conditions.setConditionName();
        campaign_creation_conditions.depositCondition();
        campaign_creation_conditions.promoCodeCondition();
        campaign_creation_rewards.addRewardFreebet();
        campaign_creation_inclusions.addClassesInclusion();
        campaign_creation_inclusions.addTypesInclusions();
        campaign_creation_inclusions.addEventsInclusions();
        campaign_creation_inclusions.addMarketsInclusions();
        campaign_creation_conditions.saveCampaignConditions();

        //campaign with registration , OptIn and MBS Sportsbet
        campaigns_page_elements.createCampButtonMultiple();
        campaign_creation_details.setCampaignDescription(10);
        campaign_creation_details.setCampaignScheduling();
        campaign_creation_details.setExposureManagement();
        campaign_creation_details.setCampaignConstraints();
        campaign_creation_details.setAudience();
        campaign_creation_details.setCostCentre();
        campaign_creation_conditions.setConditionName();
        campaign_creation_conditions.registrationCondition();
        campaign_creation_conditions.optInCondition();
        campaign_creation_conditions.sportsbetCondition();
        campaign_creation_inclusions.addClassesInclusion();
        campaign_creation_inclusions.addTypesInclusions();
        campaign_creation_inclusions.addEventsInclusions();
        campaign_creation_inclusions.addMarketsInclusions();
        campaign_creation_rewards.addRewardCash();
        campaign_creation_conditions.saveCampaignConditions();



    }
}
