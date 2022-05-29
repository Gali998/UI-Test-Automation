package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    private static final By CART_ICON = By.id("shopping_cart_container");

    private static final By CHECKOUT = By.id("checkout");

    public void clickCartIcon(){
        clickElement(CART_ICON);
    }

    public void clickCheckout(){
        clickElement(CHECKOUT);
    }


}
