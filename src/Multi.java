import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Multi {
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        //print current url
        System.out.println("Base URL IS: " + baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//5. Print the page source.
        System.out.println("Page Sourse IS: " + driver.getPageSource());
//6. Click on the ‘Sign In’ link
        WebElement SigninLink = driver.findElement(By.linkText("Sign In"));
        SigninLink.click();
//7. Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

//8. Enter the email in the email field.
        WebElement emailinput = driver.findElement(By.id("user[email]"));
        emailinput.sendKeys("tester@gmail.com");
//9. Enter the password in the password field.
        WebElement passwordinput = driver.findElement(By.id("user[password]"));
        emailinput.sendKeys("tester123");
//10. Click on the Login Button.
        WebElement loginlink = driver.findElement(By.className("g-recaptcha"));
        loginlink.click();
//11. Navigate to baseUrl.
        driver.navigate().back();
//12. Navigate forward to the Homepage.
        driver.navigate().forward();
//13. Navigate back to baseUrl.
        driver.navigate().to(baseUrl);
//14. Refresh the page.
        driver.navigate().refresh();
//15. Close the browser.
        driver.close();
    }


}

