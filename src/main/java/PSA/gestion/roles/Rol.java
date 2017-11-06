package PSA.gestion.roles;

import PSA.gestion.permisos.Permiso;
import PSA.gestion.permisos.PermisosFactory;

public class Rol {

    protected Permiso permisos;

    public Rol(String rol) {
        permisos = PermisosFactory.obtenerPermisosDe(rol);

    }

    public boolean puedeCrear() {
        return permisos.crear;
    }

    public boolean puedeAsignar() {
        return permisos.asignar;
    }

    public boolean puedeMoverDelBacklog() {
        return permisos.moverBacklog;
    }

    public boolean puedeMover() {
        return permisos.mover;
    }
}
