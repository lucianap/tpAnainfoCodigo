package PSA.gestion.roles;

import PSA.gestion.permisos.Permiso;
import PSA.gestion.permisos.PermisosColaborador;
import PSA.gestion.permisos.PermisosFactory;

public class Colaborador implements Rol {

    Permiso permisos;

    public Colaborador(){
        this.permisos = PermisosFactory.createPermisosFor(this);

    }

    @Override
    public Permiso getPermisos() {
        return permisos;
    }
}
