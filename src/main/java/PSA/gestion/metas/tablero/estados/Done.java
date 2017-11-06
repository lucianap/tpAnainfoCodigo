package PSA.gestion.metas.tablero.estados;

public class Done extends Estado {

    public Done() {
        this.estado = 4;
        this.siguiente = null;
    }

    public boolean esFinal() {
        return true;
    }
}
