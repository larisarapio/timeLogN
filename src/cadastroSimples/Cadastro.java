package cadastroSimples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jack");

        System.out.println("Deseja (1) excluir (2) buscar ou (3) adicionar nome da lista? ");
        int option = sc.nextInt();

        if (option == 1){
            listaNames(names);
            System.out.println("Digite o número do nome que deseja excluir: ");
            int removeName = sc.nextInt();
            names.remove(removeName);
            System.out.println("Nova lista!");
            listaNames(names);

        } else if(option == 2){
            listaNames(names);
            System.out.println("Digite o número do nome que deseja buscar indivualmente: ");
            int searchName = sc.nextInt();
            System.out.println(names.get(searchName));


        } else if(option == 3){
            System.out.println("Qual nome deseja adicionar na lista? ");
            String name = sc.next();
            names.add(name);
            System.out.println("Nova lista!");
            listaNames(names);

        } else {
            System.out.println("Opcao invalida");
        }

        sc.close();


    }

    public static void listaNames (List<String> lista ){
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }
}
