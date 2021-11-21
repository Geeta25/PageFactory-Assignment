package testClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageClasses.*;

import java.util.concurrent.TimeUnit;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutFlowTest() {
        LoginPage loginPage=new LoginPage(driver);
        HomePage homePage=new HomePage(driver);
        CategoriesPage categoriesPage=new CategoriesPage(driver);
        ProductsPage productsPage=new ProductsPage(driver);
        CartPage cartPage=new CartPage(driver);
        CheckoutAddressPage checkoutAddressPage=new CheckoutAddressPage(driver);
        CheckoutDeliveryPage checkoutDeliveryPage=new CheckoutDeliveryPage(driver);
        CheckoutPaymentPage checkoutPaymentPage=new CheckoutPaymentPage(driver);
        OrderConfirmationPage orderConfirmationPage=new OrderConfirmationPage(driver);

        loginPage.loginMethod("geeta.spree2@gmail.com","password2");
        homePage.clickCategoryMethod();
        categoriesPage.selectProductMethod();
        productsPage.addToCartMethod();
        cartPage.clickCheckoutMethod();
        checkoutAddressPage.enterBillingAddress("Sohan","Sharma","Flat no.-506, Ashley greens","near Fred Mayor",
                "Portland","Oregon","24321","United States of America","5016234223");
        checkoutDeliveryPage.selectShippingMethod();
        checkoutPaymentPage.placeOrder();
        orderConfirmationPage.getOrderStatus();
    }
}
