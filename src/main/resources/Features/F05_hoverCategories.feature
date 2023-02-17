@smoke
  Feature: F05_hoverCategories |
    Scenario: user select subcategory
      Given user go to home page
      When user hover on category and click on subgaegory
      Then  user should be navigate to page contains this subcategory
