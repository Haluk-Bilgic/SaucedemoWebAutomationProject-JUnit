# SaucedemoWebAutomationProject-JUnit

This project is a case study that tests main functions of some pages by using JUnit framework on Saucedemo for Web UI Automation.
## Language and Frameworks
* Java
* Selenium WebDriver
* Maven
* JUnit
* POM Design Pattern
* Page Factory Design
* Intellij IDE
* Chrome and Firefox as a Browser

|Test Name|Preconditions|Steps|Expected Result|
|-------|-----|------|------|
|Add any items to the cart and Check if the “Item total” shows the correct sum|Valid username and password - Browser should be installed - Internet connection should be present|Go to https://www.saucedemo.com/|The total price of the two items added to the cart should be displayed correctly|
|||Login||
|||Add any 2 items to the Cart||
|||Click on the basket item in the top right||
|||Click on 'Checkout' button||
|||Type input fields and Click on 'Continue' button||
|||Check if the “Item total” shows the correct sum||
