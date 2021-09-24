#Author: Estiven Franco

  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
 Scenario Outline: Search for a automation course
    Given than estiven wants to learn automation at the academy Choucair
    |nombre  |contrasena  |
    |<nombre>|<contrasena>|
    When he search for the course  automatizacion on the choucair academy plataform
    |curso|
    |<curso>|
    Then he finds the course called resources
    |curso|
    |<curso>|
    Examples:
      | nombre   | contrasena  |curso|
      |1037648863|Choucair2021*|Foundation Level|
