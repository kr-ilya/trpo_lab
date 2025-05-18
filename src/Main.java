import java.util.Scanner;
import lib.hmap.MiniHashMap;

public class Main {
    public static void main(String[] args) {
        MiniHashMap<Integer, String> map = new MiniHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Добавить или изменить значение по ключу");
            System.out.println("2. Получить значение по ключу");
            System.out.println("3. Удалить значение по ключу");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите ключ: ");
                    int keyToPut = scanner.nextInt();
                    System.out.print("Введите значение: ");
                    scanner.nextLine();
                    String value = scanner.nextLine();
                    map.put(keyToPut, value);
                    System.out.println("Значение сохранено.");
                    break;

                case 2:
                    System.out.print("Введите ключ: ");
                    int keyToGet = scanner.nextInt();
                    String result = map.get(keyToGet);
                    if (result != null) {
                        System.out.println("Значение: " + result);
                    } else {
                        System.out.println("Ключ не найден.");
                    }
                    break;

                case 3:
                    System.out.print("Введите ключ: ");
                    int keyToRemove = scanner.nextInt();
                    map.remove(keyToRemove);
                    System.out.println("Удаление выполнено.");
                    break;

                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
        
    }
}