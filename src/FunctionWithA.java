import java.util.ArrayList;
import java.util.List;

public class FunctionWithA {
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("John");
        names.add("Lara");
        names.add("Eduarda");
        names.add("Camila");

        for (String name : names) {
            if (name.contains("a")){
                System.out.println(name);
            }
        }

    }
}
