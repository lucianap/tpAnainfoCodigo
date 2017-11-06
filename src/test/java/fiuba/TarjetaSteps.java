package fiuba;

import PSA.gestion.Usuario;
import PSA.gestion.metas.Funcionalidad;
import PSA.gestion.metas.tablero.Tablero;
import PSA.gestion.metas.tablero.Tarjeta;
import PSA.gestion.roles.Lider;
import PSA.gestion.roles.RolFactory;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.*;

public class TarjetaSteps {

    private Usuario usuario;

    private final Funcionalidad funcionalidad = new Funcionalidad();
    private final Tarjeta tarjeta = new Tarjeta();
    private final Tablero tablero = new Tablero();

    // AGREGAR TARJETA
    @Dado("^que mi rol es de \"(.*?)\"")
    public void que_mi_rol_es_de(String rol) throws Throwable {
        usuario = new Usuario("bar", RolFactory.obtenerRol(rol));

/*        if(rol.equalsIgnoreCase("Desarrollador")) {
            usuario.setRol(new Desarrollador());
        } else if(rol.equalsIgnoreCase("Lider")){
            usuario.setRol(new Lider());
        }
*/
    }

    @Cuando("^intento agregar una tarjeta a una funcionalidad")
    public void intento_agregar_una_tarjeta_a_una_funcionalidad() throws Throwable {
        usuario.agregarTarjetaAFuncionalidad(funcionalidad, tarjeta);
        usuario.agregarTarjetaATablero(tablero, tarjeta);
    }

    @Entonces("^la tarjeta no es agregada a la funcionalidad$")
    public void la_tarjeta_no_es_agregada_a_la_funcionalidad() throws Throwable {
        assertFalse(funcionalidad.poseeTarjetas());
    }

    @Entonces("^la tarjeta no es agregada al tablero$")
    public void la_tarjeta_no_es_agregada_al_tablero() throws Throwable {
        assertFalse(tablero.poseeTarjetas());
    }

    @Entonces("^la tarjeta es agregada a la funcionalidad$")
    public void la_tarjeta_es_agregada_a_la_funcionalidad() throws Throwable {
        assertTrue(funcionalidad.poseeTarjetas());
    }

    @Entonces("^la tarjeta es agregada al tablero$")
    public void la_tarjeta_es_agregada_al_tablero() throws Throwable {
        assertTrue(tablero.poseeTarjetas());
    }

    // ASIGNAR TARJETA
    @Cuando("^intento asignar una tarjeta a un \"(.*?)\"$")
    public void intento_asignar_una_tarjeta_a_un(String rol) throws Throwable {
        Usuario usuario2 = new Usuario("foo", RolFactory.obtenerRol(rol));
        usuario.asignarTarjeta(tarjeta, usuario2);
    }

    @Entonces("^la tarjeta quedo asignada al desarrollador$")
    public void la_tarjeta_quedo_asignada_al_desarrollador() throws Throwable {
        assertTrue(tarjeta.estaAsignada());
    }

    @Entonces("^la tarjeta no quedo asignada$")
    public void la_tarjeta_no_quedo_asignada() throws Throwable {
        assertFalse(tarjeta.estaAsignada());
    }

    // MOVER TARJETA
    @Entonces("^la tarjeta es agregada en el backlog$")
    public void la_tarjeta_es_agregada_en_el_backlog() throws Throwable {
        assertEquals(1, tablero.getBacklog().size());
    }

    @Cuando("^intento mover una tarjeta del Backlog a ToDo$")
    public void intento_mover_una_tarjeta_del_backlog_a_todo() throws Throwable {
        usuario.moverTarjetaDelBacklog(tarjeta.getId(), tablero);
    }

    @Entonces("^la tarjeta es sacada del Backlog$")
    public void la_tarjeta_es_sacada_del_Backlog() throws Throwable {
        assertEquals(0, tablero.getBacklog().size());
    }

    @Entonces("^la tarjeta es puesta en ToDo$")
    public void la_tarjeta_es_puesta_en_ToDo() throws Throwable {
        assertEquals(1, tablero.getToDo().size());
    }

    @Cuando("^intento mover una tarjeta de la columna ToDo$")
    public void intento_mover_una_tarjeta_de_la_columna_ToDo() throws Throwable {
        usuario.moverTarjeta(tarjeta.getId(), tablero);
    }

    @Entonces("^la tarjeta es sacada de ToDo$")
    public void la_tarjeta_es_sacada_de_ToDo() throws Throwable {
        assertEquals(0, tablero.getToDo().size());
    }

    @Entonces("^la tarjeta es puesta en Doing$")
    public void la_tarjeta_es_puesta_en_Doing() throws Throwable {
        assertEquals(1, tablero.getDoing().size());
    }

    @Cuando("^intento mover una tarjeta de la columna Doing$")
    public void intento_mover_una_tarjeta_de_la_columna_Doing() throws Throwable {
    }

    @Entonces("^la tarjeta es no sacada de Doing$")
    public void la_tarjeta_es_no_sacada_de_Doing() throws Throwable {
        assertEquals(1, tablero.getDoing().size());
    }

    @Cuando("^intento mover una tarjeta ya creada del Backlog$")
    public void intento_mover_una_tarjeta_ya_creada_del_Backlog() throws Throwable {
        Usuario usuario2 = new Usuario("foo", new Lider());
        usuario2.agregarTarjetaAFuncionalidad(funcionalidad, tarjeta);
        usuario2.agregarTarjetaATablero(tablero, tarjeta);
    }

    @Entonces("^la tarjeta no es sacada del Backlog$")
    public void la_tarjeta_no_es_sacada_del_Backlog() throws Throwable {
        assertEquals(1, tablero.getBacklog().size());
    }

    @Entonces("^la tarjeta no es puesta en ToDo$")
    public void la_tarjeta_no_es_puesta_en_ToDo() throws Throwable {
        assertEquals(0, tablero.getToDo().size());
    }
}
