import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplicateForTwo {
    public static void main(String[] args) {

        //int [] numbers = new int[] {10, 20, 30, 40, 50};

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        for(int num : numbers){
            System.out.println(num*2);

        }
    }
}
