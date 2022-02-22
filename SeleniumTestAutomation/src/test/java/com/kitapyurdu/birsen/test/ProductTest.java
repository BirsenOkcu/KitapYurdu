package com.kitapyurdu.birsen.test;

import com.kitapyurdu.birsen.driver.BaseTest;
import com.kitapyurdu.birsen.page.LoginPage;
import com.kitapyurdu.birsen.page.ProductPage;
import org.junit.Test;


public class ProductTest extends BaseTest {
    @Test
    public void productTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.selectProduct();
    }



}

