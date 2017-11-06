# language: es
Característica: Desarrollador puede mover una tarjeta

  Escenario: Al crearse la tarjeta se guarda en el backlog del proyecto
    Dado que mi rol es de "Lider"
    Cuando intento agregar una tarjeta a una funcionalidad
    Entonces la tarjeta es agregada en el backlog

#  Escenario: Como lider intento mover una tarjeta del Backlog a ToDO
    Dado que mi rol es de "Lider"
    Cuando intento mover una tarjeta del Backlog a ToDo
    Entonces la tarjeta es sacada del Backlog
    Entonces la tarjeta es puesta en ToDo

#  Escenario: Como Desarrollador intento mover una tarjeta de ToDO a Doing
    Dado que mi rol es de "Desarrollador"
    Cuando intento mover una tarjeta de la columna ToDo
    Entonces la tarjeta es sacada de ToDo
    Entonces la tarjeta es puesta en Doing

#  Escenario: Como lider intento mover una tarjeta de Doing
    Dado que mi rol es de "Lider"
    Cuando intento mover una tarjeta de la columna Doing
    Entonces la tarjeta es no sacada de Doing

  Escenario: Como desarrollador intento mover una tarjeta del Backlog
    Dado que mi rol es de "Desarrollador"
    Cuando intento mover una tarjeta ya creada del Backlog
    Entonces la tarjeta no es sacada del Backlog
    Entonces la tarjeta no es puesta en ToDo
