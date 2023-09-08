package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class MainPage extends PageObject {

    public static final Target WelcomeWikipediaTitle = Target.the("Welcome wikipedia label").located(By.id("Bienvenidos_a_Wikipedia,"));
    public static final Target inputSearch = Target.the("Input search").located(By.name("search"));
    public static final Target buttonSearch=Target.the("Button search").located(By.className("cdx-search-input__end-button"));
    public static final Target searchHeading = Target.the("Search heading").located(By.className("mw-page-title-main"));
    public static final Target createAccountLink= Target.the("Link for Create Account").located(By.id("pt-createaccount-2"));
    public static final Target versionMobile= Target.the("Link mobile version").located(By.id("footer-places-mobileview"));
    public static final Target versionDesk= Target.the("Link Desk version").located(By.id("mw-mf-display-toggle"));
    public static final Target viewHistory=Target.the("Link view Historial").located(By.id("ca-history"));
}

