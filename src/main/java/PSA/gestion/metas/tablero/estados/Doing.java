package PSA.gestion.metas.tablero.estados;

public class Doing extends Estado {

    public Doing() {
        this.estado = 2;
        this.siguiente = new Testing();
    }

}
