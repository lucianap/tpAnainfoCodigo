package PSA.gestion.metas.tablero;

import PSA.gestion.metas.tablero.estados.Backlog;
import PSA.gestion.metas.tablero.estados.Doing;
import PSA.gestion.metas.tablero.estados.Estados;
import PSA.gestion.metas.tablero.estados.ToDo;

import java.util.List;

public class Tablero {

    ListaTarjetas listaTarjetas;

//    List<List<Tarjeta>> columnas = new ArrayList<>();

//    List<Tarjeta> backlog = new ArrayList<Tarjeta>();
//    List<Tarjeta> toDo = new ArrayList<Tarjeta>();
//    List<Tarjeta> doing = new ArrayList<Tarjeta>();
//    List<Tarjeta> testing = new ArrayList<Tarjeta>();
//    List<Tarjeta> done = new ArrayList<Tarjeta>();

    public Tablero() {
        listaTarjetas = new ListaTarjetas();
    }

    public void agregarTarjeta(Tarjeta tarjeta) {
        listaTarjetas.agregar(tarjeta);
    }

    public boolean poseeTarjetas() {
        return listaTarjetas.hayTarjetas();
    }

    public void moverDelBacklog(int idTrajeta) {
        Tarjeta tarjeta = listaTarjetas.getTarjeta(idTrajeta);
        if (tarjeta.getEstado().equals(new Backlog())) {
            tarjeta.mover();
        }
    }

    public void mover(int idTrajeta) {
        Tarjeta tarjeta = listaTarjetas.getTarjeta(idTrajeta);
        if (!tarjeta.getEstado().equals(new Backlog())) {
            tarjeta.mover();
        }
    }

    public List<Tarjeta> getBacklog() {
        return listaTarjetas.getTarjetasConEstado(new Backlog());
    }

    public List<Tarjeta> getToDo() {
        return listaTarjetas.getTarjetasConEstado(new ToDo());
    }

    public List<Tarjeta> getDoing() {
        return listaTarjetas.getTarjetasConEstado(new Doing());
    }
}
