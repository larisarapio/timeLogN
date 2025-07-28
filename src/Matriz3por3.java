public class Matriz3por3 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz 3x3: ");
        for (int row = 0; row < matriz.length; row++) {
            for (int col = 0; col < matriz[row].length; col++) {
                System.out.print(matriz[row][col] + " ");
            }
            System.out.println();
        }

    }
}
