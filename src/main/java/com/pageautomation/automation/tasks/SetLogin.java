package com.pageautomation.automation.tasks;

import com.pageautomation.automation.ui.LoginPage;
import com.pageautomation.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SetLogin implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.attemptsTo(
                Enter.theValue(SpecialMethods.properties.getProperty("username")).into(LoginPage.USERNAME_INPUT),
                Enter.theValue(SpecialMethods.properties.getProperty("password")).into(LoginPage.PASSWORD_INPUT),
                JavaScriptClick.on(LoginPage.LOGIN_BUTTON),
                WaitUntil.the(LoginPage.SECURE_AREA_VALIDATION,isVisible())
        );
    }

    public static SetLogin loginSuccessful (){
        return instrumented(SetLogin.class);
    }

}
