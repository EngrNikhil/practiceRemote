import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practice01 {

    public static void main(String[] args) {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sangita Jadhav",Keys.ENTER);
    }
}
