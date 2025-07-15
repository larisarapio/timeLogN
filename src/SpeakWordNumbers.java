public class SpeakWordNumbers {
    public static void main(String[] args) {
        String[] names = new String[]{"Larissa", "Arthur", "Joana", "Ana", "Wellington"};
        int count = 0;

        System.out.println("Nomes com mais de 6 letras:");
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() >= 6) {
                count ++;
                System.out.println(names[i]);

            }
        }
        System.out.println("No total há " + count + " nomes");
    }
}
