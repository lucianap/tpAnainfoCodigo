package PSA.gestion.permisos;

import PSA.gestion.roles.Colaborador;
import PSA.gestion.roles.Desarrollador;
import PSA.gestion.roles.Lider;
import PSA.gestion.roles.ProductOwner;

public class PermisosFactory {

    public static PermisosColaborador createPermisosFor(Colaborador colaborador){

        return new PermisosColaborador();

    }

    public static PermisosDesarrollador createPermisosFor(Desarrollador des){

        return new PermisosDesarrollador();

    }

    public static PermisosLider createPermisosFor(Lider lid){

        return new PermisosLider();

    }

    public static PermisosPO createPermisosFor(ProductOwner po){

        return new PermisosPO();

    }

}
