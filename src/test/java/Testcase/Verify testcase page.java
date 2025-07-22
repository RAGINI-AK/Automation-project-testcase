@Test
public void verifyTestCasesPage() {
    driver.findElement(By.linkText("Test Cases")).click();
    Assert.assertTrue(driver.getTitle().contains("Test Cases"));
}
