package practicamona;

public class HulaloopCat extends Mona {
    public HulaloopCat() {
        super();
        nombre = "hulaloopcat";
        imagen = nombre + ".png";
    }

    @Override
    public String descripcion() {
        return("Soy Mona "+nombre+", vivo en Hawai.");
    }

    public String accion() {
        return(nombre+" esta tocando el ukelele");
    }
}
