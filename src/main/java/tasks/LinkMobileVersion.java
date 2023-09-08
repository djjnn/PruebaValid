package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MainPage;

public class LinkMobileVersion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(MainPage.versionMobile).andAlignToTop(),
                Click.on(MainPage.versionMobile)
        );

    }

    public static LinkMobileVersion enter(){
        return Tasks.instrumented(LinkMobileVersion.class);
    }
}


