Feature: Validate login functionality 

@Reg 
Scenario: Verify Sucessful Login with Valid details 
	Given user launch site url 
	
	When user enter username and password 
	And user click on login button 
	Then validate user logged in sucessfully 

	
	
	
