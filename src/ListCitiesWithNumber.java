import java.util.ArrayList;

public class ListCitiesWithNumber {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Porto Alegre");
        cities.add("Los angeles");
        cities.add("São paulo");
        cities.add("Ijui");
        cities.add("Viamão");

        for(int i = 0; i < cities.size(); i++){
            System.out.println(i + " - " + cities.get(i));
        }


    }
}