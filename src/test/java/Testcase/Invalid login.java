@Test
public void loginWithIncorrectCredentials() {
    driver.findElement(By.linkText("Signup / Login")).click();
    driver.findElement(By.name("email")).sendKeys("fake@gmail.com");
    driver.findElement(By.name("password")).sendKeys("wrongPassword1234 ");
    driver.findElement(By.xpath("//button[text()='Login']")).click();
    Assert.assertTrue(driver.getPageSource().contains("Your email or password is incorrect!"));
}
