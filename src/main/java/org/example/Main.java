//        **********************SELENIUM IFRAMES HANDLING**********************
package org.example;

//Package Imports

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
//      Change web driver according to your browser. Here Chrome browser has been used.
        WebDriver driver = new ChromeDriver();

//      Maximizing window size
        driver.manage().window().maximize();

//      Launching webpage
        driver.get("https://demo.automationtesting.in/Frames.html");

//      Moving to and clicking on "iframe with in an iframe" button
        WebElement iframeWithInAnIframeButton = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        iframeWithInAnIframeButton.click();

//      Switching control to outermost iframe
        WebElement outerIframe = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
        driver.switchTo().frame(outerIframe);

/*      Moving inside nested iframe
        Switching control to inner iframe        */
        WebElement innerIframe = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
        driver.switchTo().frame(innerIframe);

//      Entering value inside the inner iframe input box
        WebElement inputBox = driver.findElement(By.xpath("//input"));
        inputBox.sendKeys("Bhuvan Kohli");

//      Passing control to the main document which contains all the iframes
        driver.switchTo().defaultContent();

//      Moving to and clicking on "singleIframe" button
        WebElement singleIframeButton = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
        singleIframeButton.click();

//      Switching control to "singleFrame" iframe inside the "singleIframe" box
        driver.switchTo().frame("singleframe");

//      Entering name in the iframeDemo frame input box
        WebElement iframeDemoInputBox = driver.findElement(By.xpath("//input"));
        iframeDemoInputBox.sendKeys("Bhuvan");

//      Closing current tab of web driver
        driver.close();

        System.out.println("All values entered successfully!");

    }
}
//        **********************THANK YOU**********************

/*CREDITS:
    Bhuvan Kohli
    bhuvan.kohli@geminisolutions.com
*/