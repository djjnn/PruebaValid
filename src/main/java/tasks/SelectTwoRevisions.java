package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import userinterfaces.ViewHistory;

public class SelectTwoRevisions implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ViewHistory.RadioOne),
                Click.on(ViewHistory.RadioTwo),
                Click.on(ViewHistory.ButtonCompare)
        );

    }

    public static SelectTwoRevisions select(){
        return Tasks.instrumented(SelectTwoRevisions.class);
    }
}


