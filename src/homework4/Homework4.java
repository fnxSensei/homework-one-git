package homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
//        //Задача на FOR
//        //Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд
        for (int i =2; i<21; i+=2) {
            System.out.println(i);
        }
//
//        Задача на WHILE
//        Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите положительные целые числа");
        int userInput;
        int sum=0;
        while (scanner.hasNextInt() && ((userInput=scanner.nextInt())>0)) {
            sum+=userInput;
        }
        scanner.next();
        System.out.println(sum);

        //Задача на использование любого цикла (выберите сами)
        //Программа загадывает число в диапазоне [1;9]
        //Пользователь вводит число с клавиатуры
        //Программа в зависимости от введенного числа выводит в консоль следующее:
        //"загаданное число больше"
        //"загаданное число меньше"
        //"Вы угадали" (программа завершает работу)
        //Если введен 0, вывести "выход из программы" (программа завершает работу)

        int random = (int) (Math.random()*8) +1;
        int userInput2=0;
        System.out.println("Загадано число в диапозоне [1;9] угадайте его");
        while (scanner.hasNextInt()) {
            userInput2 = scanner.nextInt();
            if (userInput2 == 0) {
                break;
            } else if (userInput2 < random) {
                System.out.println("Загаданное число больше");
            } else if (userInput2 > random) {
                System.out.println("Загаданное число меньше");
            } else if (userInput2 == random) {
                System.out.println("Вы угадали!");
                break;
            }
        }
        scanner.next();

        //Задача на использование любого цикла (выберите сами)
        //Пользователь загадывает число в диапазоне от [1 до 100].
        //Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
        //Программа пытается его угадать (вместо обычного перебора постарайтесь
        //использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
        //Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и, в зависимости от ответа пользователя, принимать решения.
        //Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
        //Для вывода текста и значения переменной используйте оператор сложения, например System.out.println("Число равно " + number);
        //
        //середина отрезка: a = 1, b = 100; mid = (a + b) / 2;
        int min = 1;
        int max=100;
        int answer;
        System.out.println("Загадайте число в диапозоне от 1 до 100");
        while (true){
            int middle = (min+max)/2;
            System.out.println("Число равно " + middle + "?");
            answer=scanner.nextInt();
            if  (answer==0) {
                System.out.println("Число больше " + middle + "?");
                answer=scanner.nextInt();
                if (answer==0){
                    max=middle-1;
                    //continue;
                } else if  (answer==1) {
                    min = middle+1;
                    //continue;
                }
            }
            else if (answer==1) {
                System.out.println("Ваше число " + middle);
                break;
            }

        }
        scanner.close();
    }
}
