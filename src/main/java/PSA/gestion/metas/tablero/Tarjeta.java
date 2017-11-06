package PSA.gestion.metas.tablero;

import PSA.gestion.Usuario;
import PSA.gestion.metas.tablero.estados.Backlog;
import PSA.gestion.metas.tablero.estados.Estado;

public class Tarjeta {

    private static int ID = 0;
    private Usuario responsable;
    private Estado estado;
    private int id;

    public Tarjeta() {
        this.responsable = null;
        this.estado = new Backlog();
        this.id = ++ID;
    }

    @Override
    public boolean equals(Object o){
        Tarjeta other = (Tarjeta) o;
        return other.id == this.id;
    }

    public void asignar(Usuario usuario) {
        if(usuario.getRol().puedeMover()) {
            responsable = usuario;
        }
    }

    public boolean estaAsignada() {
        return responsable != null;
    }

    public void mover() {
        if (!estado.esFinal()) {
            this.estado = estado.avanzar();
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }
}
