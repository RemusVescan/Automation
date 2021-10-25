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


    @FindBy(id = "billing:firstname")
    private WebElement firstName;

    public WebElement getFirstName() {
        return firstName;
    }


    @FindBy(id = "billing:lastname")
    private WebElement lastName;

    public WebElement getLastName() {
        return lastName;
    }


    @FindBy(id = "billing:email")
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


    @FindBy(id = "pass")
    private WebElement passField;

    public WebElement getPassField() {
        return passField;
    }


    @FindBy(id = "send2")
    private WebElement loginButton;

    public WebElement getLoginButton() {
        return loginButton;
    }


    @FindBy(xpath = "//p[@class='welcome-msg' and text()='Welcome, Remus Vescan!']")
    private WebElement messageWelcome;

    public WebElement getMessageWelcome() {
        return messageWelcome;
    }


    @FindBy(xpath = "//a[text()='Men']")
    private WebElement menLink;

    public WebElement getMenLink() {
        return menLink;
    }


    @FindBy(id = "product-collection-image-1122")
    private WebElement basicIndoor;

    public WebElement getBasicIndoor() {
        return basicIndoor;
    }


    @FindBy(css = "div.add-to-cart-buttons")
    private WebElement addToCart;

    public WebElement getAddToCart() {
        return addToCart;
    }


    @FindBy(xpath = "//ul[@class='checkout-types bottom']")
    private WebElement proceedToCheckout;

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }


    @FindBy(id = "billing:street1")
    private WebElement address;

    public WebElement getAddress() {
        return address;
    }


    @FindBy(id = "billing:city")
    private WebElement city;

    public WebElement getCity() {
        return city;
    }


    @FindBy(id = "billing:region_id")
    private WebElement stateID;

    public WebElement getStateID() {
        return stateID;
    }


    @FindBy(id = "billing:postcode")
    private WebElement zipCode;

    public WebElement getZipCode() {
        return zipCode;
    }


    @FindBy(id = "billing:country_id")
    private WebElement country;

    public WebElement getCountry() {
        return country;
    }


    @FindBy(id = "billing:telephone")
    private WebElement telephone;

    public WebElement getTelephone() {
        return telephone;
    }


    @FindBy(css = "button[title='Continue']")
    private WebElement continueButton;

    public WebElement getContinueButton() {
        return continueButton;
    }


    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElement freeShipping;

    public WebElement getFreeShipping() {
        return freeShipping;
    }


    @FindBy(xpath = "//button[@onclick='shippingMethod.save()']")
    private WebElement continueButt;

    public WebElement getContinueButt() {
        return continueButt;
    }


    @FindBy(xpath = "//button[@onclick='payment.save()']")
    private WebElement nextButton;

    public WebElement getNextButton() {
        return nextButton;
    }


    @FindBy(xpath = "//button[@onclick='review.save();']")
    private WebElement placeOrder;

    public WebElement getPlaceOrder() {
        return placeOrder;
    }


    @FindBy(css = "button[onclick='shippingMethod.save()'")
    private WebElement continueCheckout;

    public WebElement getContinueCheckout() {
        return continueCheckout;
    }


    @FindBy(id = "product-collection-image-410")
    private WebElement chelseaTee;

    public WebElement getChelseaTee() {
        return chelseaTee;
    }


    @FindBy(id = "option20")
    private WebElement BlackColor;

    public WebElement getBlackColor() {
        return BlackColor;
    }


    @FindBy(id = "option81")
    private WebElement size;

    public WebElement getSize() {
        return size;
    }


    @FindBy(xpath = "//a[text()='Accessories']")
    private WebElement accessories;

    public WebElement getAccessories() {
        return accessories;
    }


    @FindBy(xpath = "//a[text()='Lord of the Rings ']")
    private WebElement lordOFTheRings;

    public WebElement getLordOFTheRings() {
        return lordOFTheRings;
    }


    @FindBy(xpath = "//input[@class='input-text qty']")
    private WebElement quantity;

    public WebElement getQuantity() {
        return quantity;
    }


    @FindBy(xpath = "//a[text()='Home & Decor']")
    private WebElement homeAndDecor;

    public WebElement getHomeAndDecor() {
        return homeAndDecor;
    }


    @FindBy(id = "product-collection-image-993")
    private WebElement homeParfume;

    public WebElement getHomeParfume() {
        return homeParfume;
    }


    @FindBy(id = "onepage-guest-register-button")
    private WebElement continueAsAGuest;

    public WebElement getContinueAsAGuest() {
        return continueAsAGuest;
    }


    @FindBy(xpath = "//li[@class='level0 nav-5 parent']")
    private WebElement sale;

    public WebElement getSale() {
        return sale;
    }


    @FindBy(id = "product-collection-image-923")
    private WebElement kitchenPasta;

    public WebElement getKitchenPasta() {
        return kitchenPasta;
    }


    @FindBy(xpath = "//li[@class='level0 nav-6']")
    private WebElement books;

    public WebElement getBooks() {
        return books;
    }


    @FindBy(id = "product-collection-image-973")
    private WebElement selectBook;

    public WebElement getSelectBook() {
        return selectBook;
    }


    @FindBy(xpath = "//a[text()='Cosplay Outfit']")
    private WebElement Cosplay;

    public WebElement getCosplay() {
        return Cosplay;
    }


    @FindBy(id = "product-collection-image-981")
    private WebElement redDress;

    public WebElement getRedDress() {
        return redDress;
    }


    @FindBy(xpath = "//a[text()='Little Ones']")
    private WebElement littleOne;

    public WebElement getLittleOne() {
        return littleOne;
    }


    @FindBy(id = "product-collection-image-1103")
    private WebElement flowerPower;

    public WebElement getFlowerPower() {
        return flowerPower;
    }


    @FindBy(xpath = "//a[text()='VIP']")
    private WebElement VIP;

    public WebElement getVIP() {
        return VIP;
    }


    @FindBy(id = "product-collection-image-1132")
    private WebElement IphonePro;

    public WebElement getIphonePro() {
        return IphonePro;
    }

    @FindBy(xpath = "//a[text()='SPORT']")
    private WebElement Sport;

    public WebElement getSport() {
        return Sport;
    }


    @FindBy(id = "product-collection-image-427")
    private WebElement Jean;

    public WebElement getJean() {
        return Jean;
    }


    @FindBy(id = "swatch27")
    private WebElement Color;

    public WebElement getColor() {
        return Color;
    }


    @FindBy(id = "option69")
    private WebElement SizeForJean;

    public WebElement getSizeForJean() {
        return SizeForJean;
    }



    @FindBy(id = "firstname")
    private WebElement firstNameRegister;

    public WebElement getFirstNameRegister() {
        return firstNameRegister;
    }



    @FindBy(id = "lastname")
    private WebElement lastNameRegister;
    public WebElement getLastNameRegister() {
        return lastNameRegister;
    }


    @FindBy(id = "email_address")
    public WebElement emailAddressRegister;

    public WebElement getEmailAddressRegister() {
        return emailAddressRegister;
    }



    @FindBy(id = "swatch80")
    public WebElement sizeChelsea;
    public WebElement getSizeChelsea() {
        return sizeChelsea;
    }


    @FindBy(xpath = "//a[text()='Test category']")
    public  WebElement testCategory;
    public WebElement getTestCategory() {
        return testCategory;
    }



    @FindBy(id = "product-collection-image-1027")
    public WebElement snowDrop;
    public WebElement getSnowDrop() {
        return snowDrop;
    }



    @FindBy(xpath = "//a[text()='plante']")
    public WebElement plantLink;
    public WebElement getPlantLink() {
        return plantLink;
    }



    @FindBy(id = "product-collection-image-1044")
    public WebElement rose;
    public WebElement getRose() {
        return rose;
    }


}
