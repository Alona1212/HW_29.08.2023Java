//Реализовать программу, выводящую на экран результаты:
//        Сложения двух чисел
//        Вычитания двух чисел
//        Умножения двух чисел
//        Деления двух чисел
//        Каждая из арифметических операций должна быть реализована как отдельный метод.
import java.util.Scanner;
public class HW_2908_2 {
    public static void main(String[] args) {
        add();
    }
    public static void add(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter your second number: ");
        int second = scanner.nextInt();

        System.out.println(first+second);
        System.out.println(first-second);
        System.out.println(first*second);
        System.out.println(first/second);

    }
}
