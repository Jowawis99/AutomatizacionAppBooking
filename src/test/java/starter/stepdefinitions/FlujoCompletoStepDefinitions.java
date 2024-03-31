package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import starter.questions.MainPageQuestions;
import starter.questions.SearchPageQuestions;
import starter.tasks.NavigateTo;
import starter.ui.HomePage;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static org.hamcrest.CoreMatchers.equalTo;

public class FlujoCompletoStepDefinitions {


    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("Johao se encuentra en la opcion Stays")
    public void johao_en_opcion_stays() {
        theActorCalled("Johao").attemptsTo(
                new NavigateTo()
        );

        String expectedTopMainPage = "Stays";

        theActorInTheSpotlight().should(
                seeThat("Texto de parte Superior de pagina Principal", MainPageQuestions.value(),
                        equalTo(expectedTopMainPage))
        );
    }

    @And("Ingresa los datos de busqueda pra la reserva")
    public void ingresa_datos_reserrva(){
        theActorCalled("Johao").attemptsTo(
                WaitUntil.the(HomePage.searchDestination, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.searchDestination)
        );

        String expectedSearchDestino = "Around current location";

        theActorInTheSpotlight().should(
                seeThat("Texto en vista de Busqueda", SearchPageQuestions.value(),
                        equalTo(expectedSearchDestino))
        );

        Click.on(HomePage.inputDestino);
        SendKeys.of("Cusco").into(HomePage.inputDestino);

    }

}
