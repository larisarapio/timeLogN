import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Refactor {
    public static void main(String[] args) {

        String [] names = new String[] {"João", "Larissa", "Leticia", "Ana", "Arthur"};

        System.out.println("Sem ordem nenhuma");

        for (String name : names) {
            System.out.println(name);

        }

        List<String> namesList = Arrays.asList(names);

        Collections.sort(namesList);


        System.out.println("Em ordem alfabetica usando listas "+namesList);
        for (String name : namesList) {
            System.out.println(name);

        }

        System.out.println("Tamanho da ordem: "+namesList.size());


        //-------------------------------------------------------------------

        System.out.println("Soma todos os num arrays");
        int [] nums = new int [5];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += i;
            System.out.println("Somando "+i);
        }

        System.out.println("Valor total: "+count);

        //-------------------------------------------------------------------

        System.out.println("Soma todos os num que foram colocados");
        int[] numsColocados = {5, 10, 15, 20};
        int countTotal = 0;

        for (int i = 0; i < numsColocados.length; i++) {
            countTotal += numsColocados[i];
            System.out.println("Somando "+numsColocados[i]);
        }

        System.out.println("Valor total: "+ countTotal);

    }



}