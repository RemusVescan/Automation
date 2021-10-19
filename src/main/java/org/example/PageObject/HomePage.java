package org.example.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {



    @FindBy(xpath = "//span[text()='Account']")
    private WebElement createAccount;
    public WebElement getCreateAccount() {
        return createAccount;
    }




    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerButton;
    public WebElement getRegisterButton() {
        return registerButton;
    }




    @FindBy(id = "firstname")
    private WebElement firstName;
    public WebElement getFirstName() {
        return firstName;
    }



    @FindBy(id = "lastname")
    private WebElement lastName;
    public WebElement getLastName() {
        return lastName;
    }


    @FindBy(id = "email_address")
    private WebElement emailAddress;
    public WebElement getEmailAddress() {
        return emailAddress;
    }



    @FindBy(id = "password")
    private WebElement password;
    public WebElement getPassword() {
        return password;
    }



    @FindBy(id = "confirmation")
    private WebElement confirmationPassword;
    public WebElement getConfirmationPassword() {
        return confirmationPassword;
    }



    @FindBy(xpath = "//button[@class='button']")
    private WebElement finalRegister;
    public WebElement getFinalRegister() {
        return finalRegister;
    }




    @FindBy(xpath = "//div[@class= 'page-title']")
    private WebElement createAnAccount;
    public WebElement getCreateAnAccount() {
        return createAnAccount;
    }



    @FindBy(xpath = "//a[text()='Log In']")
    private WebElement logInLink;
    public WebElement getLogInLink() {
        return logInLink;
    }




    @FindBy(id = "email")
    private WebElement emailField;
    public WebElement getEmailField() {
        return emailField;
    }




}
