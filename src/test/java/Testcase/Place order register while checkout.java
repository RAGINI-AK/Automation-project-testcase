@Test
public void placeOrderRegisterWhileCheckout() {
    addProductsToCart();
    driver.findElement(By.linkText("Proceed To Checkout")).click();
    driver.findElement(By.linkText("Register / Login")).click();
    registerUser(); // reuse method
    // Continue checkout steps
}

