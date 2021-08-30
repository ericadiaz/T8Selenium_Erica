import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14 {

    @Test
    public void ingresarNetflix(){
        String urlNetflix = "https://www.netflix.com/ar/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(urlNetflix);

        //Mostrar los elementos h1 y h2

        List<WebElement> listH1 = driver.findElements(By.tagName("h1"));
        List<WebElement> listH2 = driver.findElements(By.tagName("h2"));

        System.out.println("Texto de los elementos h1");
        for(WebElement h1: listH1){
            System.out.println("* "+h1.getText());
        }

        System.out.println("******************************************");
        System.out.println();
        System.out.println("Texto de los elementos h2");
        for (WebElement h2: listH2){
            if(!h2.getText().isEmpty()){
                System.out.println("* "+h2.getText());
            }
        }

        //Refrescar la página

        driver.navigate().refresh();

        System.out.println("******************************************");
        System.out.println();
        //Mostrar el texto de los botones

        List<WebElement> listButton = driver.findElements(By.tagName("button"));
        System.out.println("Texto de los botones");
        for (WebElement button: listButton){
            System.out.println("* "+button.getText());
        }

        System.out.println("******************************************");
        System.out.println();
        //Mostrar la cantidad de elementos div
        List<WebElement> listDiv = driver.findElements(By.tagName("div"));
        System.out.println("Cantidad de elementos div en el sitio: "+listDiv.size());

        System.out.println("******************************************");
        System.out.println();
        //Mostrar el título de la página
        System.out.println("Título de la página: "+driver.getTitle());

        System.out.println("******************************************");
        System.out.println();
        //Mostrar la cantidad de elementos link
        List<WebElement> listLinks = driver.findElements(By.tagName("a"));
        System.out.println("Cantidad de elementos de tipo link: "+listLinks.size());

        driver.quit();
    }
}
