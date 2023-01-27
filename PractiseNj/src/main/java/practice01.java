import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class practice01 {

    public static void main(String[] args) {
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--headless");
        ChromeDriver driver =new ChromeDriver(co);
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sangita Jadhav",Keys.ENTER);
    }
}
