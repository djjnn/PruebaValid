package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CreateAccount;
import userinterfaces.MainPage;

/** Clase tarea completa datos de "Registro de usuario"
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class RegisterUser implements Task {

    private final String username;
    private final String password;
    private final String email;

    /** Metodo constructor "RegisterUser"
     *
     * @param username
     * @param password
     * @param email
     */
    public RegisterUser(String username, String password, String email){

        this.username=username;
        this.password=password;
        this.email=email;
    }

    /** Metodo completar datos de usuario, password y correo en la seccion "Registro de usuario"
     *
     * @param actor
     * @param <T>
     */
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.createAccountLink).andAlignToTop(),
                Enter.theValue(username).into(CreateAccount.username),
                Enter.theValue(password).into(CreateAccount.password),
                Enter.theValue(password).into(CreateAccount.confirmPassword),
                Enter.theValue(email).into(CreateAccount.email),
                Click.on(CreateAccount.createAccountButton)
        );

    }

    /** Metodo "fillfields" completar datos "Registro de usuario"
     * @param username
     * @param password
     * @param email
     * @return RegisterUser
     */
    public static RegisterUser fillFields(String username, String password, String email){
        return Tasks.instrumented(RegisterUser.class, username, password, email);
    }
}


