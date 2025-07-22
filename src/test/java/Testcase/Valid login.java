@Test
public void loginWithCorrectCredentials() {
    driver.findElement(By.linkText("Signup / Login")).click();
    driver.findElement(By.name("email")).sendKeys("registred@gmail.com");
    driver.findElement(By.name("password")).sendKeys("Regist1234");
    driver.findElement(By.xpath("//button[text()='Login']")).click();
    Assert.assertTrue(driver.getPageSource().contains("Logged in as"));
}
