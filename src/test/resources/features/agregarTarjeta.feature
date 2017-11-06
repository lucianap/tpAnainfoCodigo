# language: es
Característica: Añadir tarjeta a una funcionalidad

  Escenario: Como Desarrollador intento agregar una tarjeta a una funcionalidad
    Dado que mi rol es de "Desarrollador"
    Cuando intento agregar una tarjeta a una funcionalidad
    Entonces la tarjeta no es agregada a la funcionalidad
    Entonces la tarjeta no es agregada al tablero

  Escenario: Como Lider intento agregar una tarjeta a una funcionalidad
    Dado que mi rol es de "Lider"
    Cuando intento agregar una tarjeta a una funcionalidad
    Entonces la tarjeta es agregada a la funcionalidad
    Entonces la tarjeta es agregada al tablero
