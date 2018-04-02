package Steps.SmokeTestSteps;

import InputValues.CampaignInclusionsInputValues;
import PageObjects.CampaignInclusions;
import org.openqa.selenium.WebDriver;

public class Campaign_Creation_Inclusions extends CampaignInclusions{
    public WebDriver driver;
    private CampaignInclusionsInputValues campaignRewardsInputValues = new CampaignInclusionsInputValues();

    public void addClassesInclusion() {
        inclusionsAddButton.click();
        inclusionsSearchField.sendKeys(campaignRewardsInputValues.inclusionsMarket);
        inclusionsSelectAllBox.click();
        inclusionsTypesButton.click();

        }

        public void addTypesInclusions() throws InterruptedException {
        inclusionsSearchField.sendKeys(campaignRewardsInputValues.freeBetType);
        Thread.sleep(1000);
        inclusionsExclSuspendedBox.click();
        inclusionsExclSuspendedBox.click();
        inclusionsSelectAllBox.click();
        inclusionsTypesButton.click();

        }

        public void addEventsInclusions() throws InterruptedException {
        Thread.sleep(1000);
        inclusionsExclSuspendedBox.click();
        inclusionsExclSuspendedBox.click();
        inclusionsSelectAllBox.click();
        inclusionsTypesButton.click();
        }

        public void addMarketsInclusions() throws InterruptedException {
        Thread.sleep(1000);
        inclusionsExclSuspendedBox.click();
        inclusionsExclSuspendedBox.click();
        inclusionsSelectAllBox.click();
        freebetInclusionsAddButton.click();
        freebetInclusionsFinishedButtion.click();
        addConditionButton.click(); }

}
