package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignInclusions {
    protected WebDriver driver;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[1]/div[1]/div[2]/input")
    protected WebElement inclusionsSearchField;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/input")
    protected  WebElement inclusionsSelectAllBox;


    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[1]/div[1]/div[3]/div[2]/span")
    protected WebElement selectAllAssert;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[1]/div[1]/div[3]/div[1]/input")
    protected WebElement inclusionsExclSuspendedBox;


    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[1]/div[2]/div[2]/div[2]/button")
    protected  WebElement inclusionsTypesButton;













    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[2]/button/span")
    protected  WebElement freebetInclusionsAddButton;

    @FindBy(xpath = "/html/body/div[5]/div/div/div[2]/div/div[3]/div[2]/div[2]/button[1]")
    protected WebElement freebetInclusionsFinishedButtion;

    @FindBy(css = "a.pull-right")
    protected  WebElement inclusionsAddButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div[2]/div[2]/div/button[1]")
    protected  WebElement addConditionButton;

}
