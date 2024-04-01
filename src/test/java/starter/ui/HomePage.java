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

    public static Target slcCity = Target
            .the("Resultado de busqueda del Destino")
            .located(By.xpath("(//android.widget.TextView[contains(@text,'City in Cusco')])[1]"));

    public static Target starDate= Target
            .the("Inicio de la reserva 14 Abril 2024")
            .located(By.xpath("//android.view.View[@content-desc=\"14 April 2024\"]"));

    public static Target endDate= Target
            .the("Fin de la reserva 14 Abril 2024")
            .located(By.xpath("//android.view.View[@content-desc=\"28 April 2024\"]"));

    public static Target btnSelectDates= Target
            .the("Fin de selección de fechas de reserva")
            .located(By.className("android.widget.Button"));

    public static Target selectRoom= Target
            .the("Selección de habitaciones")
            .located(By.xpath("//android.widget.TextView[contains(@text,'children')]"));

    public static Target selectChildren= Target
            .the("Selección de cantidad de niños")
            .located(By.xpath("(//android.widget.Button[@resource-id=\"com.booking:id/bui_input_stepper_add_button\"])[3]"));

    public static Target panelChildrenSelect= Target
            .the("Panel selección de niños")
            .located(By.xpath("//android.widget.EditText[contains(@text,'Select')]"));

    public static Target selectchildren= Target
            .the("Seleccionando edad del niño")
            .located(By.xpath("//android.widget.Button[@text=\"< 1 year old\"]"));

    public static Target btnCOnfirmChildren= Target
            .the("Confirmando edad niño")
            .located(By.id("android:id/button1"));

    public static Target btnConfirmarRoom= Target
            .the("Confirmando habitaciones y niños")
            .located(By.xpath("//android.widget.Button[contains(@text,'APPLY')]"));

    public static Target btnBuscarHabitaciones= Target
            .the("Botón de Búsqueda de Habitaciones")
            .located(By.id("com.booking:id/facet_search_box_legacy_theme_cta_border_bottom"));

}
