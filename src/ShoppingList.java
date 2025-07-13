import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {

    public static void thingsPay(List<String> list) {
        System.out.println("Seus itens comprados:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja comprar quantas coisas?");
        int q = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            System.out.println("Item " +i+":");
            String item = sc.next();
            list.add(item);
        }

        System.out.println("Deseja remover algo? Digite 1 - Sim ou 2 - Não");
        int remov = sc.nextInt();

        if (remov == 1) {
            System.out.println("Quantos itens deseja remover?");
            int qtRemove = sc.nextInt();

            thingsPay(list);

            for (int i = 0; i < qtRemove; i++) {
                System.out.println("Qual item deseja remover? Digite o número");
                int removerIndex  = sc.nextInt();

                if (removerIndex >= 0 && removerIndex < list.size()) {
                    list.remove(removerIndex);
                    System.out.println("Item removido com sucesso.");
                } else {
                    System.out.println("Índice inválido.");
                }

            }

        }

        thingsPay(list);
        sc.close();

    }
}
