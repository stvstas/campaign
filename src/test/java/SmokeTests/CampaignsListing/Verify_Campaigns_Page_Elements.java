package SmokeTests.CampaignsListing;

import InputValues.ConfigInputValues;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import Steps.SmokeTestSteps.Campaigns_Page_Elements;

public class Verify_Campaigns_Page_Elements {
    private WebDriver driver;
    private Campaigns_Page_Elements campaigns_page_elements;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.campaignsURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        campaigns_page_elements = PageFactory.initElements(driver, Campaigns_Page_Elements.class);


    }

    @After
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void CampaignsElementsTest() throws InterruptedException, AWTException {
    campaigns_page_elements.verifyPage();
    campaigns_page_elements.filterCampaign();
    campaigns_page_elements.createCampButton();
    campaigns_page_elements.sortingCampaigns();
    campaigns_page_elements.editButtons();
    }




}
