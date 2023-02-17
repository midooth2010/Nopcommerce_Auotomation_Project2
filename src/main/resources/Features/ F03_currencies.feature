@smoke
 Feature:F03_currencies.feature  user could change currency
   Scenario:user change curerency from US to euro

     Given user go to home page

     When user select euro currency
     Then all item prices changed to euro