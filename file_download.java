package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class file_download {

    @Test
    public void WebDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        //2. get an url
        String url = "https://www.contextures.com/xlSampleData01.html";
        driver.get(url);


        driver.findElement(By.linkText("Excel sample data workbook")).click();
        System.out.println("file downloaded!");

        driver.close();

    }
}
