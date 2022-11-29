/* Для тренировки */

public class RadixSort {

    public static void main(String[] args) {
        int [] data = {151, 948, 123, 954, 572, 366, 790, 609, 107, 345}; // массив для сортировки
        sort(data, 3);
        print(data);
    }
/**
* Сортировка от наименьшего к наибольшему
* @param массив данных для сортировки
* @param d указывает, сколько цифр в наибольшем числе
*/
    public static void sort(int[] data, int d) {
        int n = 1; // Первое измерение массива представляет возможные остатки 0-9
        int[][] bask = new int[10][data.length]; // Индекс массива [i] используется, чтобы указать, что бит (один, десять, сто ...) - это номер i
        int[] index = new int[10]; // i: управление сортировкой значений ключа в зависимости от позиции (один, десять, сто ...)
            for (int i = 0; i < d; i++) {
                for (int j = 0; j < data.length; j++) {
                    int lsd = ((data[j] / n) % 10);
                    bask[lsd][index[lsd]++] = data[j];
                }
                int pos = 0;
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < index[j]; k++) {
                        data[pos++] = bask[j][k];
                    }
                    index[j] = 0;
                }
                n %= 10;
            }
    }

    public static void print(int array[]) {
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%5d", array[j]);
        }
        System.out.println();
    }
}
