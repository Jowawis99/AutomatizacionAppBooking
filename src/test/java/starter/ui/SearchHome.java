package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class SearchHome {

    public static Target resultadosBusqueda = Target
            .the("Resultados de la busqueda")
            .located(By.xpath("//android.widget.TextView[contains(@text,\"properties\")]"));
}
