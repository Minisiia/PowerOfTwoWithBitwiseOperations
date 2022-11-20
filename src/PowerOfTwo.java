import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число");
        int number = scanner.nextInt();
        if ((number > 0) && (number & (number - 1)) == 0) System.out.println("Вказане число є ступенем двійки");
        else System.out.println("Вказане число не є ступенем двійки");
        // рішення базується на тому, що число у бінарному вигляді, що передує числа, що є ступенем двійки,
        // складається з одиниць у всіх бітах, що йдуть до біта, де є одиниця у числа, що є ступенем двійки
        // результат побітового І цих 2х чисел буде дорівнювати 0
        // 0000 1000        - 8
        // 0000 0111        - 7
        // 0000 0000        - 0 результат побітового І
    }
}
