package Steps.RegressionTestSteps;

import InputValues.ConfigInputValues;
import PageObjects.CampaignUILogin;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginSteps extends CampaignUILogin {
    public WebDriver driver;
    private ConfigInputValues configInputValues = new ConfigInputValues();

    public void successfulLoginAttempt() throws InterruptedException {
        loginUsernameField.sendKeys(configInputValues.loginUsername);
        loginPasswordField.sendKeys(configInputValues.loginPassword);
        loginButton.click();
        String title = pageTitleAssert.getText();
        try{
            Assert.assertEquals(configInputValues.tabName,title);
        }
        catch (ComparisonFailure e) {}
        logoutButton.click();
    }

    public void failedLoginAttempt(){
        loginUsernameField.sendKeys(configInputValues.wrongLoginUsername);
        loginPasswordField.sendKeys(configInputValues.loginPassword);
        loginButton.click();
        String credentialsErrorText= credentialsError.getText();
        try{
            Assert.assertEquals(configInputValues.credentialsError,credentialsErrorText); }
        catch (ComparisonFailure e){}
    }

    public void clearForm(){
        loginUsernameField.sendKeys(configInputValues.wrongLoginUsername);
        loginPasswordField.sendKeys(configInputValues.loginPassword);
        loginClearFormButton.click();
    }

}
