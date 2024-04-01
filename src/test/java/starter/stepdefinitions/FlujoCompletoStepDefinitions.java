package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import starter.questions.BackHomeQuestions;
import starter.questions.MainPageQuestions;
import starter.questions.SearchPageQuestions;
import starter.questions.SelectRoomQuestions;
import starter.tasks.NavigateTo;
import starter.ui.HomePage;
import starter.ui.SearchHome;

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

    @And("Ingresa los datos de busqueda para la reserva")
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

        theActorCalled("Johao").attemptsTo(
                Click.on(HomePage.inputDestino),
                SendKeys.of("Cusco").into(HomePage.inputDestino),
                WaitUntil.the(HomePage.slcCity, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.slcCity),
                WaitUntil.the(HomePage.starDate, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.starDate),
                WaitUntil.the(HomePage.endDate, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.endDate),
                WaitUntil.the(HomePage.btnSelectDates, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.btnSelectDates)
        );

        String expectedBackHome = "1 room · 2 adults · 0 children";

        theActorInTheSpotlight().should(
                seeThat("Texto al regresar a página principal", BackHomeQuestions.value(),
                        equalTo(expectedBackHome))
        );


        theActorCalled("Johao").attemptsTo(
                Click.on(HomePage.selectRoom)
        );

        String expectedPanelRoom = "Select rooms and guests";

        theActorInTheSpotlight().should(
                seeThat("Texto en el panel de selección de room", SelectRoomQuestions.value(),
                        equalTo(expectedPanelRoom))
        );

        theActorCalled("Johao").attemptsTo(
                Click.on(HomePage.selectChildren),
                WaitUntil.the(HomePage.panelChildrenSelect, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.selectchildren),
                WaitUntil.the(HomePage.btnCOnfirmChildren, isEnabled()).forNoMoreThan(2).seconds(),
                Click.on(HomePage.btnCOnfirmChildren),
                WaitUntil.the(HomePage.btnConfirmarRoom, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.btnConfirmarRoom),
                WaitUntil.the(HomePage.btnBuscarHabitaciones, isEnabled()).forNoMoreThan(4).seconds(),
                Click.on(HomePage.btnBuscarHabitaciones)
                );

    }

    @Then("Visualiza los resultados de la busqueda")
    public void visualiza_resultados_busqueda(){
        theActorCalled("Johao").attemptsTo(
                WaitUntil.the(SearchHome.resultadosBusqueda, isEnabled()).forNoMoreThan(4).seconds()
        );
    }
}
