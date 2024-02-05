package odevler;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class odev1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. https://www.testotomasyonu.com/ sayfasina gidin
            driver.get("https://www.testotomasyonu.com/");

        //2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //3. Sayfayi simge durumuna getirin

        driver.manage().window().setPosition(new Point(600,500));
        driver.manage().window().setSize(new Dimension(500,500));

        //4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin

        driver.manage().window().maximize();
        System.out.println("Maximize gorunum size : "+ driver.manage().window().getSize());
        System.out.println("Maximize gorunum position : "+ driver.manage().window().getPosition());

        //6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin

        System.out.println("Fullscreen gorunum size : "+ driver.manage().window().getSize());
        System.out.println("Fullscreen gorunum position : "+ driver.manage().window().getPosition());

        //8. Sayfayi kapatin
        Thread.sleep(3000);
        driver.quit();
    }
}
