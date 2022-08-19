#language: en
  Feature: Busqueda exitosa de cursos

    Scenario: Buscar en pagina

      Given que me encuentro en la pagina de practica
      When compro cursos
      Then muestra resultados en el carro y valida