package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Select cursos y certificaciones")
            .located(By.xpath("//img[contains(@alt,'Cursos y Certificaciones')]"));
    public static final  Target INPUT_COURSE = Target.the("Search course")
            .located(By.xpath("//input[contains(@size,'30')]"));
    public static final  Target BUTTON_GO = Target.the("Click on teacher")
            .located(By.xpath("//button[@class='btn btn-secondary'][contains(.,'Ir')]"));
    public static final  Target SELECT_BUTTON = Target.the("Back to main")
            .located(By.xpath("(//a[contains(.,'Foundation Level')])[1]"));
    public static final  Target NAME_CURSE = Target.the("Back to main")
            .located(By.xpath("(//a[contains(.,'Foundation Level')])[1]"));
}
