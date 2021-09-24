package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairLoginPage extends PageObject {
    public static final  Target LOGIN_BUTTON = Target.the("button that show us the for to login")
            .located(By.xpath("//*[@id='nav-menu']/ul[2]/li/a"));
    public static final  Target INPUT_USER = Target.the("where do we write the user")
            .located(By.xpath("//input[contains(@type,'text')]"));
    public static final  Target INPUT_PASSWORD = Target.the("where do we write thw password")
            .located(By.xpath("//input[contains(@type,'password')]"));
    public static final  Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.xpath("//button[@type='submit'][contains(.,'Acceder')]"));

}
