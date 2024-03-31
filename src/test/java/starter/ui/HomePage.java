package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class HomePage {

    public static Target searchDestination = Target
            .the("Boton para activar busqueda")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Enter your destina')]"));

    public static Target inputDestino = Target
            .the("Input de Destino")
            .located(By.className("android.widget.EditText"));


}
