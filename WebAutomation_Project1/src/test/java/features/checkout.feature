Feature: validate checkout functionality 

@Reg 
Scenario: validate checkout with valid details 

	Given user launch site url
	
	When user enter username and password 
	And user click on login button 
	And user add product into the basket from PLP page
	And user navigate to cart page
	And user enter information "Test" "Automation" "201301"
	Then user place order with cash on delivery mode
	Then validate order confirmation