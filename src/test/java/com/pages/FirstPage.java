package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FirstPage extends BaseClass {

	public FirstPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Facebook helps you connect and share with the people in your life.']")
	private WebElement facbook;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailInput;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[@value='1']")
	private WebElement clickBtn;

	public WebElement getFacbook() {
		return facbook;
	}

	public WebElement getEmailInput() {
		return emailInput;
	}

	public WebElement getPasswordInput() {
		return passwordInput;
	}

	public WebElement getClickBtn() {
		return clickBtn;
	}

	public void setFacbook(WebElement facbook) {
		this.facbook = facbook;
	}

	public void setEmailInput(WebElement emailInput) {
		this.emailInput = emailInput;
	}

	public void setPasswordInput(WebElement passwordInput) {
		this.passwordInput = passwordInput;
	}

	public void setClickBtn(WebElement clickBtn) {
		this.clickBtn = clickBtn;
	}

	public void firstMessageMethod() {

		String textMessage = getTextMessage(facbook);
		System.out.println("Printing Message ***********************************************************************");
		printMessage(textMessage);
		System.out.println("Printing Message ***********************************************************************");
	}

	public void loginInputs(String Name, String Password) {
		inpuKeys(emailInput, Name);
		inpuKeys(passwordInput, Password);

	}

	public void loginClick() {
		click(clickBtn);

	}
}
