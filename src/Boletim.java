
public class Boletim {
    public static void main(String[] args) {
        String name = "Arthur";
        Float[] notas = {5.0f, 10.0f, 8.5f};
        float soma = 0f;

        for (float nota : notas) {
            soma += nota;
        }

        float media = soma/ notas.length;
        System.out.printf(name + " está com a média: %.2f%n", media);
    }
}
