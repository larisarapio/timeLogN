import java.util.ArrayList;

public class ListCities {
    public static void main(String[] args) {
        //Crie um array com 5 nomes e imprima cada nome

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Santa Catarina");
        cities.add("Los angeles");
        cities.add("São paulo");
        cities.add("Ijui");
        cities.add("Viamão");
        System.out.println("ANTES");
        for(String city : cities) {
            System.out.println(city);
        }
        System.out.println(cities.get(2) + " será removido.");
        cities.remove(2);

        System.out.println("DEPOIS");
        for(String city : cities) {
            System.out.println(city);
        }

    }
}