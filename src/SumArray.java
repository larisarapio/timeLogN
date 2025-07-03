public class SumArray  {
    public static void main(String[] args) {
        //int[] num = new int[4];
        int[] num = {5, 10, 15};
        int sum = 0;

        for (int x = 0; x < num.length; x++) {

            System.out.println("Número: "+num[x]);
            //sum += x;
            sum += num[x];

            System.out.println("Total no momento: "+sum);

        }

        System.out.println("Total no final: "+sum);


    }
}