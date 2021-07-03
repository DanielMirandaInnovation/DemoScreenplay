package com.pageautomation.automation.tasks;

import com.pageautomation.automation.questions.GetTextElementQuestion;
import com.pageautomation.automation.ui.LoginPage;
import com.pageautomation.automation.utils.SpecialMethods;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class SecureAreaValidations implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.should(
                seeThat(GetTextElementQuestion.in(LoginPage.SECURE_AREA_VALIDATION),equalToIgnoringCase(SpecialMethods.properties.getProperty("confidentialValidation")))
        );
    }

    public static SecureAreaValidations validations(){
        return instrumented(SecureAreaValidations.class);
    }
}
