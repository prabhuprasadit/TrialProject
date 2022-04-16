Feature: Checking the login page for facebook web application

Scenario: Checking the web page with possible login credentials
Given Launch the chrome browser
When open the URL as "https://www.facebook.com/"
When Enter the Username as "1234567890"
When Enter the password as "1234567890"
When Click to Login Button
And close the browser