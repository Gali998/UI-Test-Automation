package com.qa.pages;

import com.qa.base.BasePage;
import org.openqa.selenium.By;

public class InventoryPage extends BasePage {

    private static final By INVENTORY = By.id("inventory_container");

    private static final By PRODUCT = By.xpath("//a[@id='item_4_title_link']/div");

    private static final By PRODUCT_VISIBLE = By.id("inventory_item_container");

    private static final By ADD_CART_BTN = By.id("add-to-cart-sauce-labs-backpack");

    private static final By BACK_TO_PRODUCTS = By.id("back-to-products");

    public boolean isInventoryVisible(){
        return isVisible(INVENTORY);
    }

    public void clickProduct(){
        clickElement(PRODUCT);
    }

    public boolean isProductVisible(){
        return isVisible(PRODUCT_VISIBLE);
    }

    public void clickAddToCart(){
        clickElement(ADD_CART_BTN);
    }

    public void clickBackToProducts(){
        clickElement(BACK_TO_PRODUCTS);
    }



}
