# language: es
Característica: Asignar a un Desarrollador una Tarjeta

  Escenario: Como Lider intento asignar una tarjeta a un Desarrollador
    Dado que mi rol es de "Lider"
    Cuando intento asignar una tarjeta a un "Desarrollador"
    Entonces la tarjeta quedo asignada al desarrollador

  Escenario: Como Lider intento asignar una tarjeta a otro Lider
    Dado que mi rol es de "Lider"
    Cuando intento asignar una tarjeta a un "Lider"
    Entonces la tarjeta no quedo asignada

  Escenario: Como Desarrollador intento asignar una tarjeta
    Dado que mi rol es de "Desarrollador"
    Cuando intento asignar una tarjeta a un "Desarrollador"
    Entonces la tarjeta no quedo asignada
