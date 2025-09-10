import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Person> persone = new ArrayList<>();

        persone.add(new Person("uno", "due"));
        persone.add(new Person("tre", "quattro"));

        persone.add(new Person("tre", "quattro"));
        persone.add(new Person("cinque", "sei"));
        persone.add(new Person("cinque", "sei"));

        System.out.println("Lista completa: ");
        for (Person uno : persone) {
            System.out.println("Primo : " + uno.getNome() + " " + uno.getCognome());
        }

        List<Person> unici = new ArrayList<>(new LinkedHashSet<>(persone));
        System.out.println("Lista senza ripetizioni: ");
        for (Person uno : unici) {
            System.out.println("Primo : " + uno.getNome() + " " + uno.getCognome());
        }

    }

}
