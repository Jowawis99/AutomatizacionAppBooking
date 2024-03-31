package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import starter.ui.HomePage;
import starter.ui.PreStaysPage;

public class NavigateTo implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PreStaysPage.noLogin)
        );
    }
}
