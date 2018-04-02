package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CampaignDetailsPage {
    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern ng-valid-maxlength ng-valid-minlength']")
    protected WebElement campaignNameField;

    @FindBy(xpath = "//textarea[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-pattern ng-valid-maxlength']")
    protected WebElement campaignDescriptionField;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-pattern ng-valid-minlength']")
    protected  WebElement campaignURLFiled;

    @FindBy(xpath = "//div[@class='ng-scope']/ng-form[@class='formly ng-pristine ng-valid ng-isolate-scope']/div[2]/div[1]/div/div[1]/h4/a/span")
    protected WebElement schedulingButton;

    @FindBy(xpath = "//input[@class='form-control input_border_group adp-calendar_btn ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern ng-valid-future-date-time ng-valid-relative-date-time']")
    protected WebElement endDateFiled;

    @FindBy(xpath = "//div[@class='ng-scope']/ng-form[@class='formly ng-pristine ng-valid ng-isolate-scope']/div[3]/div[1]/div/div[1]/h4/a/span")
    protected WebElement exposureButton;

    @FindBy(xpath = "//input[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-pattern ng-valid-required']")
    protected WebElement payoutThresholdFiled;

    @FindBy(xpath = "//*[@id='campaign_tabs' ]/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[1]/h4/a/span/span")
    protected  WebElement campaignConstraintsExtendButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[3]/a")
    protected WebElement currenciesShowMoreButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement allCurenciesBox;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[2]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement allChannelsBox;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement allLanguagesBox;

    @FindBy(xpath ="//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[2]/span")
    protected WebElement currenciesError;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[2]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[2]/span")
    protected WebElement channelsError;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[2]/span")
    protected WebElement languagesError;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[4]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[2]/span")
    protected WebElement countriesError;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[6]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[2]/span")
    protected WebElement customerCategoriesError;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[4]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement allCountriesBox;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[1]/input")
    protected WebElement currenciesSearchField;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[2]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[1]/input")
    protected WebElement channelsSearchField;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[1]/input")
    protected WebElement languagesSearchField;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[4]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[1]/input")
    protected WebElement countriesSearchField;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[6]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[1]/input")
    protected WebElement customerCategoriesSearchField;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[6]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[1]/toggle-switch/div/div[2]/div/label")
    protected WebElement allCustomerCategories;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[2]/div/toggle-switch/div/div[1]/p")
    protected WebElement searchedCurrency;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[2]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[2]/div/toggle-switch/div/div[1]/p")
    protected WebElement searchedChannel;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[3]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[2]/div/toggle-switch/div/div[1]/p")
    protected WebElement searchedLanguage;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[4]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[2]/div/toggle-switch/div/div[1]/p")
    protected WebElement searchedCountry;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[4]/div/div/div[2]/div/ng-form/div[6]/div/ng-form/div[1]/div/div/div/multi-select-switches/div/div[3]/div[2]/div/toggle-switch/div/div[1]/p")
    protected WebElement searchedCustomerCategory;

    @FindBy(xpath = "//div[@class='ng-scope']/ng-form[@class='formly ng-pristine ng-valid ng-isolate-scope']/div[5]/div[1]/div/div[1]/h4/a/span/span")
    protected WebElement campaignAudienceButton;

    @FindBy(xpath = "//*[@id='campaign_tabs']/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[5]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/audience-toggle/div/div/div/label")
    protected WebElement audienceUploadBox;

    @FindBy(xpath = "//div[@class='ng-scope']/ng-form[@class='formly ng-pristine ng-valid ng-isolate-scope']/div[6]/div[1]/div/div[1]/h4/a/span/span")
    protected  WebElement costCentreButton;

    @FindBy(xpath = "//div[@class='col-sm-4']/select/option")
    protected List<WebElement> costCentreDropdown;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/uib-accordion/div/form/div[1]/div/ng-form/div[3]/div/div/div[2]/div/ng-form/div[1]/div/ng-form/div[1]/div/div/div/div/div/div/label")
    protected WebElement instantRewardPayoutBox;

}
