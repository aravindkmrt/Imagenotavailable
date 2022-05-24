Feature: 
      Login with community Matrimony & find image not available issue

  Scenario Outline:  Login with community Matrimony & find image not available issue
    Given open chrome browser and Maximize the window
    When Login with  valid matri id and Valid password "<username>"
    And Click the login button
    And Click Skip to my Home and Close the image option
    And Click search Option In regular search Page
    And Click Matches Option In yet to be viwed Page
    And Click Home Option In view not contacted page
    Examples:   
     |username|
   |BRH2994315|
   
