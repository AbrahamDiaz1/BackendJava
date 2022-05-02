package practicamona;

public class RivetertoCat extends Mona {
    public RivetertoCat() {
        super();
        nombre = "rivetertocat";
        imagen = nombre + ".png";
    }

    @Override
    public String descripcion() {
        return("Soy Mona "+nombre+", me gusta trabajar.");
    }

    public String accion() {
        return(nombre+" dice Podemos Hacerlo!");
    }
}
