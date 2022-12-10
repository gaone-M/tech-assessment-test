@Test
Feature: RetailStore Bill
  User should be able to get a 30% discount an an employee of the store
  User should be able to get 10% discount as an affiliate of the store
  User should be able to get a 5% discount as a customer over two years
  User should be able to get P5 discount for every P100 on the bill
  User should be able to get one of the percentage based on the account of the bill

  Scenario: Employee - purchase of non grocery products
    Given I have added a item to my shopping list on the website "http://127.0.0.1:8000/"
    When I am an employee of the store
    Then I am eligible to get a 30% discount on the products purchased
    And I can see the bill for the products purchased

  Scenario:  User as an affliate
    Given I have added items to my shopping bag on the website "http://127.0.0.1:8000/"
    When I am an affiliate user of the store
    Then I am eligible to get 10% discount for products purchased

  Scenario: User is a customer for over two years
    Given I have added non grocery items to my shopping bag on the website "http://127.0.0.1:8000/"
    When I have been a customer of the store for more than two years
    Then I should get a 5% discount on products purchased

  Scenario: User get P5 discount for every P100 on the bill
    Given I have purchased items n my shopping list on the website "http://127.0.0.1:8000/"
    When I have purchased over P100 on the bill
    Then I should get a P5 disount for every p100 on the bill