package PSA.gestion.roles;

import PSA.gestion.permisos.Permiso;
import PSA.gestion.permisos.PermisosFactory;
import PSA.gestion.permisos.PermisosPO;

public class ProductOwner implements Rol {

    Permiso permisos;

    public ProductOwner(){
        this.permisos = PermisosFactory.createPermisosFor(this);
    }

    @Override
    public Permiso getPermisos() {
        return permisos;
    }
}
