package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import userinterfaces.ViewHistory;

/** Clase tarea Seleccionar dos revisiones Wikipedia
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class SelectTwoRevisions implements Task {

    /** Metodo Seleccionar dos revisiones y comparar Wikipedia
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ViewHistory.RadioOne),
                Click.on(ViewHistory.RadioTwo),
                Click.on(ViewHistory.ButtonCompare)
        );

    }

    /** Metodo "select" seleccionar dos revisiones y comparar Wikipedia
     *
     * @return SelectTwoRevisions
     */
    public static SelectTwoRevisions select(){
        return Tasks.instrumented(SelectTwoRevisions.class);
    }
}


