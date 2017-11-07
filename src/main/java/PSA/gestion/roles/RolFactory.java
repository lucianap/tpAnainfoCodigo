package PSA.gestion.roles;

public class RolFactory {

    public static Rol obtenerRol(String rol) {
        if(rol.equalsIgnoreCase("Desarrollador")) {
            return new Desarrollador();
        } else if(rol.equalsIgnoreCase("Lider")){
            return new Lider();
        } else {
            return null;
        }
    }
}
