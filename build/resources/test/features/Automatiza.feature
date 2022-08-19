#language: en
  Feature: Busqueda exitosa con datos extraidos de un xlsx

    Scenario: Buscar en google

      Given que me encuentro en la pagina de practica
      When compro cursos
      Then muestra resultados en el carro y valida