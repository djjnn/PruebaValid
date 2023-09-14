package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

/** Clase pregunta validar texto PopUp Captcha
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class ValidatePopUpCaptcha implements Question<String> {

    private Target target;

    /** Metodo constructor "ValidatePopUpCaptcha"
     *
     * @param target
     */
    public ValidatePopUpCaptcha(Target target) {
        this.target = target;
    }

    /** Metodo ejecucion accion "getAttibute- ValidationMessage"
     *
     * @param actor
     */
    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getAttribute("validationMessage");
    }

    /** Metodo "isVisible" verifica popUp Captcha si es visible
     *
     * @param target
     * @return ValidatePopUpCaptcha
     */
    public static ValidatePopUpCaptcha isVisible(Target target){
        return new ValidatePopUpCaptcha(target);
    }

}
