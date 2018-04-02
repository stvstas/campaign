package Steps.SmokeTestSteps;

import InputValues.RewardUploadInputValues;
import PageObjects.RewardUploadPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Reward_Upload_Page_Elements extends RewardUploadPage {
    public WebDriver driver;

    public RewardUploadInputValues rewardUploadInputValues = new RewardUploadInputValues();
    public Reward_Upload_Page_Elements(WebDriver driver){
        this.driver=driver; }

    public void verifyRewardPage(){
        String title = pageTitleAssert.getText();
        Assert.assertEquals(rewardUploadInputValues.pageName,title); }


}
