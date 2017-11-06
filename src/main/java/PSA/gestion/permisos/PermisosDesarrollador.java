package PSA.gestion.permisos;

public class PermisosDesarrollador extends Permiso {

    public PermisosDesarrollador() {
        this.crear = false;
        this.asignar = false;
        this.moverBacklog = false;
        this.mover = true;
    }
}
