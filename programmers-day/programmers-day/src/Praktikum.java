import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println("12.09." + year);
            // здесь нужно вывести результат
        } else {
            System.out.println("13.09." + year);
        }
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {// здесь нужно определить, является ли переданный год високосным
            return true;
        }  else {
            return false;
        }
    }
}
/*На вход программа должна получать номер года, а на выходе выводить дату праздника в формате дд.мм.гггг.
Например, ввод: 2000, вывод: 12.09.2000.
Информационная справка:
не високосный год он выпадает на 13 сентября, в високосный — на 12 сентября.
Порядок определения високосного года:
годы, номер которых кратен 4, — високосные;
год, номер которого кратен 400, — високосный;
остальные годы, номер которых кратен 100, — не високосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300).

 */