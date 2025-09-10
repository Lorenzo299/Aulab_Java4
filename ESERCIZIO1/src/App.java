import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Car> garage = List.of(
                (new Car("Fiat 500", "Bianca", 12000)),
                (new Car("Pegeuot", "Rossa", 18000)),
                (new Car("Citroen", "Bianca", 12000)),
                (new Car("Ferrari", "Bianca", 100000)),
                (new Car("Toyota Yaris", "Nera", 20000)));

        List<Car> autoBianche = new ArrayList<>();

        System.out.println("Le auto bianche nel garage sono: ");
        for (Car auto : garage) {
            if (auto.getColore() == "Bianca") {
                autoBianche.add(auto);
                System.out.println(auto.getMarca());
            }
        }

    }
}
