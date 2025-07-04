public class WordForLinha {
    public static void main(String[] args) {

        String word = "dedicação";

        System.out.println("Palavras separadas uma letra por linha na ordem certa.");
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i));
        }

        System.out.println("Palavras separadas uma letra por linha na ordem contrária.");

        String wordLeft = new StringBuilder(word).reverse().toString();

        for(int i = 0; i < word.length(); i++){
            System.out.println(wordLeft.charAt(i));
        }




    }
}