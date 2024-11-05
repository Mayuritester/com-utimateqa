import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

//** 1. Set up Chrome browser.
//2. Open URL.
//3. Print the title of the page.
//4. Print the current URL.
//5. Print the page source.
//6. Click on the ‘Sign In’ link
//7. Print the current URL
//8. Enter the email in the email field.
//9. Enter the password in the password field.
//10. Click on the Login Button.
//11. Navigate to baseUrl.
//12. Navigate forward to the Homepage.
//13. Navigate back to baseUrl.
//14. Refresh the page.
//15. Close the browser.
public class Edge {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/";
        // Launch Chrome Browser
        WebDriver driver = new EdgeDriver();
        //open URL in Browser
        driver.get(baseUrl);
        //print current url
        System.out.println("Base URL IS: "+ baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//5. Print the page source.
        System.out.println("Page Sourse IS: "+ driver.getPageSource());
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
        WebElement loginlink= driver.findElement(By.className("g-recaptcha"));
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


