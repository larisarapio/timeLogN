public class Carrinho {

    public static void main(String[] args) {
        Float[] products = {20.0f, 30.0f, 40.0f, 10.0f};
        float sum = 0.0f;
        float total = 0.0f;

        for (Float product : products) {
            sum += product;
        }

        total = sum * 0.50f;
        System.out.print("O total com desconto ficou: " + total);



    }
}
