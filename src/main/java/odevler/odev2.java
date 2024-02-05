package odevler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. https://www.testotomasyonu.com/ sayfasina gidin
        driver.get("https://www.testotomasyonu.com/");

        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getSize());
        System.out.println(driver.manage().window().getPosition());

        //3. Sayfanin konumunu pixel olarak (50,50)’ye getirin
        driver.manage().window().setPosition(new Point(50,50));

        //4. Sayfa boyutunu pixel olarak (1000,500)’ye ayarlayin
        driver.manage().window().setSize(new Dimension(1000,500));

        //4. Sayfanin istenen konum ve boyuta geldigini test edin
        System.out.println("50,50 gorunum position :  " +
                "" + driver.manage().window().getPosition());
        System.out.println("Ozel gorunum size : "+ driver.manage().window().getSize());

        //5. Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
