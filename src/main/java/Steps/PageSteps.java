package Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;import org.openqa.selenium.WebDriver;


import java.util.List;
public class PageSteps extends BaseSteps{
    public PageSteps(WebDriver driver) {
        super(driver);
    }

    public boolean openPage(){
        webDriver.get("https://practicetestautomation.com/practice-test-login/");
        return true;
    }
    public void navegarPage(){
        webDriver.navigate().to("https://practicetestautomation.com/practice-test-login/");
    }

    public void userName(){
        WebElement userNameBar = webDriver.findElement(
                By.cssSelector("input[id='username']"));
        userNameBar.click();
        userNameBar.sendKeys("student");
    }

    public void  password(){
        WebElement userPassword = webDriver.findElement(
                By.cssSelector("input[id='password']"));
        userPassword.click();
        userPassword.sendKeys("Password123");

    }

    public void submit(){
        WebElement submitLogin = webDriver.findElement(
                By.className("btn"));
        submitLogin.click();
    }



}
