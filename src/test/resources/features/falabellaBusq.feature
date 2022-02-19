#language: en
Feature: Busqueda exitosa con datos de Excel
  Scenario: Buscar en Google
    Given que me encuentro en la pagina fe falabella
    When busco productos
    Then hace la busqueda y me muestra resultados