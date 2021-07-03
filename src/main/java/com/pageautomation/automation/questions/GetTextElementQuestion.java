package com.pageautomation.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class GetTextElementQuestion implements Question<String> {
    private Target target;

    public GetTextElementQuestion(Target target){
        this.target = target;
    }

    @Override
    public String answeredBy(Actor actor) {
        return target.resolveFor(actor).getText().trim();
    }

    public static GetTextElementQuestion in (Target target){
        return new GetTextElementQuestion(target);
    }
}
