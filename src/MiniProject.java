import java.util.ArrayList;
import java.util.List;

public class MiniProject {
    public static void main(String[] args) {

            String [] fruits = new String [] {"Caqui", "Laranja", "Amora", "Jabuticaba", "Abacaxi"};
            List<String> fiveLetters = new ArrayList<>(); //posso adicionar uma lista que n possui um valor definido, pois vai conseguir guardar qm tem 5 letras

            for (int i = 0; i < fruits.length; i++) {

                if (fruits[i].length() == 5) {
                    //System.out.println(fruits[i]); posso mostrar aqui
                    fiveLetters.add(fruits[i]);

                }

            }

       System.out.println("As frutas que possuem 5 letras são: "+ fiveLetters);
    }
}