import java.util.ArrayList;
import java.util.Scanner;

public class ListCitiesScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas cidades deseja digitar?");
        int nums = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> cities = new ArrayList<>();

        for (int i = 0; i < nums; i++) {
            System.out.println("Digite uma cidade:");
            String cidade = scanner.nextLine();
            cities.add(cidade.toUpperCase());

        }

        if (cities.contains("SÃO PAULO")){
            System.out.println("São Paulo está na lista");
        } else {
            System.out.println("São Paulo não está na lista");
        }

        System.out.println(cities);

    }
}