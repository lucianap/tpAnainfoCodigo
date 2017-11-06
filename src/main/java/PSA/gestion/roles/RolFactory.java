package PSA.gestion.roles;

public class RolFactory {

    public static Rol obtenerRol(String rol) {
        if(rol.equals("Desarrollador")) {
            return new Desarrollador();
        } else if(rol.equals("Lider")){
            return new Lider();
        } else {
            return null;
        }
    }
}
