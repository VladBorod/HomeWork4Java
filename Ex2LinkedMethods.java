
import java.util.LinkedList;
import java.util.Scanner;

//Реализуйте очередь с помощью LinkedList со следующими методами:
//        • enqueue() — помещает элемент в конец очереди,
//        • dequeue() — возвращает первый элемент из очереди и удаляет его,
//        • first() — возвращает первый элемент из очереди, не удаляя.
//Импорт функций.

    //Создание класса.
public class Ex2LinkedMethods {
        //Создание main.
    public static void main(String[] args) {
//Создание переменной для ввода.
        String input;
//Создание связанного списка и его размера.
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.printf("Введите размер списка: ");
        int range = in.nextInt();
//Ввод данных в список.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы списка, каждый с новой строки: ");
        while (0 < range) {
            input = sc.nextLine();
            linkedList.add(input);
            range--;
        }
//      Варианты действий.
        Scanner go = new Scanner(System.in);
        System.out.println("Выберите действие со связанным списком: \n" +
                    "1. Поместить элемент в конец очереди. \n" +
                    "2. Вернуть первый элемент из очереди и удалить его. \n" +
                    "3. Вернуть первый элемент из очереди не удаляя его. \n" +
                    "4. Вывести список. \n");
//      Инициализация вариантов действий.
        int operation = 0;
        while (operation >= 0 && operation < 5) {
        operation = go.nextInt();
            switch (operation) {
                case 1:
                    System.out.printf("Ваш список: " + String.valueOf(putInEnd(linkedList)) + "\n" + ("Выберите действие со связанным списком: \n" +
                            "1. Поместить элемент в конец очереди. \n" +
                            "2. Вернуть первый элемент из очереди и удалить его. \n" +
                            "3. Вернуть первый элемент из очереди не удаляя его. \n" +
                            "4. Вывести список. \n"));
                    break;
                case 2:
                    System.out.printf("Удаленный первый элемент: " + returnDeleteFirst(linkedList) + "\n" + "Cписок:" + (linkedList) + "\n" + ("Выберите действие со связанным списком: \n" +
                            "1. Поместить элемент в конец очереди. \n" +
                            "2. Вернуть первый элемент из очереди и удалить его. \n" +
                            "3. Вернуть первый элемент из очереди не удаляя его. \n" +
                            "4. Вывести список. \n"));
                    break;
                case 3:
                    System.out.printf("Первый элемент: " + returnFirst(linkedList) + "\n" + "Cписок:" + (linkedList) + "\n" + ("Выберите действие со связанным списком: \n" +
                            "1. Поместить элемент в конец очереди. \n" +
                            "2. Вернуть первый элемент из очереди и удалить его. \n" +
                            "3. Вернуть первый элемент из очереди не удаляя его. \n" +
                            "4. Вывести список. \n"));
                    break;
                case 4:
                    System.out.printf("Ваш список: " + linkedList + "\n" + ("Выберите действие со связанным списком: \n" +
                            "1. Поместить элемент в конец очереди. \n" +
                            "2. Вернуть первый элемент из очереди и удалить его. \n" +
                            "3. Вернуть первый элемент из очереди не удаляя его. \n" +
                            "4. Вывести список. \n"));
                    break;
                default:
                    System.out.println("Такой функции не предусмотрено, работа программы завершена.");
                    break;
            }
        }
//      Экономим память.
        in.close();
        sc.close();
        go.close();
    }
//      Метод добавления элемента в конец.
    public static LinkedList<String> putInEnd(LinkedList<String> list){
        Scanner pin = new Scanner(System.in);
        System.out.println("Введите новый элемент: \n");
        String newElement = pin.next();

        list.addLast(newElement);
        return list;
    }
//      Метод вывода и удаления первого элемента.
    public static String returnDeleteFirst(LinkedList<String> list) {
        String firstElement;
        if (list.size() > 0) {
            firstElement = list.pop();
        } else {
            firstElement = "Список пуст";
        }
        return firstElement;
    }
//      Метод вывода первого элемента без удаления.
    public static String returnFirst(LinkedList<String> list){
        String firstElement;
        if (list.size() > 0){
            firstElement = list.getFirst();
        }
        else {
            firstElement = "Список пуст!";
        }
        return firstElement;
    }
}


