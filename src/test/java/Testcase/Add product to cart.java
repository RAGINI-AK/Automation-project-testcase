@Test
public void addProductsToCart() {
    driver.findElement(By.linkText("Products")).click();
    driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
    driver.findElement(By.linkText("View Cart")).click();
    Assert.assertTrue(driver.getPageSource().contains("Shopping Cart"));
}
