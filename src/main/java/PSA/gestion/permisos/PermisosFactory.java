package PSA.gestion.permisos;

public class PermisosFactory {

    public static Permiso obtenerPermisosDe(String rol) {
        if(rol.equals("Desarrollador")) {
            return new PermisosDesarrollador();
        } else if(rol.equals("Lider")){
            return new PermisosLider();
        } else {
            return null;
        }
    }
}
