package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {

            private static WebDriver driver;
            @BeforeTest
            public void openBrowser() throws InterruptedException{
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                Thread.sleep(2000);
                driver.get("https://chandan252004.github.io/Experiment_2/");


            }
            @Test
            public void titleValidationTest(){
                String actualTitle = driver.getTitle();
                System.out.println("Page Title:"+ actualTitle);
                String expectedTitle ="Webpage Design";
                Assert.assertEquals(actualTitle, expectedTitle, "Page title doesnt match");
                Assert.assertTrue(actualTitle.contains("Design"), "Title Should contain 'Design'");

            }
            @AfterTest
            public void closeBroswer() throws InterruptedException{
                Thread.sleep(2000);
                driver.quit();

            }
}
