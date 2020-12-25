import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import org.junit.Test;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selectors.byName;

public class Homework {

    @Test
    public void TestCrome() throws InterruptedException{
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        Configuration.startMaximized = true;

        Selenide.open("https://www.hr.ge/");
        Thread.sleep(3000);
        $(byName("q")).setValue("ტესტერი").sendKeys(Keys.ENTER);
        Thread.sleep(3000);

    }




}
