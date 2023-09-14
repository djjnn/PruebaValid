package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Clase interfaces pagina Crear cuenta
 *
 *  @author Daniel Rojas
 *  @version 1.0
 *
 */
public class CreateAccount extends PageObject {

    public static final Target username = Target.the("Username").located(By.id("wpName2"));
    public static final Target password = Target.the("password").located(By.id("wpPassword2"));
    public static final Target confirmPassword = Target.the("Confirm password").located(By.id("wpRetype"));
    public static final Target email= Target.the("Content all text of search").located(By.id("wpEmail"));
    public static final Target createAccountButton= Target.the("Create account button").located(By.id("wpCreateaccount"));
    public static final Target popUpCaptcha= Target.the("Captcha").located(By.id("mw-input-captchaWord"));
    
}

