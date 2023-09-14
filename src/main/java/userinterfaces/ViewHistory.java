package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

/**
 * Clase interfaces pagina Ver historial
 *
 *  @author Daniel Rojas
 *  @version 1.0
 *
 */
public class ViewHistory extends PageObject {

    public static final Target RadioOne = Target.the("Radio one revision").located(By.id("mw-oldid-112968885"));
    public static final Target RadioTwo = Target.the("Radio two revision").located(By.id("mw-diff-123425818"));
    public static final Target ButtonCompare = Target.the("Button Compare revision").located(By.className("historysubmit"));
    public static final Target ReviewOne = Target.the("Text Review one").located(By.className("diff-side-deleted"));
    public static final Target ReviewTwo = Target.the("Text Review two").located(By.className("diff-side-added"));

}

