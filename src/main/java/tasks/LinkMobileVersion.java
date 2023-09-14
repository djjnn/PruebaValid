package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MainPage;

/** Clase tarea accede al link "Version para moviles"
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class LinkMobileVersion implements Task {

    /** Metodo click al "Version para moviles"
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.versionMobile).andAlignToTop(),
                Click.on(MainPage.versionMobile)
        );

    }

    /** Metodo "enter" accion click "Version para moviles"
     *
     * @return LinkMobileVersion
     */
    public static LinkMobileVersion enter() {
        return Tasks.instrumented(LinkMobileVersion.class);
    }
}


