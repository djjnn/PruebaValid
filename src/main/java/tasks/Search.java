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

public class Search implements Task {

    private final String Text;

    public Search(String text){
        this.Text=text;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.inputSearch).andAlignToTop(),
                Enter.theValue(Text).into(MainPage.inputSearch),
                Click.on(MainPage.buttonSearch)
        );

    }

    public static Search ofText(String text){
        return Tasks.instrumented(Search.class, text);
    }
}

