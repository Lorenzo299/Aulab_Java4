import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<Person> gente = new ArrayList<>();
        gente.add(new Person("lollo", "gatti"));
        gente.add(new Person("fofo", "ciotti"));
        gente.add(new Person("titto", "petro"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecco le persone nel tuo elenco :");
        for (int i = 0; i < gente.size(); i++) {
            System.out.println(gente.get(i).getName() + " " + gente.get(i).getSurnname() + " ha indice pari a " + i);
        }

        System.out.println("Quale indice vuoi Sostiture?");
        int indice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nuovo nome?");
        String newNome = scanner.nextLine();
        System.out.println("Nuovo Cognome?");
        String newCognome = scanner.nextLine();

        Person nuovoUtente = new Person(newNome, newCognome);

        for (int i = 0; i < gente.size(); i++) {
            if (i == indice) {
                gente.set(indice, nuovoUtente);
            }
        }
        System.out.println("Ecco le persone nel tuo nuovo elenco :");
        for (Person uno : gente) {
            System.out.println(uno.getName() + " " + uno.getSurnname());
        }

    }
}
