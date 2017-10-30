package fiuba.addTarjetaToFeature;

import PSA.gestion.Usuario;
import PSA.gestion.metas.Feature;
import PSA.gestion.metas.tablero.Tarjeta;
import PSA.gestion.roles.Colaborador;
import PSA.gestion.roles.Desarrollador;
import PSA.gestion.roles.Lider;
import PSA.gestion.roles.ProductOwner;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import fiuba.FachadaBanco;

import static org.junit.Assert.*;

/**
 * Created by L.
 */
public class AddTarjetaToFeatureSteps {

    private Usuario usuario;
    private boolean resultadoExitoso;

    private final Feature feature = new Feature();
    private final Tarjeta tarjeta = new Tarjeta();

    @Dado("^que mi rol es de \"(.*?)\"")
    public void que_mi_rol_es_de(String rol) throws Throwable {
        usuario = new Usuario("pepe", new Colaborador());
        if(rol.equalsIgnoreCase("Desarrollador")) {
            usuario.setRol(new Desarrollador());
        } else if(rol.equalsIgnoreCase("Lider")){
            usuario.setRol(new Lider());
        } else if(rol.equalsIgnoreCase("PO")) {
            usuario.setRol(new ProductOwner());
        } else if(rol.equalsIgnoreCase("Colaborador")) {
            usuario.setRol(new Colaborador());
        }
    }

    @Cuando("^intento agregar una tarjeta a una feature")
    public void intento_agregar_una_tarjeta_a_una_feature() throws Throwable {
        resultadoExitoso = usuario.addTarjetaToFeature(feature, tarjeta);
    }

    @Entonces("^el resultado es exitoso y la feature es agregada")
    public void el_resultado_es_exitoso() throws Throwable {
        assertTrue(resultadoExitoso);
    }

    @Entonces("^la operacion es rechazada y la feature no es agregada")
    public void la_operacion_es_rechazada() throws Throwable {
        assertFalse(resultadoExitoso);
    }

}
