package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PlayerAdHocReward {
    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[1]/input")
    protected WebElement usernameField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/button")
    protected WebElement searchUsernameButton;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[1]/div[1]")
    protected WebElement rewardTypeButton;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[1]/div[1]/select/option")
    protected List<WebElement> rewardTypeDropdown;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[2]/div/input")
    protected  WebElement rewardNameField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[3]/div[1]/input")
    protected WebElement rewardAmountField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[4]/div[1]/input")
    protected  WebElement expiryDateAdHocField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[5]/div[1]/select")
    protected WebElement costCentreSubTypeButton;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[5]/div[1]/select/option")
    protected List<WebElement> costCentreSubTypeDropdown;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[6]/div/input")
    protected  WebElement reasonAdHocField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div[3]/div[7]/div[1]/button")
    protected WebElement payNowAdHocButton;

    @FindBy(xpath = "//*[@id='player_container']/form/div[2]/div/select")
    protected  WebElement playerActionButton;

    @FindBy (xpath = "//*[@id='player_container']/form/div[2]/div/select/option")
    protected List<WebElement> playerActionDropDown;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[3]/div[2]/div[2]/span")
    protected WebElement firstNameText;

}
