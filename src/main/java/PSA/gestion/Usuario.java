package PSA.gestion;

import PSA.gestion.metas.Funcionalidad;
import PSA.gestion.metas.tablero.Tablero;
import PSA.gestion.metas.tablero.Tarjeta;
import PSA.gestion.permisos.PermisosDesarrollador;
import PSA.gestion.permisos.PermisosLider;
import PSA.gestion.roles.Rol;

public class Usuario {

    private String nombre;
    private Rol rol;

    public Usuario(String name, Rol rol) {
        this.nombre = name;
        this.rol = rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Rol getRol() {
        return this.rol;
    }

    public void agregarTarjetaAFuncionalidad(Funcionalidad funcionalidad, Tarjeta tarjeta) {
        if(rol.puedeCrear()) {
            funcionalidad.agregarTarjeta(tarjeta);
        }
    }

    public void agregarTarjetaATablero(Tablero tablero, Tarjeta tarjeta) {
        if(rol.puedeCrear()) {
            tablero.agregarTarjeta(tarjeta);
        }
    }

    public void asignarTarjeta(Tarjeta tarjeta, Usuario usuario) {
        if(rol.puedeAsignar()) {
            tarjeta.asignar(usuario);
        }
    }

    public void moverTarjetaDelBacklog(int idTarjeta, Tablero tablero) {
        if(rol.puedeMoverDelBacklog()) {
            tablero.moverDelBacklog(idTarjeta);
        }
    }

    public void moverTarjeta(int idTarjeta, Tablero tablero) {
        if(rol.puedeMover()) {
            tablero.mover(idTarjeta);
        }
    }

}
