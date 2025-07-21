import java.util.Arrays;

public class FunctionWithArray {

    public static void main(String[] args) {

        float[] numeros =  {2,4,6};
        float media = mediaValues(numeros);
        System.out.println("Media: " + media);

    }

    public static float mediaValues(float values[]) {
        float sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return  sum / values.length;
    }
}
