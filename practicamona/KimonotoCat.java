package practicamona;

public class KimonotoCat extends Mona {
    public KimonotoCat() {
        super();
        nombre = "kimonotocat";
        imagen = nombre + ".png";
    }

    @Override
    public String descripcion() {
        return("Soy Mona "+nombre+", visto de kimono.");
    }

    public String accion() {
        return(nombre+" esta abanicando");
    }
}
