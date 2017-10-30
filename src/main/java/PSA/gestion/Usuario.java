package PSA.gestion;

import PSA.gestion.metas.Feature;
import PSA.gestion.metas.tablero.Tarjeta;
import PSA.gestion.permisos.PermisosLider;
import PSA.gestion.roles.Rol;

public class Usuario {

    private String nombre;
    private Rol rol;

    public Usuario(String name, Rol rol) {
        this.nombre = name;
        this.rol = rol;
    }

    public void setRol(Rol rol){
        this.rol = rol;
    }

    public boolean addTarjetaToFeature(Feature feature, Tarjeta tarjeta) {
        if(rol.getPermisos().equals(new PermisosLider())) {
            feature.addTarjeta(tarjeta);
            return true;
        } else {
            return false;
        }
    }

}
