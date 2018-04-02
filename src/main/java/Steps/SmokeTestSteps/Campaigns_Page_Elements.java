package Steps.SmokeTestSteps;

import InputValues.CampaignDetailsInputValues;
import PageObjects.CampaignsPage;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Campaigns_Page_Elements extends CampaignsPage {
    public WebDriver driver;
    private CampaignDetailsInputValues campaignDetailsInputValues = new CampaignDetailsInputValues();

    public void verifyPage() throws InterruptedException {
        String title = pageTitleAssert.getText();
        Assert.assertEquals(campaignDetailsInputValues.pageName,title); }

    public void  filterCampaign() throws InterruptedException {
        String filterText = filterCampaignName.get(0).getText();
        filterCampaignField.sendKeys(filterText);
        filterCampaignField.sendKeys(Keys.CONTROL + "a");
        filterCampaignField.sendKeys(Keys.DELETE);
        expirationFilterBox.click();
        expirationFilterBox.click(); }

    public void createCampButton()throws InterruptedException {
        createCampaignButton.click();
        campaignPageTab.click();}

    public void createCampButtonMultiple()throws InterruptedException {
        createCampaignButton.click();
        }

    public void sortingCampaigns()throws InterruptedException {
        campaignNameSort.click();
        campaignStartDateSort.click();
        campaignEndDateSort.click();
        campaignStatusSort.click();
        }



    public void editButtons() throws InterruptedException, AWTException {
        allEdit.get(0).click();
        campaignPageTab.click();
        allClone.get(0).click();
        campaignPageTab.click();
        allDelete.get(0).click();
        Robot robot = null;
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        }
    }


