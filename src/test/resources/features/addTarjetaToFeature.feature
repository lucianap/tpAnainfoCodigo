# language: es
Característica: Añadir una tarjeta a una feature

  Escenario: Como Desarrollador intento agregar una tarjeta a una Feature
    Dado que mi rol es de "Desarrollador"
    Cuando intento agregar una tarjeta a una feature
    Entonces el resultado es exitoso

  Escenario: Como Lider intento agregar una tarjeta a una Feature
    Dado que mi rol es de "Lider"
    Cuando intento agregar una tarjeta a una feature
    Entonces la operacion es rechazada