package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class MethodBase extends PageBase {
    public static boolean isDisplayed_ById(String locator) {
        return  getDriver().findElement(By.id(locator)).isDisplayed();
    }
    public static boolean isDisplayed_ByXpath(String locator) {
        return  getDriver().findElement(By.xpath(locator)).isDisplayed();
    }
    public static void setText_ByID(String locator,String inputText) {
        getDriver().findElement(By.id(locator)).sendKeys(inputText);

    }
    public static void setText_ByXpath(String locator,String inputText) {
        getDriver().findElement(By.xpath(locator)).sendKeys(inputText);
    }
    public static void clickButton_ById(String locator) {
        getDriver().findElement(By.id(locator)).click();
    }


    public static void clickButton_ByXpath(String locator) {
        getDriver().findElement(By.xpath(locator)).click();
    }


    public static void click_ById(String locator) {

        getDriver().findElement(By.id(locator)).click();
    }
    public static void click_ByXpath(String locator) {

        getDriver().findElement(By.xpath(locator)).click();

    }

    public static void clear_ById(String locator) {

        getDriver().findElement(By.id(locator)).clear();
    }
    public static void clear_ByXpath(String locator) {

        getDriver().findElement(By.xpath(locator)).clear();

    }
    public static void selectDropDown(String locator) {
        Select dropdown = new Select(getDriver().findElement(By.xpath(locator)));
        dropdown.selectByVisibleText("Database Testing");
    }
    public static void selectAction(String locator1 ,String locator2) {
        Actions type = new Actions(getDriver());
        type.moveToElement(getDriver().findElement(By.xpath(locator1))).click().build().perform();
        type.click(getDriver().findElement(By.xpath(locator2))).build().perform();
    }



    public static void assertEqual_Text_ById(String locator, String expectedText) {

        String actualText = getDriver().findElement(By.id(locator)).getText();

        Assert.assertEquals(actualText, expectedText);
    }
    public static void assertEqual_Text_ByXpath(String locator, String expectedText) {
        SoftAssert softAssert = new SoftAssert();
        String actualText = getDriver().findElement(By.xpath(locator)).getText();

        softAssert.assertEquals(actualText, expectedText);
    }
//    public static void assertTrue( boolean condition) {
//        Assert.assertTrue(condition,"condition failed");
//    }
//    public static void assertFalse(boolean condition) {
//
//        Assert.assertFalse(condition,"condition failed");
//    }
}
