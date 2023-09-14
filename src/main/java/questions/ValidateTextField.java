package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

/** Clase pregunta validar y obtener texto
 *
 * @author Daniel Rojas
 * @version 1.0
 *
 */
public class ValidateTextField implements Question<String> {

    private Target target;

    /** Metodo constructor "ValidateTextField"
     *
     * @param target
     */
    public ValidateTextField(Target target) {
        this.target = target;
    }

    /** Metodo ejecucion accion "getText"
     *
     * @param actor
     */
    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText();
    }

    /** Metodo "getText" obtiene el texto del elemento
     *
     * @param target
     * @return ValidateTextField
     */
    public static ValidateTextField getText(Target target){
        return new ValidateTextField(target);
    }

}
