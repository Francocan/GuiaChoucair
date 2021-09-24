package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.Ingreso;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

public class OpenUp implements Task {

    private ChoucairWeb choucairWeb;

    public static OpenUp thepage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairWeb));
    }
}
