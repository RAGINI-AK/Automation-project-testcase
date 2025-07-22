@Test
public void registerUser() {
    driver.findElement(By.linkText("Signup / Login")).click();
    driver.findElement(By.name("name")).sendKeys("Ragini");
    driver.findElement(By.name("email")).sendKeys("ragini.ak3940@gmail.com");
    driver.findElement(By.xpath("//button[text()='Signup']")).click();
}
