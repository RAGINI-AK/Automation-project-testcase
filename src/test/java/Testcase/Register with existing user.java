@Test
public void registerWithExistingEmail() {
    driver.findElement(By.linkText("Signup / Login")).click();
    driver.findElement(By.name("name")).sendKeys("ExistingUser");
    driver.findElement(By.name("email")).sendKeys("registered@example.com");
    driver.findElement(By.xpath("//button[text()='Signup']")).click();
    Assert.assertTrue(driver.getPageSource().contains("Email Address already exist!"));
}
