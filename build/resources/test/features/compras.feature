Feature: I as a user want to test the shopping funcionality

  @addItem
  Scenario Outline: I added items to shopping cart
    Given that the user loads the test data while on the page
      | answerExpected   | mainMenu   | product   | quantity   |
      | <answerExpected> | <mainMenu> | <product> | <quantity> |
    When add a item to shopping cart
    Then look it in the purchase summary
    Examples:
      | answerExpected                         | mainMenu | product            | quantity |
    ##@externaldata@./src/test/resources/datadriven/compras.xlsx@summary@1
      |Camiseta Lycra Fría Slim Fit Oxo Sport|Hombre|Slim Fit Oxo Sport||

  @checkPrice
  Scenario Outline: I check price correctly of item
    Given that the user loads the test data while on the page
      | answerExpected   | mainMenu   | product   | quantity   |
      | <answerExpected> | <mainMenu> | <product> | <quantity> |
    When increase a item to shopping cart
    Then look it the price is right
    Examples:
      | answerExpected | mainMenu | product           | quantity |
    ##@externaldata@./src/test/resources/datadriven/compras.xlsx@summary@2
      |300.000|Hombre|Converse All Star|4|

  @removeAItem
  Scenario Outline: I remove an item from the summary purchase
    Given that the user loads the test data while on the page
      | answerExpected   | mainMenu   | product   | productoTwo   | productThree   |
      | <answerExpected> | <mainMenu> | <product> | <productoTwo> | <productThree> |
    When i decide to withdraw a item
    Then i see the deleted message
    Examples:
      | answerExpected          | mainMenu | product            | productoTwo       | productThree           |
    ##@externaldata@./src/test/resources/datadriven/compras.xlsx@lotItems@1
      |El carrito fue vaciado!|Hombre|Slim Fit Oxo Sport|Converse All Star|Sudadera Jogger Hombre|

  @removeAllItems
  Scenario Outline: I remove all items from the summary purchase
    Given that the user loads the test data while on the page
      | answerExpected   | mainMenu   | product   | productoTwo   | productThree   |
      | <answerExpected> | <mainMenu> | <product> | <productoTwo> | <productThree> |
    When i decide to remove all items
    Then i see the deleted message
    Examples:
      | answerExpected          | mainMenu | product            | productoTwo       | productThree           |
    ##@externaldata@./src/test/resources/datadriven/compras.xlsx@lotItems@1
      |El carrito fue vaciado!|Hombre|Slim Fit Oxo Sport|Converse All Star|Sudadera Jogger Hombre|

  @cancelRemoveAItem
  Scenario Outline: I cancel to remove an item from the summary purchase
    Given that the user loads the test data while on the page
      | answerExpected   | mainMenu   | product   | quantity   |
      | <answerExpected> | <mainMenu> | <product> | <quantity> |
    When i decide to cancel an item withdrawal
    Then look it in the purchase summary
    Examples:
      | answerExpected                         | mainMenu | product            | quantity |
     ##@externaldata@./src/test/resources/datadriven/compras.xlsx@summary@1
      |Camiseta Lycra Fría Slim Fit Oxo Sport|Hombre|Slim Fit Oxo Sport||

  @searchAnItem
  Scenario Outline: I look for an article in the search engine
    Given that the user loads the test data while on the page
      | answerExpected   | mainMenu   | product   | quantity   |
      | <answerExpected> | <mainMenu> | <product> | <quantity> |
    When i search an item
    Then i visualise a product related
    Examples:
      | answerExpected | mainMenu | product | quantity |
     ##@externaldata@./src/test/resources/datadriven/compras.xlsx@summary@3
      |Gorra En Dril Publicitaria Con Cierre En Hebilla En Colores||Gorra En Dril Publicitaria Con Cierre En Hebilla En Colores||

