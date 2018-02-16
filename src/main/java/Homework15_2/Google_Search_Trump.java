package Homework15_2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_Trump {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/Drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Melania Trump");
        driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).submit();
        Thread.sleep(3000);

        System.out.println(driver.findElement(By.xpath("//*[@id=\"resultStats\"]")).getText());
        driver.quit();
    }
}
//f;sjhgjhg
