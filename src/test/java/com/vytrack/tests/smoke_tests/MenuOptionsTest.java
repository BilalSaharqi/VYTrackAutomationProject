package com.vytrack.tests.smoke_tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MenuOptionsTest {

    WebDriver driver;
    // Telling the driver will be The WenDriver





    @BeforeMethod
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        // Let the WebDriver know the chrome driver locator
        driver = new ChromeDriver();
        // New Object as ChromeDriver
        driver.manage().window().fullscreen();
        // Set the window as fullscreen
        driver.get("http://qa2.vytrack.com/user/login");
        // driver go to the url to this page--> http://qa2.vytrack.com/user/login
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test
    public void test1()throws Exception{
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("user187");
        // when the driver go to page find the element and put the username as a User
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("UserUser123"+ Keys.ENTER);
        // When the driver go to the page select the Password as a element and input the password also press the Enter to login
        driver.findElement(By.xpath("//div/ul/li/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")).click();
        String ActualVehicleTitleResult = driver.getTitle();
        String ExpectedVehicleTitleResult = "Car - Entities - System - Car - Entities - System";
        Assert.assertEquals(ActualVehicleTitleResult,ExpectedVehicleTitleResult);
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Accounts')]")).click();
        String ActualAccountTitleResult = driver.getTitle();
        String ExpectedAccountTitleResult = "Accounts - Customers";
        Assert.assertEquals(ActualAccountTitleResult,ExpectedAccountTitleResult);
        String ActualAccountPageName = driver.findElement(By.xpath("//h1[@class='oro-subtitle']")).getText();
        String ExpectedAccountPageName = "Accounts";
        Assert.assertEquals(ActualAccountPageName,ExpectedAccountPageName);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[4]/a/span")).click();
        String ActualContactTitleResult = driver.getTitle();
        String ExpectedContactTitleResult = "Contacts - Customers";
        Assert.assertEquals(ActualContactTitleResult,ExpectedContactTitleResult);
        String ActualContactPageName = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[1]/div/h1")).getText();
        String ExpectedContactPageName = "Contacts";
        Assert.assertEquals(ActualContactPageName,ExpectedContactPageName);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")).click();
        String ActualCalendarTitleResult = driver.getTitle();
        String ExpectedCalendarTitleResult = "Calendar Events - Activities";
        Assert.assertEquals(ActualCalendarTitleResult,ExpectedCalendarTitleResult);
        String ActualCalendarPageName = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[1]/div/h1")).getText();
        String ExpectedCalendarPageName = "Calendar Events";
        Assert.assertEquals(ActualCalendarPageName,ExpectedCalendarPageName);
    }


    @Test
    public void test2()throws Exception{
        driver.findElement(By.xpath("//*[@id=\"prependedInput\"]")).sendKeys("storemanager222");
        driver.findElement(By.xpath("//*[@id=\"prependedInput2\"]")).sendKeys("UserUser123"+Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")).click();
        String ActualDashboardTitle = driver.getTitle();
        String ExpectedDashboardTitle  = "Dashboard - Dashboards";
        Assert.assertEquals(ActualDashboardTitle,ExpectedDashboardTitle);
        String ActualDashboardPageName = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div/h1")).getText();
        String ExpectedDashboardPageName = "Dashboard";
        Assert.assertEquals(ActualDashboardPageName,ExpectedDashboardPageName);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")).click();
        String ActualVehicleTitle = driver.getTitle();
        String ExpectedVehicleTitle = "All - Car - Entities - System - Car - Entities - System";
        Assert.assertEquals(ActualVehicleTitle,ExpectedVehicleTitle);
        String ActualAllCarsPageName = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[1]/div/div/div/div[1]/div/h1")).getText();
        String ExpectedAllCarsPageName = "All Cars";
        Assert.assertEquals(ActualAllCarsPageName,ExpectedAllCarsPageName);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[3]/a/span")).click();
        String ActualAccountTitle = driver.getTitle();
        String ExpectedAccountTitle = "All - Accounts - Customers";
        Assert.assertEquals(ActualAccountTitle,ExpectedAccountTitle);
        String ActualAccountPageName = driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/div/div[1]/div/div/div/div[1]/div/h1")).getText();
        String ExpectedAccountPageName= "All Accounts";
        Assert.assertEquals(ActualAccountPageName,ExpectedAccountPageName);

        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/div/div/ul/li[4]/a/span")).click();
        String ActualContactTitle = driver.getTitle();
        String ExpectedContactTitle = "All - Contacts - Customers";
        Assert.assertEquals(ActualContactTitle,ExpectedContactTitle);
        String ActuralContactPageName = driver.findElement(By.xpath("h1[class=\"oro-subtitle\"]")).getText() ;
        String ExpectedContactPageName = "All Contacts";










    }


    @AfterMethod
    public void close(){
        driver.quit();
    }


}
