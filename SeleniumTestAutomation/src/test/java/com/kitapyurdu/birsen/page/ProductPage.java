package com.kitapyurdu.birsen.page;

import com.kitapyurdu.birsen.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void selectProduct() {
        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("faceted-search-group-6"));
        methods.waitBySeconds(5);
        methods.scrollWithAction(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart']"));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][5]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][6]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][7]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='product-list']//div[@class='product-cr'][8]//i[@class='fa fa-heart red']")));
        methods.waitBySeconds(1);
        methods.click(By.xpath("//img[@title='kitapla bulu??man??n en kolay yolu!']"));
        methods.waitBySeconds(1);
        methods.click(By.cssSelector(".menu.top.login>ul>li>a"));
        methods.waitBySeconds(5);
        methods.click(By.xpath("//span[text()='Favorilerim']"));
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("img[alt='kitapyurdu.com']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".lvl1catalog"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("img[title='Puan Katalo??undaki T??rk Klasikleri']"));
        methods.waitBySeconds(2);
        methods.selectByText(By.cssSelector("div[class='sort']>select[onchange='location = this.value;']"), "Y??ksek Oylama");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
        methods.clickWithJavascript(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > div > div.open-menu-ct.bookAllCategories > div > ul:nth-child(3) > li:nth-child(14) > a"));
        methods.click(By.cssSelector("#product-422886 > div.image > div > a > img"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".add-to-cart.btn-orange.btn-ripple"));
        methods.scrollWithAction(By.xpath(("//a[@class = 'common-sprite' and contains(text(), 'Listelerim')]")));
        methods.click(By.linkText("Favorilerim"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@class='product-list']//div[@class='product-cr'][3]//i[@class='fa fa-heart-o']"));
        methods.waitBySeconds(3);


        methods.click(By.cssSelector("#cart > div.heading"));
        methods.waitBySeconds(3);
        methods.click(By.id("js-cart"));
        methods.waitBySeconds(2);

        methods.findElement(By.xpath("//input[@name='quantity']")).clear();
        methods.waitBySeconds(1);
        methods.sendKeys(By.xpath("//input[@name='quantity']"), "2");
        methods.waitBySeconds(1);
        methods.click(By.xpath("//i[@title='G??ncelle']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("div[class='right']>a[class='button red']"));
        methods.waitBySeconds(3);

        methods.click(By.cssSelector("#shipping-tabs > a:nth-child(2)"));
        methods.waitBySeconds(2);


        methods.sendKeys(By.id("address-firstname-companyname"), "Birsen");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-lastname-title"), "Ok??u");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-zone-id"), "??stanbul");
        methods.waitBySeconds(1);
        methods.selectByText(By.cssSelector("#address-county-id"), "??????L??");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-address-text"), "Testinium Akasya AVM");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-telephone"), "5340704464");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("address-mobile-telephone"), "5340704464");
        methods.waitBySeconds(1);

        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(4);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(4);
        methods.sendKeys(By.id("credit-card-owner"), "Birsen Ok??u");
        methods.sendKeys(By.id("credit_card_number_1"), "1234");
        methods.sendKeys(By.id("credit_card_number_2"), "5678");
        methods.sendKeys(By.id("credit_card_number_3"), "9101");
        methods.sendKeys(By.id("credit_card_number_4"), "1112");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("credit-card-expire-date-month"), "08");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-expire-date-year"), "2028");
        methods.waitBySeconds(1);
        methods.sendKeys(By.id("credit-card-security-code"), "367");
        methods.waitBySeconds(1);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);



    }


    }



