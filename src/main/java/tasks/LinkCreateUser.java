package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CreateAccount;
import userinterfaces.MainPage;

public class LinkCreateUser implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.createAccountLink).andAlignToTop(),
                Click.on(MainPage.createAccountLink)
        );

    }

    public static LinkCreateUser enter(){
        return Tasks.instrumented(LinkCreateUser.class);
    }
}


