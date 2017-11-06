package PSA.gestion.metas.tablero;

import PSA.gestion.metas.tablero.estados.Estado;

import java.util.ArrayList;
import java.util.List;

public class ListaTarjetas {

    List<Tarjeta> tarjetas;

    public ListaTarjetas() {
        tarjetas = new ArrayList<Tarjeta>();
    }

    public void agregar(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
    }

    public boolean hayTarjetas() {
        return !tarjetas.isEmpty();
    }

    public Tarjeta getTarjeta(int id) {
        for(Tarjeta tarjeta : tarjetas) {
            if (tarjeta.getId() == id) {
                return tarjeta;
            }
        }
        return null;
    }

    public List<Tarjeta> getTarjetasConEstado(Estado estado) {
        List<Tarjeta> lista = new ArrayList<>();
        for (Tarjeta tarjeta : tarjetas) {
            if (tarjeta.getEstado().equals(estado)) {
                lista.add(tarjeta);
            }
        }
        return lista;
    }
}
