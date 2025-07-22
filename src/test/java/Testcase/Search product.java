@Test
public void searchProduct() {
    driver.findElement(By.name("search")).sendKeys("Tshirt");
    driver.findElement(By.id("submit_search")).click();
    Assert.assertTrue(driver.getPageSource().contains("Searched Products"));
}
