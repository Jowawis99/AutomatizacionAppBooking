package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import starter.tasks.MainPageAreaView;

public class SelectRoomQuestions implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MainPageAreaView.selectRoom.resolveFor(actor).getText();
    }

    public static  Question<String> value(){
        return new SelectRoomQuestions();
    }
}
