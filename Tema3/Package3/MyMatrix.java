package Package3;

public class MyMatrix {
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] ints : matriz) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
