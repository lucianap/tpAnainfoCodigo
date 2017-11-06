package PSA.gestion.metas.tablero.estados;

public class ToDo extends Estado {

    public ToDo() {
        this.estado = 1;
        this.siguiente = new Doing();
    }
}
