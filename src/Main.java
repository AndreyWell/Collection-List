import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Выберите номер операции:");
            System.out.println("1 Добавить");
            System.out.println("2 Показать");
            System.out.println("3 Удалить");

            String input = in.nextLine();

            if (input.equals("end")) {
                break;
            }

            if (Integer.parseInt(input) == 1) {
                System.out.println("Какую покупку хотите добавить?");
                String buy = in.nextLine();
                list.add(buy);
                System.out.println("Итого в списке покупок: " + list.size());
                System.out.println();
            } else if (Integer.parseInt(input) == 2) {
                if (list.isEmpty()) {
                    System.out.println("Список покупок пуст");
                    System.out.println();
                } else {
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                }
            } else if (Integer.parseInt(input) == 3) {
                if (list.isEmpty()) {
                    System.out.println("Список покупок пуст");
                    System.out.println();
                    continue;
                } else {
                    System.out.println("Список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                    System.out.println();
                }
                System.out.println("Какую хотите удалить? Введите номер или название");
                String delete = in.nextLine();
                try {
                    if (Integer.parseInt(delete) - 1 <= list.size()) {
                        String item = list.get(Integer.parseInt(delete) - 1);
                        list.remove(Integer.parseInt(delete) - 1);
                        System.out.println();
                        if (list.isEmpty()) {
                            System.out.println("Список покупок пуст");
                            System.out.println();
                            continue;
                        }
                        System.out.println("Покупка \"" + item + "\" удалена, список покупок:");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println((i + 1) + ". " + list.get(i));
                            System.out.println();
                        }
                    }
                } catch (NumberFormatException exception) {
                    String deletedItem = delete;
                    list.remove(delete);
                    System.out.println("Покупка \"" + deletedItem + "\" удалена, список покупок:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                        System.out.println();
                    }
                }
            }
        }
    }
}
