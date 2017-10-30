package PSA.gestion.roles;

import PSA.gestion.permisos.Permiso;
import PSA.gestion.permisos.PermisosFactory;
import PSA.gestion.permisos.PermisosLider;

public class Lider implements Rol {

    Permiso permisos;

    public Lider(){
        PermisosFactory.createPermisosFor(this);
    }

    @Override
    public Permiso getPermisos() {
        return permisos;
    }

}
