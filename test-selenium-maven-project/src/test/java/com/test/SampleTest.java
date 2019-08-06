package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest {

    String baseURL = "https://www.google.com";


    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/ggand5/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);
        try {
            // thread to sleep for 1000 milliseconds
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void demoTest() {

    }

    @BeforeClass
    public void tearDown() {

    }

}
