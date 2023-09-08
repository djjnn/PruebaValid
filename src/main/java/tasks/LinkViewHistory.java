package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MainPage;

public class LinkViewHistory implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.viewHistory).andAlignToTop(),
                Click.on(MainPage.viewHistory)
        );

    }

    public static LinkViewHistory enter(){
        return Tasks.instrumented(LinkViewHistory.class);
    }
}


