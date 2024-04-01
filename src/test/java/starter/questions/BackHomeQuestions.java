package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import starter.tasks.MainPageAreaView;

public class BackHomeQuestions implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return MainPageAreaView.backHomeRoom.resolveFor(actor).getText();
    }

    public static  Question<String> value(){
        return new BackHomeQuestions();
    }
}
