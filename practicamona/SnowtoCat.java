package practicamona;

public class SnowtoCat extends Mona {
    public SnowtoCat() {
        super();
        nombre = "snowtocat";
        imagen = nombre + ".jpg";
    }

    @Override
    public String descripcion() {
        return("Soy Mona "+nombre+", visto traje de esqui.");
    }

    public String accion() {
        return(nombre+" esta esquiando");
    }
}
