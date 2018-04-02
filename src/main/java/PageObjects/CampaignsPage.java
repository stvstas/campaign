package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CampaignsPage {

    @FindBy(className = "title")
    protected WebElement pageTitleAssert;

    @FindBy(css = "body > div > div.topbar-container > div > ul > li:nth-child(2) > a")
    protected WebElement campaignPageTab;

    @FindBy(id = "campaign_query")
    protected WebElement filterCampaignField;

    @FindBy(xpath = "//div[@class='topbar']/input[@id='showActive']")
    protected WebElement expirationFilterBox;

    @FindBy(xpath="//div[@class='topbar']/a[@class='add-campaign-button add-campaign-button-add ng-scope']")
    protected WebElement createCampaignButton;

    @FindBy(xpath = "//table[@id='campaign_table']/tbody/tr/th[1]")
    protected WebElement campaignNameSort;

    @FindBy(xpath = "//table[@id='campaign_table']/tbody/tr/th[2]")
    protected WebElement campaignStartDateSort;

    @FindBy(xpath = "//table[@id='campaign_table']/tbody/tr/th[3]")
    protected WebElement campaignEndDateSort;

    @FindBy(xpath = "//table[@id='campaign_table']/tbody/tr/th[4]")
    protected WebElement campaignStatusSort;

    @FindBy(xpath = "//table[@id='campaign_table']/tbody/tr[@class='ng-scope']/td[1]")
    protected List<WebElement> filterCampaignName;

    @FindBy(xpath = "//tr[@class='ng-scope']/td[5]/div[@title='View Details']")
    protected  List<WebElement>allEdit;

    @FindBy(xpath = "//tr[@class='ng-scope']/td[6]/div[@title='Clone Campaign']")
    protected  List<WebElement>allClone;

    @FindBy(xpath = "//tr[@class='ng-scope']/td[7]/div[@title='Delete Campaign']")
    protected List<WebElement>allDelete;


}
