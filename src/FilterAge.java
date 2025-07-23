import java.util.ArrayList;
import java.util.List;

public class FilterAge {
    public static void main(String[] args) {
        List<Integer> listAges = new ArrayList<>();
        listAges.add(20);
        listAges.add(18);
        listAges.add(10);
        listAges.add(80);
        listAges.add(2);

        System.out.println("Maiores de 18! ");
        for (Integer age : listAges) {
            if (age >= 18) {
                System.out.println(age);
            }
        }

    }
}
