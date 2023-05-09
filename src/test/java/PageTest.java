import Steps.BaseSteps;
import Steps.PageSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTest extends BaseTest {
    private WebDriver webDriver = getWebDriver(); //sólo necesitamos un getwebdriver, por eso lo renombra aquí
    private PageSteps pageSteps = new PageSteps(webDriver);


    @Test
    public void login() {
        pageSteps.navegarPage(); //Abrir página
        pageSteps.userName();
        pageSteps.password();
        pageSteps.submit();

        System.out.println(webDriver.getCurrentUrl());
        String actualUrl = webDriver.getCurrentUrl();
        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(actualUrl, expectedUrl);

        String expectedText = "Congratulations student. You successfully logged in!";
        String actualText = webDriver.findElement(By.tagName("strong")).getText();
        Assert.assertEquals(actualText, expectedText);
    }
}