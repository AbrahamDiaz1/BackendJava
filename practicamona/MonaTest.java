package practicamona;
//Vamos a practicar Herencia y Polimorfismo
import java.util.ArrayList;

public class MonaTest {
    public static void main(String[] args) {
        ArrayList<Octocat> octogatos = new ArrayList<>();
        octogatos.add(new Octocat());
        octogatos.add(new Mona());
        octogatos.add(new KimonotoCat());
        octogatos.add(new SnowtoCat());
        octogatos.add(new FemalecodertoCat());
        octogatos.add(new Lovelace());
        octogatos.add(new RivetertoCat());
        octogatos.add(new HulaloopCat());

        for (Octocat octopuss: octogatos){
            System.out.println(octopuss.descripcion());
            System.out.println(octopuss.accion());
        }
    }
}
