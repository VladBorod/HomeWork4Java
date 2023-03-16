//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёт «перевёрнутый» список.
//Импорт функций.

import java.util.LinkedList;
import java.util.Scanner;

//Создание класса.
public class Ex1FlippedList {
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
        while (0 < range){
            input = sc.nextLine();
            linkedList.add(input);
            range--;
        }
//Экономим память.
        in.close();
        sc.close();
//Вывод введенных данных и перевернутого списка через объявление метода.
        System.out.println(linkedList);
        System.out.println(flipper(linkedList));
    }
//Сам метод.
    public static LinkedList<String> flipper(LinkedList<String> list){
//Создание второго связанного списка и его заполнение в обратной последовательности.
        LinkedList<String> newList = new LinkedList<>();
        while (list.size() > 0){
            newList.add(list.removeLast());
        }
        return newList;
    }
}
