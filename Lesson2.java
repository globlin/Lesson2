import java.util.Arrays;

public class Lesson2 {
//    public static void main(String[] args) {
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
// public static void main(String args[]) {
//     int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
//     for (int i = 0; i < arr.length; i++) {
//         if (arr[i] == 1) arr[i] = 0;
//         else arr[i] = 1;
//     }
//     System.out.println(Arrays.toString(arr));
// }
//     2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//    public static void main(String args[]) {
//        int[] array = new int[8];
//        int j = 0;
//        for (int i = 0; i < array.length; ++i, j = j + 3) {
//            array[i] = j;
//            System.out.print(+array[i] + " ");
//        }
//        }
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2;
//    public static void main(String args[]) {
//        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 6)
//                array[i] = array[i] * 2;
//        }
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.print(+array[i] + ", ");
//
//        }
//    }
//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;


    public static void main(String args[]) {
        int N = 4;
        int[][] arr = new int[N][N];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j || i + j == N - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}