package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.MainPage;

/** Clase tarea buscar palabra Wikipedia
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class Search implements Task {

    private final String Text;

    /** Metodo constructor "Search"
     *
     * @param text
     */
    public Search(String text){
        this.Text=text;
    }

    /** Metodo ingresar palabra a buscar Wikipedia
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.inputSearch).andAlignToTop(),
                Enter.theValue(Text).into(MainPage.inputSearch),
                Click.on(MainPage.buttonSearch)
        );

    }

    /** Metodo "ofText" Buscar palabra Wikipedia
     *
     * @param text
     * @return Search
     */
    public static Search ofText(String text){
        return Tasks.instrumented(Search.class, text);
    }
}

