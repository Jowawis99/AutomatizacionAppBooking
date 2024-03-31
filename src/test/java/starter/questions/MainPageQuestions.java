package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import starter.tasks.MainPageAreaView;

public class MainPageQuestions implements Question {

    public static  Question<String> value(){
        return new MainPageQuestions();
    }

    @Override
    public String answeredBy(Actor actor) {
        return MainPageAreaView.topMainPage.resolveFor(actor).getText();
    }


}
