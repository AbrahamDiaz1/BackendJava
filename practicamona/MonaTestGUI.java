package practicamona;
import imonsh.*;
import java.util.ArrayList;

public class MonaTestGUI {
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

        Screen screen = new Screen();
        screen.setSize(800,850);
        screen.setLocation(50,50);
        screen.out("Práctica: Herencia y Polimorfismo", "Helvetica", 50, Colors.GloomyPurple);
        screen.setVisible(true);

        for (Octocat octopuss: octogatos){
            screen.out("\n"+octopuss.getNombre(), "Helvetica", 30, Colors.FussionRed);
            screen.showImage("images/"+octopuss.getImagen(),80,80);
            screen.out(octopuss.descripcion(), "Helvetica", 20, Colors.BlueHorizon);
        }

    }
}
