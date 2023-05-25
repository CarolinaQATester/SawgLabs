package com.swaglabs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class TestRule {

    private static WebDriver driver;
    private static ExtentHtmlReporter extentHtmlReporter;
    private static ExtentReports extentReports;
    private static ExtentTest extentTest;

    @Before
    public void beforeCenario(Scenario cenario) {
        if (extentReports == null) {
            extentReports = new ExtentReports();
            extentHtmlReporter = new ExtentHtmlReporter("src/report/extentHtmlReporter.html");
            extentReports.attachReporter(extentHtmlReporter);

        }

        extentTest = extentReports.createTest(cenario.getId());

        System.setProperty("webdriver.chrome.driver", "/home/carolinamesquita/Documentos/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void afterCenario(Scenario cenario) {
        if (cenario.isFailed()) {
            extentTest.log(Status.FAIL, "Cenário " + cenario.getName() + " executado com falha ");
            extentReports.flush();
        } else {
            extentTest.log(Status.PASS, "Cenário " + cenario.getName() + " executado com sucesso ");
            extentReports.flush();
        }
        if (driver != null) {
            driver.close();
        }

    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static ExtentTest getExtentTest() {
        return extentTest;
    }
}
