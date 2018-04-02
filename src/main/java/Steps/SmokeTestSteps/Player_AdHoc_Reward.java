package Steps.SmokeTestSteps;

import InputValues.CampaignDetailsInputValues;
import InputValues.PlayerAdHocRewardInputValues;
import PageObjects.PlayerAdHocReward;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Player_AdHoc_Reward extends PlayerAdHocReward {
    public WebDriver driver;
    private CampaignDetailsInputValues campaignDetailsInputValues = new CampaignDetailsInputValues();
    private PlayerAdHocRewardInputValues playerAdHocRewardInputValues = new PlayerAdHocRewardInputValues();



    public void  adHocRewardAction() throws InterruptedException, AWTException ,UnhandledAlertException{
        usernameField.sendKeys(playerAdHocRewardInputValues.username);
        searchUsernameButton.click();
        Thread.sleep(2000);
        playerActionDropDown.get(2).click();
        rewardTypeButton.click();
        rewardTypeDropdown.get(playerAdHocRewardInputValues.rewardTypeValue).click();
        rewardNameField.sendKeys(playerAdHocRewardInputValues.rewardDescriptionText);
        rewardAmountField.sendKeys(playerAdHocRewardInputValues.rewardAmountValue);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(campaignDetailsInputValues.calendarPattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        expiryDateAdHocField.sendKeys(tomorrowAsString);
        costCentreSubTypeButton.click();
        costCentreSubTypeDropdown.get(playerAdHocRewardInputValues.costCentreValue).click();
        reasonAdHocField.sendKeys(playerAdHocRewardInputValues.reasonText);
        payNowAdHocButton.click();
        Robot robot1 ;
        robot1 = new Robot();
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);

    }


}





