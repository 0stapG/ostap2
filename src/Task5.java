import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Виводимо текстове меню
        System.out.println("Меню:");
        System.out.println("1. Обчислити добуток двох чисел");
        System.out.println("2. Обчислити суму двох чисел");
        System.out.println("3. Обчислити різницю двох чисел");

        // Зчитуємо вибір користувача
        System.out.print("Виберіть пункт меню: ");
        int choice = scanner.nextInt();

        // Зчитуємо два числа від користувача
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();

        // Обробляємо вибір користувача і виводимо результат
        switch (choice) {
            case 1:
                double product = num1 * num2;
                System.out.println("Добуток " + num1 + " і " + num2 + " дорівнює " + product);
                break;
            case 2:
                double sum = num1 + num2;
                System.out.println("Сума " + num1 + " і " + num2 + " дорівнює " + sum);
                break;
            case 3:
                double difference = num1 - num2;
                System.out.println("Різниця " + num1 + " і " + num2 + " дорівнює " + difference);
                break;
            default:
                System.out.println("Невірний вибір!");
        }

        // Закриваємо Scanner
        scanner.close();
    }
}
