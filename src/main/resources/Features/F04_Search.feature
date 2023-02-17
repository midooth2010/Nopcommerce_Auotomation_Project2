@smoke
Feature: F04_Search | user could be able to search for products

     Scenario Outline:user search using product name
       Given user go to home page
        When User search with product name "<name>" in search field
        And User click search button
        Then search result displayed with its product "<name>"
        Examples:
          | name   |
          | nike   |
          | laptop |
          | book   |

       Scenario Outline: user could search for product using sku
         Given user go to home page
         When  user search with product "<sku>" in search field
         And  User click search button
         Then search result displayed related to the product sku "<sku>"
         Examples:
           | sku       |
           | SCI_FAITH |
           | APPLE_CAM |
           | SF_PRO_11 |