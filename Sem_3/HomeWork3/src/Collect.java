/*Создайте класс, который представляет из себя коллекцию, 
добавьте 2 метода add и get для работы с коллекцией. 
Реализуйте возможность использования цикла for-each для работы
с данной коллекцией. Для этого реализуйте интерфейс Iterable и создайте итератор*/

import java.util.*;

class Collect {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();
        users.add("Виктор");
        users.add("Иван");
        users.add("Борис");
        users.add("Евгений");

        // Перебор всех элементов коллекции
        ListIterator<String> listIter = users.listIterator();
        System.out.print("Перебор всех элементов коллекции:");
        // Цикл продолжается, пока не достигнут конец коллекции и есть следующий элемент
        while (listIter.hasNext()) {
            System.out.printf(" %s", listIter.next()); // получим текущий элемент и перейдем к следующему
        }

        // изменим текущий элемент (сейчас это Евгений)
        System.out.println("\nИзменить текущий элемент: Евгений <- Дмитрий");
        listIter.set("Дмитрий");

        // Перебор всех элементов коллекции в обратном порядке
        System.out.print("Перебор всех элементов в обратном порядке:");
        while (listIter.hasPrevious()) {
            System.out.printf(" %s", listIter.previous()); // получим текущий элемент и перейдем к предыдущему
        }
    }
}
