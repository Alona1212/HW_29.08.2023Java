//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//        Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//        Например:
//        ввод - mama, papa
//        вывод - mapa

import java.util.Scanner;

public class HW_2908 {
    public static void main(String[] args) {
        combineNames();
    }
public static void combineNames(){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Enter your first word: ");
    String first = scanner.nextLine();
    System.out.println("Enter your second word: ");
    String second = scanner.nextLine();
    String firstHalf = first.substring(0,first.length()/2);
    String secondHalf = second.substring (second.length()/2);
    System.out.println(firstHalf+secondHalf);
    }
}
