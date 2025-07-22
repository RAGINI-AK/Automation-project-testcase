# Test Cases - Automation Exercise Project

This document contains the list of manual test cases created for testing various functionalities of [AutomationExercise.com](https://automationexercise.com/).

---

## Test Case List

| Test Case ID | Title                          | Steps to Execute                                                                 | Expected Result                                      | Priority | Status |
|--------------|--------------------------------|-----------------------------------------------------------------------------------|------------------------------------------------------|----------|--------|
| TC001        | Register New User              | 1. Open Homepage<br>2. Click Signup/Login<br>3. Enter valid data and register    | User account created and redirected to dashboard     | High     | Pass   |
| TC002        | Login with Valid Credentials   | 1. Click Login<br>2. Enter valid email/password<br>3. Click Login                 | User logged in successfully                          | High     | Pass   |
| TC003        | Login with Invalid Credentials | 1. Enter wrong email/password<br>2. Click Login                                  | Error message displayed: "Incorrect Email or Password"| High     | Pass   |
| TC004        | Contact Us Form                | 1. Click Contact Us<br>2. Fill form<br>3. Submit                                 | Success message displayed                            | Medium   | Pass   |
| TC005        | Search Product                 | 1. Enter product in search bar<br>2. Click Search                                | Matching products displayed                          | Medium   | Pass   |
| TC006        | View Product Details           | 1. Click on any product from list                                                | Product details page opens with all info             | Medium   | Pass   |
| TC007        | Add Product to Cart            | 1. View product<br>2. Click "Add to Cart"<br>3. Open cart                        | Product appears in cart with correct info            | High     | Pass   |
| TC008        | Checkout and Place Order       | 1. Login<br>2. Add product to cart<br>3. Proceed to checkout<br>4. Place order   | Order placed successfully and confirmation shown     | High     | Pass   |
| TC009        | Make Payment                   | 1. On checkout page<br>2. Enter card details<br>3. Confirm                       | Payment successful, thank you message shown          | High     | Pass   |
| TC010        | Logout                         | 1. Click logout after login                                                      | User is logged out and redirected to home page       | Medium   | Pass   |

---

##  Notes

- These test cases are used for both **manual testing** and to plan **automation scripts**.
- Written in alignment with Selenium + TestNG framework using Java.
- 

