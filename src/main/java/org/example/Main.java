package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.setProperty("web driver.chrome.driver", "D:\\New Selinum Projects\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        WebElement Signup  =driver.findElement(By.id("signin2"));
        Signup.click();

        WebElement user_name  =driver.findElement(By.id("sign-username\""));
        user_name.sendKeys("Pirashanthy");


        WebElement password  =driver.findElement(By.id(" sign-password"));
        password.sendKeys("Shanthy@1997");

        WebElement Signup_button  =driver.findElement(By.className("btn btn-primary\n"));
        Signup_button.click();


        WebElement login  =driver.findElement(By.id(" login2"));
        login.click();

        WebElement enter_usename = driver.findElement(By.id("loginusername"));
        enter_usename.sendKeys("Pirashanthy");

        WebElement enter_password = driver.findElement(By.id("loginpassword"));
        enter_password.sendKeys("Shanthy@1997");

        Alert alert = driver.switchTo().alert();
        alert.accept();


        WebElement login_button = driver.findElement(By.className("btn btn-primary"));
        login_button.click();

        WebElement laptop = driver.findElement(By.id("itemc"));
        laptop.click();

        WebElement CLick_Laptop = driver.findElement(By.className("list-group-item"));
        CLick_Laptop.click();


        WebElement Click_oneProduct = driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
        Click_oneProduct.click();


        WebElement click_addTocart = driver.findElement(By.className("btn btn-success btn-lg"));
        click_addTocart.click();

        alert.accept();

        WebElement click_cart =  driver.findElement(By.id("cartur"));
        click_cart.click();

        WebElement click_placeOrder = driver.findElement(By.className("btn btn-success"));
        click_placeOrder.click();

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Pirashanthy");


        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Pirashanthy");

        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Srilanka");

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Colombo");

        WebElement card = driver.findElement(By.id("card"));
        card.sendKeys("Peoples");

        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("June");

        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("2024");

        WebElement purchase = driver.findElement(By.className("btn btn-primary"));
        purchase.click();

        alert.accept();































    }
}