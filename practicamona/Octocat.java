package practicamona;

public class Octocat {
    private int tentaculos;
    protected String nombre;
    protected String colorCuerpo;
    protected String imagen;
    protected String genero;

     public Octocat(){
         nombre = "Octocat";
         tentaculos = 5;
         colorCuerpo = "negro";
         imagen = "original.png";
         genero = "neutro";
    }

    public String descripcion(){
        return("Soy "+nombre+", genero "+genero+", tengo "+tentaculos+" tentáculos, soy color "+colorCuerpo+".");
    }

    public String accion(){
        return ("");
    }

    public int getTentaculos() {
        return tentaculos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColorCuerpo() {
        return colorCuerpo;
    }

    public String getImagen() {
        return imagen;
    }

    public String getGenero() {
        return genero;
    }
}
