package Steps.SmokeTestSteps;

import InputValues.RewardBulkUploadInputValues;
import InputValues.RewardUploadInputValues;
import PageObjects.RewardBulkUpload;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Reward_Bulk_Upload extends RewardBulkUpload{
    public WebDriver driver;
    public RewardBulkUploadInputValues rewardBulkUploadInputValues = new RewardBulkUploadInputValues();
    public RewardUploadInputValues rewardUploadInputValues = new RewardUploadInputValues();
    public Reward_Bulk_Upload(WebDriver driver){
        this.driver=driver; }

    public void bulkRewardCashMoneyback() throws AWTException, InterruptedException {
        String title = pageTitleAssert.getText();
        Assert.assertEquals(rewardUploadInputValues.pageName,title);
        rewardUploadListButton.sendKeys(rewardBulkUploadInputValues.audienceUploadFilePath);
        rewardUploadTypeDropdown.get(1).click();
        rewardUploadNameField.sendKeys(rewardBulkUploadInputValues.rewardName);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(rewardBulkUploadInputValues.expieryDatePattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        rewardUploadExpiryDateField.sendKeys(tomorrowAsString);
        costCentreSubTypeDropdown.get(1).click();
        reasonField.sendKeys(rewardBulkUploadInputValues.reason);
        rewardPayNowButton.click();
        driver.switchTo().alert().accept();
        driver.get(rewardBulkUploadInputValues.urlBulkUpload);

    }

    public void bulkRewardCashJustice() throws AWTException, InterruptedException {
        String title = pageTitleAssert.getText();
        Assert.assertEquals(rewardUploadInputValues.pageName,title);
        rewardUploadListButton.sendKeys(rewardBulkUploadInputValues.audienceUploadFilePath);
        rewardUploadTypeDropdown.get(1).click();
        rewardUploadNameField.sendKeys(rewardBulkUploadInputValues.rewardName);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(rewardBulkUploadInputValues.expieryDatePattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        rewardUploadExpiryDateField.sendKeys(tomorrowAsString);
        costCentreSubTypeDropdown.get(2).click();
        reasonField.sendKeys(rewardBulkUploadInputValues.reason);
        rewardPayNowButton.click();
        driver.switchTo().alert().accept();
        driver.get(rewardBulkUploadInputValues.urlBulkUpload);

    }

    public void bulkRewardFreebetMoneyback() throws AWTException, InterruptedException {
        String title = pageTitleAssert.getText();
        Assert.assertEquals(rewardUploadInputValues.pageName,title);
        rewardUploadListButton.sendKeys(rewardBulkUploadInputValues.audienceUploadFilePath);
        rewardUploadTypeDropdown.get(2).click();
        rewardUploadNameField.sendKeys(rewardBulkUploadInputValues.rewardName);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(rewardBulkUploadInputValues.expieryDatePattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        rewardUploadExpiryDateField.sendKeys(tomorrowAsString);
        costCentreSubTypeDropdown.get(1).click();
        reasonField.sendKeys(rewardBulkUploadInputValues.reason);
        rewardPayNowButton.click();
        driver.switchTo().alert().accept();
        driver.get(rewardBulkUploadInputValues.urlBulkUpload);

    }

    public void bulkRewardFreebetJustice() throws AWTException, InterruptedException {
        String title = pageTitleAssert.getText();
        Assert.assertEquals(rewardUploadInputValues.pageName,title);
        rewardUploadListButton.sendKeys(rewardBulkUploadInputValues.audienceUploadFilePath);
        rewardUploadTypeDropdown.get(2).click();
        rewardUploadNameField.sendKeys(rewardBulkUploadInputValues.rewardName);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1);
        Date tomorrow = calendar.getTime();
        DateFormat dateFormat = new SimpleDateFormat(rewardBulkUploadInputValues.expieryDatePattern);
        String tomorrowAsString = dateFormat.format(tomorrow);
        rewardUploadExpiryDateField.sendKeys(tomorrowAsString);
        costCentreSubTypeDropdown.get(2).click();
        reasonField.sendKeys(rewardBulkUploadInputValues.reason);
        rewardPayNowButton.click();
        driver.switchTo().alert().accept();
        driver.get(rewardBulkUploadInputValues.urlBulkUpload);



    }




}
