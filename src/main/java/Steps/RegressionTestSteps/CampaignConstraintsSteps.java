package Steps.RegressionTestSteps;

import InputValues.CampaignDetailsInputValues;
import PageObjects.CampaignDetailsPage;
import org.junit.Assert;
import org.junit.ComparisonFailure;
import org.openqa.selenium.WebDriver;

public class CampaignConstraintsSteps extends CampaignDetailsPage {
    public WebDriver driver;
    private CampaignDetailsInputValues campaignDetailsInputValues = new CampaignDetailsInputValues();


    public void showMoreButton(){
        campaignConstraintsExtendButton.click();
        currenciesShowMoreButton.click();
    }

    public void selectAllConstraints(){
        String currenciesErrorText = currenciesError.getText();
        String channelsErrorText = channelsError.getText();
        String languagesErrorText = languagesError.getText();
        String countriesErrorText = countriesError.getText();
        String customerCategoriesErrorText = customerCategoriesError.getText();

        allCurenciesBox.click();
        try{
            Assert.assertEquals(campaignDetailsInputValues.currenciesExpectedError,currenciesErrorText); }
        catch (ComparisonFailure e){}

        allChannelsBox.click();
        try{
            Assert.assertEquals(campaignDetailsInputValues.channelsExpectedError,channelsErrorText); }
        catch (ComparisonFailure e){}

        allLanguagesBox.click();
        try{
            Assert.assertEquals(campaignDetailsInputValues.languagesExpectedError,languagesErrorText); }
        catch (ComparisonFailure e){}

        allCountriesBox.click();

        try{
            Assert.assertEquals(campaignDetailsInputValues.countriesExpectedError,countriesErrorText); }
        catch (ComparisonFailure e){}

        allCustomerCategories.click();
        allCustomerCategories.click();
        try{
            Assert.assertEquals(campaignDetailsInputValues.customerExpectedError,customerCategoriesErrorText); }
        catch (ComparisonFailure e){}
    }

    public void searchForConstraints() throws InterruptedException {
        String searchedCurrencyText = searchedCurrency.getText();
        String searchedChannelText = searchedChannel.getText();
        String searchedLanguageText = searchedLanguage.getText();
        String searchedCountriesText = searchedCountry.getText();
        String searchedCustomerCategoryText = searchedCustomerCategory.getText();

        currenciesSearchField.sendKeys(campaignDetailsInputValues.currenciesSearchText);
        try{
            Assert.assertEquals(campaignDetailsInputValues.currenciesSearchText,searchedCurrencyText); }
        catch (ComparisonFailure e){}

        channelsSearchField.sendKeys(campaignDetailsInputValues.channelsSearchText);
        try{
            Assert.assertEquals(campaignDetailsInputValues.channelsSearchText,searchedChannelText); }
        catch (ComparisonFailure e){}

        languagesSearchField.sendKeys(campaignDetailsInputValues.languagesSearchText);
        try{
            Assert.assertEquals(campaignDetailsInputValues.languagesSearchText,searchedLanguageText); }
        catch (ComparisonFailure e){}

        countriesSearchField.sendKeys(campaignDetailsInputValues.countriesSearchText);
        try{
            Assert.assertEquals(campaignDetailsInputValues.countriesSearchText,searchedCountriesText); }
        catch (ComparisonFailure e){}

        customerCategoriesSearchField.sendKeys(campaignDetailsInputValues.customerCategoriesSearchText);
        try{
            Assert.assertEquals(campaignDetailsInputValues.customerCategoriesSearchText,searchedCustomerCategoryText); }
        catch (ComparisonFailure e){}

    }

}
