Feature: Validating Facebook Page
Background: 
Given User is on login page


@sanity
Scenario: Fb page Title validation
When User print page Title

@smoke
Scenario: Fb page URL validation
When User print URL of the page

#Scenario Outline: Fb page Credential validation
#When User enters "<username>" and "<password>"
#And User clicks on login page
#Then User verify the error message

#Examples:
#|username|password|
#|Hello|123456|













