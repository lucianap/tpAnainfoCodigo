package PSA.gestion.metas.tablero.estados;

public class Backlog extends Estado {

    public Backlog() {
        this.estado = 0;
        this.siguiente = new ToDo();
    }
}
