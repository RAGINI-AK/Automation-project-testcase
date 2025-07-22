@Test
public void registerUser() {
    driver.findElement(By.linkText("Signup / Login")).click();
    driver.findElement(By.name("name")).sendKeys("TestUser");
    driver.findElement(By.name("email")).sendKeys("testuser@example.com");
    driver.findElement(By.xpath("//button[text()='Signup']")).click();
    // Add more form details & assertions
}
