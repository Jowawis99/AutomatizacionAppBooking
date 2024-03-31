package starter.tasks;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class MainPageAreaView {
    public static Target topMainPage = Target
            .the("Parte superior de Pagina Principal")
            .located(By.xpath("//android.widget.TextView[contains(@text,'Stays')]"));

    public static Target searchDestinationActive = Target
            .the("Busqueda activada")
            .located(By.className("android.widget.TextView"));

}
