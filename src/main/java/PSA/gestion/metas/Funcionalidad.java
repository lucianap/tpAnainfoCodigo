package PSA.gestion.metas;

import PSA.gestion.metas.tablero.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class Funcionalidad {

    List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();

    public void agregarTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public boolean poseeTarjetas() {
        return !tarjetas.isEmpty();
    }


}
