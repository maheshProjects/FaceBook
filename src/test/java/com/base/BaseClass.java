package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class BaseClass {

	public static WebDriver driver;
	String[] allWindows;
	String parentWindow;

	static int S = 0;

	public void printMessage(String string) {
		System.out.println(string);

	}

	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void loadUrl() {

		driver.get("https://www.facebook.com/");

	}

	public WebElement findElementById(String string) {
		WebElement findElement = driver.findElement(By.id("string"));
		return findElement;

	}

	public WebElement findElementByXpath(String webElement) {
		WebElement findElement = driver.findElement(By.xpath("string"));
		return findElement;
	}

	public void click(WebElement element) {
		element.click();

	}

	public String getTextMessage(WebElement element) {

		String text = element.getText();
		return text;

	}

	public Set<String> getWindowHandles() {
		Set<String> allWindows = driver.getWindowHandles();
		return allWindows;
	}

	public String getWindowHandle() {
		String parentWindow = driver.getWindowHandle();
		return parentWindow;
	}

	public void windowHandle() {

		for (String eachWindow : allWindows) {

			if (!parentWindow.equalsIgnoreCase(eachWindow)) {
				driver.switchTo().window(eachWindow);
			}

		}

	}

	public void inpuKeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	public void quiteWindow() {
		driver.quit();

	}

	public void screenShot() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);

		File s = new File("C:\\Users\\ABINESH\\OneDrive\\Desktop\\Mahesh P\\BookCart\\target\\Screenshot\\ screenshot"
				+ S + ".png");

		Files.copy(screenshotAs, s);
		S = S + 1;

	}
}
