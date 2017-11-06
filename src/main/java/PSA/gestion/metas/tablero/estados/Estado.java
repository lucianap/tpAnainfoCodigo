package PSA.gestion.metas.tablero.estados;

public class Estado {

    protected int estado;
    protected Estado siguiente;

    public Estado avanzar() {
        return this.siguiente;
    }

    public boolean esFinal() {
        return false;
    }

    @Override
    public boolean equals(Object o){
        Estado other = (Estado) o;
        return other.estado == this.estado;
    }

}
