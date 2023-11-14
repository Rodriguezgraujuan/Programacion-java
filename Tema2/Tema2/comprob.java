package Tema2;

public class comprob {
    static int[] grade = new int [10];

    public static void arrayprin (){
        for (int j : grade) {
            System.out.println(j);
        }
    }
   public static void main(String[] args) {
        grade = new int[]{0,2,4,6,8,10,12,14,16,18};
        int num = 0;
        for (int i=1; i<10; i++){
            grade[i] = num += 3;
        }
        arrayprin();
    }
}
