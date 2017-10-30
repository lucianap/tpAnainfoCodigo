package PSA.gestion.metas;

import PSA.gestion.Usuario;
import PSA.gestion.metas.tablero.Tarjeta;

import java.util.ArrayList;
import java.util.List;

public class Feature {

    List<Tarjeta> tarjetas = new ArrayList<>();

    public void addTarjeta(Tarjeta tarjeta){
        tarjetas.add(tarjeta);
    }


}
