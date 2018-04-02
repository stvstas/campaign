package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RewardBulkUpload {

    @FindBy(className = "title")
    protected WebElement pageTitleAssert;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div/input")
    protected WebElement rewardUploadListButton;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[1]/select/option")
    protected List<WebElement> rewardUploadTypeDropdown;

    @FindBy(xpath = "//*[@id='reward_name']")
    protected WebElement rewardUploadNameField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[4]/div[1]/input")
    protected WebElement rewardUploadExpiryDateField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[5]/div[1]/select/option")
    protected List<WebElement> costCentreSubTypeDropdown;

    @FindBy(xpath = "//*[@id='reward_reason']")
    protected WebElement reasonField;

    @FindBy(xpath = "//*[@id='player_search_submit']")
    protected WebElement rewardPayNowButton;
}
