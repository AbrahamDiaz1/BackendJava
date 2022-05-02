package practicamona;

public class FemalecodertoCat extends Mona {
    public FemalecodertoCat() {
        super();
        nombre = "femalecodertocat";
        imagen = nombre + ".png";
    }

    @Override
    public String descripcion() {
        return("Soy Mona "+nombre+", me gusta programar.");
    }

    public String accion() {
        return(nombre+" esta programando");
    }
}
