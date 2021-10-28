package co.com.choucair.certificaction.proyectoreto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChallengerChoucairRegistrer extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__sign-up']//strong[contains(text(),'Join Today')]"));
    public static final Target INPUT_FIRSTNAME = Target.the("where do we write the user")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("where do we write the password")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the password")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("where do we write the password")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("where do we write the password")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("where do we write the password")
            .located(By.id("birthYear"));

}
