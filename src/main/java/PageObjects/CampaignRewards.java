package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CampaignRewards {
    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[4]/div/ng-form/div[1]/div/div/div/select/option")
    protected List<WebElement> betFlavourDropdown;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[5]/div/ng-form/div[1]/div/div/div/div/div/div")
    protected WebElement returnStakeOnPayoutBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[6]/div/ng-form/div[1]/div/div/div/div/div/div")
    protected  WebElement activateOnDateBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[7]/div/ng-form/div[1]/div/div[1]/div/div/input")
    protected  WebElement ActivateOnCalendarField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[8]/div/ng-form/div[1]/div/div/div/absolute-relative-date/ng-form/div[2]/div[1]/input")
    protected WebElement relativeExpieryField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[9]/div/ng-form/div[1]/div/div/div/div/div/div")
    protected WebElement freebetFixedRewardBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[15]/div/ng-form/div[1]/div/div[1]/div/input")
    protected WebElement freebetMaxRewardFirstField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[14]/div/div/button")
    protected WebElement maxRewardFreebetAutofillButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/button[1]")
    protected  WebElement addConditionButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[1]/div/div[3]/div/div/div/div/cm-dropdown-select/span/ul/li")
    protected List<WebElement> addRewardDropdown;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/div/div[3]/div/div/div/div/cm-dropdown-select/span/ul/li")
    protected List<WebElement> addRewardDropdown2;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[1]/div/div[3]/div/div/div/div/cm-dropdown-select/span/button")
    protected WebElement addRewardButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/div/div[3]/div/div/div/div/cm-dropdown-select/span/button")
    protected WebElement addRewardButton2;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[6]/div/ng-form/div[1]/div/div/div/div/div/div/label")
    protected WebElement fixedRewardBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[11]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement maxRewardFirstField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[10]/div/div/button")
    protected WebElement autofillCashButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[2]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement conditionNameField;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[3]/button[2]")
    protected WebElement saveCampaign2StepsButton;

}
