package PSA.gestion.metas.tablero.estados;

import java.util.ArrayList;

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

    /*
    private int estado;
    ArrayList<Estados> estados;

    public Estado () {
        estado = 0;
        estados = new ArrayList<>();
        estados.add(Estados.BACKLOG);
        estados.add(Estados.TODO);
        estados.add(Estados.DOING);
        estados.add(Estados.TESTING);
        estados.add(Estados.DONE);
    }

    public void avanzar() {
        if (estado < 4) {
            estado += 1;
        }
    }

    public Estados getEstado() {
        return estados.get(estado);
    }
    */
}
