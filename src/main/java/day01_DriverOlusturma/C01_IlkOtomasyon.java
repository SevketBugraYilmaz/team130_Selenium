package day01_DriverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {

    public static void main(String[] args) {

        /*
        1- Web otomasyonu yapmak için olusturdugumuz her class'da
         bir WebDriver objesi olusturmak ZORUNDAYIZ

         bu objeyi Java consept'lerini kullanarak
         farkli sekillerde olusturabilir veya inherit edebiliriz
         AMMA Webdriver objesi OLMADAN test otomasyonu OLMAZ

         2- Selenium son versiyonlarında kendi WebDriver'ini olusturdu
         Boylece System.setproperty() kullanmasaniz da
         Selenium kendi WebDriver'i ile otomasyonu gerçekleştirir

         Sirketlerde kendi satin aldiklari WebDriver'i kullanma Olasiliği olcagindan
         biz de bu satiri yazacağız

          3-WebDriver driver = new ChromeDriver();
          satirini yazdigimizda, bir WebDriver objesi oluşturulur
          bu obje sayesinde WebDriver method'lari kullanabiliriz
         */



        System.setProperty("Webdriver.chrome.driver","src/kurulumDosyalari/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.testotomasyonu.com/");




    }
}
