@Test
public void contactUsForm() {
    driver.findElement(By.linkText("Contact us")).click();
    driver.findElement(By.name("name")).sendKeys("User");
    driver.findElement(By.name("email")).sendKeys("user@example.com");
    driver.findElement(By.name("message")).sendKeys("Testing contact form.");
    driver.findElement(By.name("submit")).click();
    driver.switchTo().alert().accept();
}
