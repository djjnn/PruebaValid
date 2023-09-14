package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

/** Clase pregunta validar elemento visible
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class ValidateElementVisible implements Question<Boolean> {

    private Target target;

    /** Metodo constructor "ValidateElementVisible"
     *
     * @param target
     */
    public ValidateElementVisible(Target target) {
        this.target = target;
    }

    /** Metodo ejecucion accion "isVisible"
     *
     * @param actor
     */
    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }

    /** Metodo "isVisible" verifica elemento visible
     *
     * @param target
     * @return ValidateElementVisible
     */
    public static ValidateElementVisible isVisible(Target target){
        return new ValidateElementVisible(target);
    }

}
