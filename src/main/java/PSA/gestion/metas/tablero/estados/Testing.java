package PSA.gestion.metas.tablero.estados;

public class Testing extends Estado {

    public Testing() {
        this.estado = 3;
        this.siguiente = new Done();
    }
}
