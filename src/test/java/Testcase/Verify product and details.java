@Test
public void verifyAllProductsAndDetails() {
    driver.findElement(By.linkText("Products")).click();
    driver.findElement(By.linkText("View Product")).click();
    Assert.assertTrue(driver.getPageSource().contains("Product Details"));
}
