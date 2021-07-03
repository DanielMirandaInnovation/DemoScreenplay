package com.pageautomation.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static String URL = "https://the-internet.herokuapp.com/login";
    public static final Target USERNAME_INPUT = Target.the("").located(By.id("username"));
    public static final Target PASSWORD_INPUT = Target.the("").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("").locatedBy("//button");
    public static final Target SECURE_AREA_VALIDATION = Target.the("").locatedBy("//h2[text()]");
}
