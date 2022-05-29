package com.qa.test;

import com.qa.base.BaseTest;
import com.qa.pages.CartPage;
import com.qa.pages.InventoryPage;
import com.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();

    CartPage cartPage = new CartPage();




    @Test
    public void loginTest(){
        openPage("https://www.saucedemo.com/");
        loginPage.enterCredentials("standard_user","secret_sauce");
        loginPage.clickLogin();
        Assert.assertTrue(inventoryPage.isInventoryVisible(),"Inventory page not loaded");
        inventoryPage.clickProduct();
        Assert.assertTrue(inventoryPage.isProductVisible(),"Product item is not loaded");
        inventoryPage.clickAddToCart();
        inventoryPage.clickBackToProducts();
        cartPage.clickCartIcon();
        cartPage.clickCheckout();







    }


}
