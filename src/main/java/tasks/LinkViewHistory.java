package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MainPage;

/** Clase tarea accede al link "Ver Historial"
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class LinkViewHistory implements Task {

    /** Metodo click al "Ver Historial"
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.viewHistory).andAlignToTop(),
                Click.on(MainPage.viewHistory)
        );

    }
    /** Metodo "enter" accion click "Ver Historial"
     *
     * @return LinkViewHistory
     */
    public static LinkViewHistory enter(){
        return Tasks.instrumented(LinkViewHistory.class);
    }
}


