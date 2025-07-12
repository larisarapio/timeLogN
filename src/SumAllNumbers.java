import java.util.ArrayList;
import java.util.List;

public class SumAllNumbers {
    public static void main(String[] args) {
       // somar todos os números de uma lista
        List<Integer> listaNumbers = new ArrayList<Integer>();
        int sum = 0;

        listaNumbers.add(1);
        listaNumbers.add(5);
        listaNumbers.add(4);

        for(Integer num : listaNumbers) {
            sum += num;
        }
        System.out.println(sum);


        

    }
}