package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PlayerAdministrationPage {

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[1]/input")
    protected WebElement usernameField;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/button")
    protected WebElement searchUsernameButton;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[3]/div[2]/div[2]/span")
    protected WebElement firstNameText;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[3]/div[3]/div[2]/span")
    protected WebElement lastNameText;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[3]/div[4]/div[2]/span")
    protected WebElement dateOfBirthText;

    @FindBy(xpath = "//*[@id='player_container']/form/div[1]/div[2]/div[3]")
    protected WebElement usernameError;

    @FindBy(className = "title")
    protected WebElement pageTitleAssert;


}
