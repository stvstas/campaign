package Steps.SmokeTestSteps;

import InputValues.CampaignConditionsInputValues;
import PageObjects.CampaignConditions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Campaign_Creation_Conditions extends CampaignConditions{
    public WebDriver driver;
    private CampaignConditionsInputValues campaignConditionsInputValues = new CampaignConditionsInputValues();

    public Campaign_Creation_Conditions(CampaignConditionsInputValues campaignConditionsInputValues) {
        this.campaignConditionsInputValues = campaignConditionsInputValues;
    }

    public void setConditionName() {
        conditionTabButton.click();
        conditionNameStepField.sendKeys(Keys.CONTROL + "a");
        conditionNameStepField.sendKeys(Keys.DELETE);
        conditionNameStepField.sendKeys(campaignConditionsInputValues.firstStepName);
        }

    public void audienceMemberCondition() throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(1).click();
        audienceMemberField.sendKeys(Keys.CONTROL + "a");
        audienceMemberField.sendKeys(Keys.ENTER);
        audienceMemberField.sendKeys(campaignConditionsInputValues.audienceUsername);
        addConditionButton.click(); }

    public void depositCondition() throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(2).click();
        conditionNameField.sendKeys(Keys.CONTROL + "a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.depositName);
        depositAccumulateBox.click();
        depositAccumulateBox.click();
        depositOccurenceField.sendKeys(Keys.CONTROL + "a");
        depositOccurenceField.sendKeys(Keys.DELETE);
        depositOccurenceField.sendKeys(campaignConditionsInputValues.depositOccurenceValue);
        depositNumberField.sendKeys(campaignConditionsInputValues.depositNumber);
        minDepositField1.sendKeys(campaignConditionsInputValues.depositMin);
        minDepositAutofillButton.click();
        addConditionButton.click();}

    public void gameWagersCondition() throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(3).click();
        conditionNameField.sendKeys(Keys.CONTROL + "a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.gameWagersname);
        gwCurrenciesField1.sendKeys(campaignConditionsInputValues.gwCurrenciesvalue);
        gameWagersAutofillButton.click();
        addConditionButton.click();
     }


    public void sportsbetCondition() throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(9).click();
        Thread.sleep(1000);
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.sportsbetName);
        sportsbetBetFlavourDropdown.get(1).click();
        sportsbetMinBetFirstField.sendKeys(Keys.CONTROL+"a");
        sportsbetMinBetFirstField.sendKeys(Keys.DELETE);
        sportsbetMinBetFirstField.sendKeys(campaignConditionsInputValues.sportsbetMinBetValue);
        sportsbetAutofillButton.click();
        //sportsbetBetCountField.sendKeys(campaignConditionsInputValues.sportsbetBetCount);
        sportsbetAllPriceTypesBox.click();
        sportsbetAllLegTypesBox.click();
        sportsbetAllBetTypesBox.click();
        }

    public void promoCodeCondition () throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(7).click();
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.promoCodeName);
        addPromoCodeButton.click();
        promoCodeField.sendKeys(campaignConditionsInputValues.promoCodeValue);
        promoMaxClaimsField.sendKeys(campaignConditionsInputValues.promoCodeMaxClaims);
        addPromoCodeButton.click();
        promoDeleteCodeButton.click();
        promoCodeField.sendKeys(campaignConditionsInputValues.promoCodeValue);
        promoMaxClaimsField.sendKeys(campaignConditionsInputValues.promoCodeMaxClaims);
        addConditionButton.click();

    }

   /* public void mbsSportsbetCondition(String sportsbetName,String sportsbetMinBetValue,String betCountValue) throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(5).click();
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(sportsbetName);
        sportsbetMinBetFirstField.sendKeys(Keys.CONTROL+"a");
        sportsbetMinBetFirstField.sendKeys(Keys.DELETE);
        sportsbetMinBetFirstField.sendKeys(sportsbetMinBetValue);
        sportsbetAutofillButton.click();
        sportsbetBetCountField.sendKeys(betCountValue);
        sportsbetBetFlavourDropdown.get(1).click();
        sportsbetAllPriceTypesBox.click();
        sportsbetAllLegTypesBox.click();
        sportsbetAllBetTypesBox.click();
         }*/

    public void registrationCondition() throws InterruptedException {
        addConditionStepButton.click();
        addConditionDropdown.get(8).click();
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.registrationName);
        allRegisteredChannelsBox.click();
        allRegisteredChannelsBox.click();
        addConditionButton.click();

    }


    public void optInCondition() throws InterruptedException {
       addConditionStepButton.click();
       addConditionDropdown.get(6).click();
       conditionNameField.sendKeys(Keys.CONTROL+"a");
       conditionNameField.sendKeys(Keys.DELETE);
       conditionNameField.sendKeys(campaignConditionsInputValues.optInName);
       addConditionButton.click();
   }

    public void addAnotherStepToCampaignWithAllConditions() throws InterruptedException {

        addStepToCampaignButton.click();
        conditionNameStepField2.sendKeys(Keys.CONTROL+"a");
        conditionNameStepField2.sendKeys(Keys.DELETE);
        conditionNameStepField2.sendKeys(campaignConditionsInputValues.secondStepName);

        //audience member deposit
        addConditionButton2.click();
        addConditionDropdown2.get(1).click();
        audienceMemberField.sendKeys(Keys.CONTROL + "a");
        audienceMemberField.sendKeys(Keys.DELETE);
        audienceMemberField.sendKeys(campaignConditionsInputValues.audienceUsername);
        addConditionButton.click();

        //deposit condition
        addConditionButton2.click();
        addConditionDropdown2.get(2).click();
        conditionNameField.sendKeys(Keys.CONTROL + "a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.depositName);
        depositAccumulateBox.click();
        depositAccumulateBox.click();
        depositOccurenceField.sendKeys(Keys.CONTROL + "a");
        depositOccurenceField.sendKeys(Keys.DELETE);
        depositOccurenceField.sendKeys(campaignConditionsInputValues.depositOccurenceValue);
        depositNumberField.sendKeys(campaignConditionsInputValues.depositNumber);
        minDepositField1.sendKeys(campaignConditionsInputValues.depositMin);
        minDepositAutofillButton.click();
        addConditionButton.click();

        //OptInCondition
        addConditionButton2.click();
        addConditionDropdown2.get(6).click();
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.optInName);
        addConditionButton.click();

        //Sportsbet Condition
        addConditionStepButton.click();
        addConditionDropdown.get(9).click();
        Thread.sleep(1000);
        conditionNameField.sendKeys(Keys.CONTROL+"a");
        conditionNameField.sendKeys(Keys.DELETE);
        conditionNameField.sendKeys(campaignConditionsInputValues.sportsbetName);
        //sportsbetBetCountField.sendKeys(campaignConditionsInputValues.sportsbetBetCount);
        sportsbetMinBetFirstField.sendKeys(Keys.CONTROL+"a");
        sportsbetMinBetFirstField.sendKeys(Keys.DELETE);
        sportsbetMinBetFirstField.sendKeys(campaignConditionsInputValues.sportsbetMinBetValue);
        sportsbetAutofillButton.click();
        //sportsbetBetFlavourDropdown.get(1).click();

    }


    public void saveCampaignConditions(){
        conditionsSaveCampaignButton.click();
    }
   }




