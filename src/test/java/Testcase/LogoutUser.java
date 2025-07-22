@Test
public void logoutUser() {
    loginWithCorrectCredentials(); // reuse login
    driver.findElement(By.linkText("Logout")).click();
    Assert.assertTrue(driver.getCurrentUrl().contains("login"));
}
