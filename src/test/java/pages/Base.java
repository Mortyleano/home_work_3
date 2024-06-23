package pages;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class Base {

    @BeforeAll
    public static void settingsTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.pageLoadStrategy = "eager";
    }
}