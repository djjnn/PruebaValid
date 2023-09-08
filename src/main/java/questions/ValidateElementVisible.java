package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidateElementVisible implements Question<Boolean> {

    private Target target;

    public ValidateElementVisible(Target target) {
        this.target = target;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    public static ValidateElementVisible isVisible(Target target){
        return new ValidateElementVisible(target);
    }

}
