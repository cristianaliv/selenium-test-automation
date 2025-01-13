import org.automation.framework.BrowserManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DemoTest {

    BrowserManager manager = new BrowserManager();
    //pt rularea testelor folosim abnotarea test

    @Test

    public void browserTest() {
        manager.openBrowser();

        WebDriver driver = manager.getDriver();
        driver.get("https://www.youtube.com");

        //get current url sa returneze adresa si sa se salveze
        //se foloseste asert, functioneaza ca un if, ofera capabilitatea pentru a valida lucrurile
        //in cazul in care nu merge da eroare
        //se poate compara o anumita informatie


        String url = driver.getCurrentUrl();
        //assert treu verifica daac o conditie este adevarata din punct de vedere boolean, true or false
        assertTrue(url.contains("youtube"));//verifica daca url din browser contine cuvantul youtube
        //assertTrue(url.contains("google"));
    }


}

//