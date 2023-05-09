package Steps;
import org.openqa.selenium.WebDriver;
public class BaseSteps {
    public WebDriver webDriver;

    //constructor
    public BaseSteps(WebDriver driver){ //implementan el mismo constrcutor. CONSTSRUCTOR DE TODA LA VIDA!! :)
        this.webDriver = driver;
    }
    public WebDriver getWebDriver() {
        return webDriver;
    }
    public boolean cerrarVentana(){
        webDriver.close();
        return true;
    }
}
