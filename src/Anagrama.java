import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        String word = "casa";
        String[] afterWord = new String[word.length()]; // pra deixar o tamanho igual
        String[] wordJoin = word.split("");
        String reversed = "";

        for (int i = 0; i < word.length(); i++) {
            afterWord[i] = wordJoin[word.length() - i - 1];


        }
        System.out.println(String.join("", afterWord));

        //orrrr
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);

        }
        System.out.println(reversed);

    }
}
