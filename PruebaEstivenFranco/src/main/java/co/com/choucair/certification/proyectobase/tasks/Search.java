package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.Ingreso;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import java.util.List;

public class Search implements Task {
    private List<Ingreso> data;

    public Search(List<Ingreso> data) {
        this.data = data;
    }

    public static Search thecourse(List<Ingreso> data) {
        return Tasks.instrumented(Search.class,data);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SearchCoursePage.BUTTON_UC),
                Click.on(SearchCoursePage.BUTTON_UC),
                Click.on(SearchCoursePage.INPUT_COURSE),
                Enter.theValue(data.get(0).getCurso()).into(SearchCoursePage.INPUT_COURSE),
                Click.on(SearchCoursePage.BUTTON_GO),
                Click.on(SearchCoursePage.SELECT_BUTTON)
                );
    }
}
