package Steps.SmokeTestSteps;

import InputValues.PlayerPageInputValues;
import PageObjects.PlayerAdministrationPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Player_Page_Elements extends PlayerAdministrationPage {
    public WebDriver driver;
    public PlayerPageInputValues playerPageInputValues = new PlayerPageInputValues();

    public Player_Page_Elements(WebDriver driver){
        this.driver=driver; }

    public void verifyPlayerPage(){
        String title = pageTitleAssert.getText();
        Assert.assertEquals(playerPageInputValues.pageName,title); }



    public void usernameValidation() throws InterruptedException, AWTException {
        usernameField.sendKeys(playerPageInputValues.invalidUsername);
        searchUsernameButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement visibilityofError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='player_container']/form/div[1]/div[2]/div[3]")));
        String error= usernameError.getText();
        Assert.assertEquals(playerPageInputValues.usernameErrorText,error);
        usernameField.sendKeys(Keys.CONTROL + "a");
        usernameField.sendKeys(Keys.DELETE);
        usernameField.sendKeys(playerPageInputValues.validUsername);
        searchUsernameButton.click();
        WebElement visibilityCustomerDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='player_container']/form/div[1]/div[3]/div[1]/div[2]/span")));
        String  firstName = firstNameText.getText();
        Assert.assertEquals(playerPageInputValues.firstNameValue,firstName);
        String lastName= lastNameText.getText();
        Assert.assertEquals(playerPageInputValues.lastNameValue,lastName);
        String dateOfBirth= dateOfBirthText.getText();
        Assert.assertEquals(playerPageInputValues.dateOfBirthValue,dateOfBirth);

        Robot robot = null;
        robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


    }
}
