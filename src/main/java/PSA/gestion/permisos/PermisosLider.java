package PSA.gestion.permisos;

public class PermisosLider extends Permiso {

    public PermisosLider() {
        this.crear = true;
        this.asignar = true;
        this.moverBacklog = true;
        this.mover = false;
    }
}
