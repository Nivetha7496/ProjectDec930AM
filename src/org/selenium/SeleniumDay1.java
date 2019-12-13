package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDay1 {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sasi\\eclipse-workspace\\Selenium\\lib\\chromedriver.exe");
     WebDriver driver = new InternetExplorerDriver();
    
     driver.get("http:https://www.facebook.com/");     
     
}
	
}

