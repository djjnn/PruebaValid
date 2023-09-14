package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CreateAccount;
import userinterfaces.MainPage;

/** Clase tarea accede al link "Crear una cuenta"
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */

public class LinkCreateUser implements Task {

    /** Metodo click al link "Crear una cuenta"
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.createAccountLink).andAlignToTop(),
                Click.on(MainPage.createAccountLink)
        );

    }

    /** Metodo "enter" accion click link "Crear una cuenta"
     *
     * @return LinkCreateUser
     */
    public static LinkCreateUser enter(){
        return Tasks.instrumented(LinkCreateUser.class);
    }
}


