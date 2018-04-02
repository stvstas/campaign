package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CampaignConditions  {


    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-text-inputs/ng-form/div/div[2]/button")
    protected WebElement addPromoCodeButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-text-inputs/ng-form/div/div[2]/div[2]/div/div[1]/input")
    protected WebElement promoCodeField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-text-inputs/ng-form/div/div[2]/div[2]/div/div[2]/input")
    protected WebElement promoMaxClaimsField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-text-inputs/ng-form/div/div[2]/div[2]/div[1]/div[5]/div")
    protected WebElement promoDeleteCodeButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement allRegisteredChannelsBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[8]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement sportsbetMinBetFirstField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[7]/div/div/button")
    protected WebElement sportsbetAutofillButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[4]/div/ng-form/div[1]/div/div[1]/div/input")
    protected WebElement sportsbetBetCountField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/select/option")
    protected List<WebElement> sportsbetBetFlavourDropdown;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[28]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected  WebElement sportsbetAllPriceTypesBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[29]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected  WebElement sportsbetAllLegTypesBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[31]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement sportsbetAllBetTypesBox;

    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked']/li[2]")
    protected WebElement conditionTabButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[1]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement conditionNameStepField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[2]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement conditionNameField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/button[1]")
    protected  WebElement addConditionButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div[1]/div/input")
    protected WebElement conditionNameStepField2;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/div/div[2]/div/div/div/div/cm-dropdown-select/span/button")
    protected  WebElement addConditionButton2;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/div/div[2]/div/div/div/div/cm-dropdown-select/span/ul/li")
    protected List<WebElement> addConditionDropdown2;

    @FindBy(xpath = "//cm-dropdown-select[@type='condition']/span/ul/li")
    protected List<WebElement> addConditionDropdown;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[1]/div/div[2]/div/div/div/div/cm-dropdown-select/span/button")
    protected WebElement addConditionStepButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/button[1]")
    protected WebElement addStepToCampaignButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[2]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement audienceMemberField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[3]/div/ng-form/div[1]/div/div/div/div/div/div/label")
    protected WebElement depositAccumulateBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[4]/div/ng-form/div[1]/div/div[1]/div/input")
    protected WebElement depositOccurenceField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[5]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement depositNumberField;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[8]/div/ng-form/div[1]/div/div/div/input")
    protected WebElement minDepositField1;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[7]/div/div/button")
    protected WebElement minDepositAutofillButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[5]/div/ng-form/div[1]/div/div/label")
    protected WebElement gwCurrenciesField1;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[1]/ng-form/div[4]/div/div/button")
    protected WebElement gameWagersAutofillButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[3]/div/div[2]/button[2]")
    protected WebElement conditionsSaveCampaignButton;

}
