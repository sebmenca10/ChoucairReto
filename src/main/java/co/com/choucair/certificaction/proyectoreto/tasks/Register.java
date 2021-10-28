package co.com.choucair.certificaction.proyectoreto.tasks;

import co.com.choucair.certificaction.proyectoreto.userinterface.ChallengerChoucairRegistrer;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Register implements Task{
    private String strFirsname;
    private String strLastname;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;

    public Register(String strFirsname, String strLastname, String strEmail, String strMonth, String strDay, String strYear) {
        this.strFirsname = strFirsname;
        this.strLastname = strLastname;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
    }

    public static Register OnThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class,strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChallengerChoucairRegistrer.REGISTER_BUTTON),
                Enter.theValue(strFirsname).into(ChallengerChoucairRegistrer.INPUT_FIRSTNAME),
                Enter.theValue(strLastname).into(ChallengerChoucairRegistrer.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(ChallengerChoucairRegistrer.INPUT_EMAIL),
                Enter.theValue(strMonth).into(ChallengerChoucairRegistrer.INPUT_MONTH),
                Enter.theValue(strDay).into(ChallengerChoucairRegistrer.INPUT_DAY),
                Enter.theValue(strYear).into(ChallengerChoucairRegistrer.INPUT_YEAR)
        );
    }
}
