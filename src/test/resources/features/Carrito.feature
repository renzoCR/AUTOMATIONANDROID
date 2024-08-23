@Carrito
Feature: Validar la funcionalidad del carrito de compras.

  Scenario Outline: Compra correcta
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <unidades> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                 | unidades |
      | Sauce Labs Backpack     | 1           |
      | Sauce Labs Bolt - T-Shirt | 1                   |
      | Sauce Labs Bike Light     | 2                   |