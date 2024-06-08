Feature:
As Admin user Add customer
@customer
Scenario Outline:
Validate add customer with multiple Data
Given user navigate browser
When user luach url
When user waite for username with "id"  and "username"
When Enter username with "id" and "username" and "admin"
When Enter password with "id" and "password" and "master"
When click login button with "id" and "btnsubmit"
When user waite for Customer link with "xpath" and "(//a[text()='Customers'])[2]"
When user click for the Customer link with "xpath" and "(//a[text()='Customers'])[2]"
When user waite for Add button with "xpath" and "(//div[@class='btn-group ewButtonGroup'])[2]"
When click Add button with "xpath" and "(//div[@class='btn-group ewButtonGroup'])[2]"
When user waite for Customer number button with "xpath" and "//input[@id='x_Customer_Number']"
When capture Customer number with "xpath" and "//input[@id='x_Customer_Number']"
When Enter in "<Reddy>" with "name" and "x_Customer_Name"
When Enter in "<CustomerAddress>" with "xpath" and "//textarea[@id='x_Address']"
When Enter in "<CustomerCity>" with "xpath" and "//input[@id='x_City']"
When Enter in "<CustomerCountry>" with "xpath" and "//input[@id='x_Country']"
When Enter in "<CustomerContactPerson>" with "xpath" and "//input[@id='x_Contact_Person']"
When Enter in "<PhoneNumber>" with "xpath" and "//input[@id='x_Phone_Number']"
When Enter in "<Email>" with "xpath" and "//input[@id='x__Email']"
When Enter in "<MobileNumber>" with "xpath" and "//input[@id='x_Mobile_Number']"
When Enter in "<Notes>" with "xpath" and "//input[@id='x_Notes']" 
When click Add button with "id" and "btnAction"
When waite for confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When click Confirm Ok button with "xpath" and "//button[normalize-space()='OK!']"
When waite for alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When click alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When validate customer table
When click logout button with "xpath" and "//a[text()='Logout']"
When close the browser

Examples:
|Reddy|CustomerAddress|CustomerCity|CustomerCountry|CustomerContactPerson|PhoneNumber|Email|MobileNumber|Notes|	
|Rajasekhar|Nandyala|BanaganaPalle|USA|SAI HOSTEL|6305189977|rreddy@gmail.com|8309709135|Reddy have 40 acres of land|
	
 


