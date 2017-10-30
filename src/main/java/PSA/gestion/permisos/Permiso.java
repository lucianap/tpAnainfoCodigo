package PSA.gestion.permisos;

public class Permiso {

    protected String name;

    @Override
    public boolean equals(Object o){
        Permiso other = (Permiso) o;
        if(other.name.equals(this.name)){
            return true;
        } else {
            return false;
        }
    }

}

