package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignUILogin {

    @FindBy(id = "username")
    protected WebElement loginUsernameField;

    @FindBy(id = "password")
    protected WebElement loginPasswordField;

    @FindBy(xpath = "//section[3]/button")
    protected WebElement loginButton;

    @FindBy(xpath = "//section[4]/div")
    protected WebElement loginClearFormButton;

    @FindBy(id = "msg")
    protected WebElement credentialsError;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/ul/li[3]/a")
    protected WebElement pageTitleAssert;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/ul/li[5]/a")
    protected WebElement logoutButton;

}
