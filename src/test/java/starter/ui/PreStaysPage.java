package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;

public class PreStaysPage {

    public static Target noLogin = Target
            .the("No Login")
            .located((By.xpath("//*[@content-desc=\"Navigate up\"]")));
}
