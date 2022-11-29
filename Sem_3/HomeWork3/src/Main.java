/* Создать метод, который принимает массив int и сортирует
его по последней цифре. Используйте метод Arrays.sort.
для его работы создайте свой компаратор. 
Имеется в виду последняя цифра в записи числа, например в числе 123,
последння цифра 3. Надо сделать сортировку, которая учитывает только эту последнюю цифру в числе.
*/


import java.util.*;

public class Main {
    public static class MyArray implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
           if (a % 10 == b % 10) return a - b;
           else return a % 10 - b % 10;
        }
    }

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Введите желаемое количество трехзначных чисел");
        int n = con.nextInt();
        Integer m[] = new Integer[n];
        for(int i = 0; i < n; i++) m[i] = con.nextInt();

        Arrays.sort(m, new MyArray());

        for(int i = 0; i < n; i++) System.out.print(m[i] + " ");
        System.out.println();
        con.close();
    }
}

