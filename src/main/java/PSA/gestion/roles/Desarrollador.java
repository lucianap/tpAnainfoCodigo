package PSA.gestion.roles;

import PSA.gestion.permisos.Permiso;
import PSA.gestion.permisos.PermisosDesarrollador;
import PSA.gestion.permisos.PermisosFactory;

public class Desarrollador implements Rol {

    Permiso permisos;

    public Desarrollador(){
        PermisosFactory.createPermisosFor(this);
    }

    public Permiso getPermisos() {
        return permisos;
    }

}
