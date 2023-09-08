package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValidatePopUpCaptcha implements Question<String> {

    private Target target;

    public ValidatePopUpCaptcha(Target target) {
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getAttribute("validationMessage");
    }

    public static ValidatePopUpCaptcha isVisible(Target target){
        return new ValidatePopUpCaptcha(target);
    }

}
