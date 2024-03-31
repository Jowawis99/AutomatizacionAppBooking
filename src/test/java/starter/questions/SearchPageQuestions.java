package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import starter.tasks.MainPageAreaView;

public class SearchPageQuestions implements Question {

    public static  Question<String> value(){
        return new SearchPageQuestions();
    }

    @Override
    public String answeredBy(Actor actor) {
        return MainPageAreaView.searchDestinationActive.resolveFor(actor).getText();
    }
}
