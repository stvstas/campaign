package Steps.SmokeTestSteps;

import InputValues.CampaignConditionsInputValues;
import InputValues.CampaignDetailsInputValues;
import PageObjects.CampaignDetailsPage;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Campaign_Creation_Details extends CampaignDetailsPage {
    public WebDriver driver;
    private CampaignConditionsInputValues campaignConditionsInputValues = new CampaignConditionsInputValues();
    private CampaignDetailsInputValues campaignDetailsInputValues = new CampaignDetailsInputValues();

    public void setCampaignDescription(int campaignNameListIndex) throws InterruptedException {
        campaignNameField.sendKeys(campaignDetailsInputValues.campaignName.get(campaignNameListIndex));
        campaignDescriptionField.sendKeys(campaignDetailsInputValues.campaignDescription);
        campaignURLFiled.sendKeys(campaignDetailsInputValues.campaignURL); }

    public void setCampaignScheduling() throws InterruptedException {
        schedulingButton.click();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(campaignConditionsInputValues.calendarPattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        endDateFiled.sendKeys(tomorrowAsString); }

    public void setExposureManagement() throws InterruptedException {
        exposureButton.click();
        instantRewardPayoutBox.click();
        //payoutThresholdFiled.sendKeys(Keys.BACK_SPACE,"0");
        }

    public void setCampaignConstraints(){
        campaignConstraintsExtendButton.click();
        allCurenciesBox.click();
        allChannelsBox.click();
        allLanguagesBox.click();
        allCountriesBox.click();
    }

     public void setAudience(){
        campaignAudienceButton.click();
        audienceUploadBox.click(); }

    public void setCostCentre() throws InterruptedException {
        costCentreButton.click();
        costCentreDropdown.get(campaignDetailsInputValues.costCentreValue).click(); }

}
