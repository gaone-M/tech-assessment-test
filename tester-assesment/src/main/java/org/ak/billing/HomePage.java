package org.ak.billing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;

    WebDriverWait wait;
    private Alert discountInputField;


    public HomePage(WebDriver driver){
        this.driver = driver;
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);

        PageFactory.initElements(driver, this);
    }

    public void getPage(WebDriver driver, String url){
        System.out.println("... Loading page " + url + "...");
        driver.get(url);
    }
    public int getHeaderList() {
        System.out.println("... Searching the page header...");
        List header = driver.findElements(By.xpath("//h1[contains(text(), \"The awesome Q/A tool\")]"));
        return header.size();
    }

    public void getDiscount(String question) {
        System.out.println("... customer \"" + question + "\"...");
        discountInputField.sendKeys(question);
    }
}

