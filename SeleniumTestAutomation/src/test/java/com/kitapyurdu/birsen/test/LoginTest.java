package com.kitapyurdu.birsen.test;
import com.kitapyurdu.birsen.driver.BaseTest;
import com.kitapyurdu.birsen.page.LoginPage;


import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void  loginTest(){
    LoginPage loginPage = new LoginPage();
    loginPage.login();

}

}
