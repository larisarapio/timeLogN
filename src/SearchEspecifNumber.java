public class SearchEspecifNumber {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

            for (int x = 10; x  >=  0; x--) {

                num--;
                sum += x;
                if (num == 0) {
                    System.out.println("achei o zero");
                    break;
                }
                System.out.println(num);

            }
        System.out.println("acabou, soma total = " + sum);

    }
}

