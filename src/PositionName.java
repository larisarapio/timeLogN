import java.util.ArrayList;

public class PositionName {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Bruno");
        names.add("Lari");
        names.add("Alex");
        names.add("Demon");
        names.add("Ana");

        String searchName= "Alex";

        int position = names.indexOf(searchName);

        if (position != -1) {
            System.out.println("Nome encontrado na posição: " + position);
        } else {
            System.out.println("Nome não encontrado");
        }
    }
}
