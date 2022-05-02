package practicamona;

public class Lovelace extends Mona {
    public Lovelace() {
        super();
        nombre = "lovelace";
        imagen = nombre + ".jpg";
    }

    @Override
    public String descripcion() {
        return("Soy Mona "+nombre+", me gusta hacer cálculos y escribir.");
    }

    public String accion() {
        return(nombre+" esta haciendo un algoritmo");
    }
}
