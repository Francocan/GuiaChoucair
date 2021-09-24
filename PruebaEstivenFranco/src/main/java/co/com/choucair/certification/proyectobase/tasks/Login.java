package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.Ingreso;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Login implements Task {
    private List<Ingreso> data;
    public Login(List<Ingreso> data) {
        this.data = data;
    }
    public static Login onThePage(List<Ingreso> data) {
        return Tasks.instrumented(Login.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Click.on(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(data.get(0).getNombre()).into(ChoucairLoginPage.INPUT_USER),
                Click.on(ChoucairLoginPage.INPUT_PASSWORD),
                Enter.theValue(data.get(0).getContrasena()).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)

                );
    }
}
