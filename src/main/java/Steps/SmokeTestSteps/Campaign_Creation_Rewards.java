package Steps.SmokeTestSteps;

import PageObjects.CampaignRewards;
import InputValues.CampaignRewardsInputValues;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Campaign_Creation_Rewards extends CampaignRewards{
    public WebDriver driver;
    private CampaignRewardsInputValues campaignRewardsInputValues = new CampaignRewardsInputValues();

    public void addRewardCash() throws InterruptedException {
        addRewardButton.click();
        addRewardDropdown.get(1).click();
        conditionNameField.sendKeys(campaignRewardsInputValues.cashRewardName);
        fixedRewardBox.click();
        maxRewardFirstField.sendKeys(Keys.CONTROL + "a");
        maxRewardFirstField.sendKeys(Keys.DELETE);
        maxRewardFirstField.sendKeys(campaignRewardsInputValues.cashRewardValue);
        autofillCashButton.click();
        addConditionButton.click();
    }

    public void addRewardCash2() throws InterruptedException {
        addRewardButton2.click();
        addRewardDropdown2.get(1).click();
        conditionNameField.sendKeys(campaignRewardsInputValues.cashRewardName);
        fixedRewardBox.click();
        maxRewardFirstField.sendKeys(Keys.CONTROL + "a");
        maxRewardFirstField.sendKeys(Keys.DELETE);
        maxRewardFirstField.sendKeys(campaignRewardsInputValues.cashRewardValue);
        autofillCashButton.click();
        addConditionButton.click();
        saveCampaign2StepsButton.click();
    }


    public void  addRewardFreebet() throws InterruptedException {
        addRewardButton.click();
        addRewardDropdown.get(2).click();
        Thread.sleep(1000);
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignRewardsInputValues.freebetName);
        betFlavourDropdown.get(campaignRewardsInputValues.freebetBetFlavourValue).click();
        returnStakeOnPayoutBox.click();
        activateOnDateBox.click();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(campaignRewardsInputValues.calendarPattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        ActivateOnCalendarField.sendKeys(tomorrowAsString);
        relativeExpieryField.sendKeys(campaignRewardsInputValues.freebetRelativeExpiery);
        freebetFixedRewardBox.click();
        freebetMaxRewardFirstField.sendKeys(Keys.CONTROL+"a");
        freebetMaxRewardFirstField.sendKeys(Keys.DELETE);
        freebetMaxRewardFirstField.sendKeys(campaignRewardsInputValues.freebetMaxRewardValue);
        maxRewardFreebetAutofillButton.click();

    }
}
