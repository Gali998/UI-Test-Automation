package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final By USERNAME = By.id("user-name");

    private static final By PASSWORD = By.id("password");

    private static final By LOGIN_BTN = By.id("login-button");

    public void enterCredentials(String username,String password){
        typeText(USERNAME,username);
        typeText(PASSWORD,password);
    }

    public void clickLogin(){
        clickElement(LOGIN_BTN);
    }

}
