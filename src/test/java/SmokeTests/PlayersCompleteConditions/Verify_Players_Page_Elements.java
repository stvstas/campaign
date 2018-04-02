package SmokeTests.PlayersCompleteConditions;
import InputValues.ConfigInputValues;
import Steps.SmokeTestSteps.Player_Page_Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Verify_Players_Page_Elements {
    private WebDriver driver;
    private Player_Page_Elements player_page_elements;
    private ConfigInputValues urlconfig = new ConfigInputValues();

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(urlconfig.playerURL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        player_page_elements= PageFactory.initElements(driver,Player_Page_Elements.class);

    }

    @After
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.close();
    }

    @Test

    public void verifyPlayerPromotionPage() throws InterruptedException, AWTException {
        player_page_elements.verifyPlayerPage();
        player_page_elements.usernameValidation();

    }


}
