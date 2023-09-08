package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CreateAccount;
import userinterfaces.MainPage;

public class RegistreUser implements Task {

    private final String username;
    private final String password;
    private final String email;

    public RegistreUser(String username, String password, String email){

        this.username=username;
        this.password=password;
        this.email=email;
    }

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

    public static RegistreUser fillFields(String username, String password, String email){
        return Tasks.instrumented(RegistreUser.class, username, password, email);
    }
}


