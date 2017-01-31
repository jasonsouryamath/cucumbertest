Feature: Test ClosingCorp ccAdmin Date Change JAVA script 
		# a task that will happen ALL the time such as opening firefox and naviagting to login page and 
		# entering credentiais 
		#Scenario is equivalent to a test case 
		# this scenario will iterate and change date in jquery calendar 
		Scenario: 
		Given I Open FireFox instance and navigate to smartGFE
		When  I enter a valid username and password 
		When I click DART tab  
		Then if i click Data tab i should see a list of desired states to choose from 
		Then when it clicks a new tab is opened up and browser switches to active tab and iterate dates and the loops repeat until its breakpoint  
		
		#you need testrunner where the program starts 
		#create Feature class and then write out scenarios
		# keyword is designated in light blue 
		# Steps are disignated in green
		# text is designated in white   
		
		