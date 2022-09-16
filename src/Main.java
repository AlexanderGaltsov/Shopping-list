import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> basket = new ArrayList<>();
        List<String> find = new ArrayList<>();
        List<Integer> room = new ArrayList<>();

        while (true) {

            System.out.println();
            System.out.println("Выберите операцию и введите её номер :");
            System.out.println("1. Добавить ");
            System.out.println("2. Показать ");
            System.out.println("3. Удалить ");
            System.out.println("4. Найти ");
            System.out.println("Для выхода из программы введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int x = Integer.parseInt(input);

            switch (x) {
                case 1:
                    System.out.println("Какую покупку хотите добавить ? ");
                    String choice = scanner.nextLine();
                    basket.add(choice);
                    System.out.println("Итого в списке покупок " + basket.size());
                    break;
                case 2:
                    System.out.println("Список покупок : ");
                    for (int i = 0; i < basket.size(); i++) {
                        System.out.println((i + 1) + ". " + basket.get(i));
                    }
                    break;
                case 3:
                    int productNumber;
                    System.out.println("Список покупок : ");
                    for (int i = 0; i < basket.size(); i++) {
                        System.out.println((i + 1) + ". " + basket.get(i));
                    }
                    System.out.println("Какую покупку хотите удалить ? Введите номер или название ");
                    System.out.println();
                    choice = scanner.nextLine();

                    if (new Scanner(choice).hasNextInt()) {
                        productNumber = Integer.parseInt(choice);
                        System.out.println("Покупка \"" + basket.get(productNumber - 1) + "\" удалена, список покупок: ");
                        basket.remove(productNumber - 1);
                        for (int i = 0; i < basket.size(); i++) {
                            System.out.println((i + 1) + ". " + basket.get(i));
                        }
                    } else {
                        System.out.println();
                        System.out.println("Покупка \"" + choice + "\" удалена, список покупок: ");
                        basket.remove(choice);
                        for (int i = 0; i < basket.size(); i++) {
                            System.out.println((i + 1) + ". " + basket.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите текст для поиска: ");
                    choice = scanner.nextLine();
                    int i = 0;
                    for (i = 0; i < basket.size(); i++) {
                        String choiceLower = choice.toLowerCase();
                        String basketLower = basket.get(i).toLowerCase();
                        if (basketLower.contains(choiceLower)) {
                            find.add(basket.get(i));
                            room.add(i + 1);
                        }
                    }
                    System.out.println("Найдено: ");
                    for (int j = 0; j < find.size(); j++) {
                        System.out.println(room.get(j) + " " + find.get(j));
                    }
                    break;
                default:
                    System.out.println("Такой операции нет");
            }
        }
    }
}
