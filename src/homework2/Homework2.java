package homework2;

public class Homework2{
    public static void main(String[] args) {
        //1. объявите переменные для хранения информации об общем количестве писем и о количестве отправленных писем.
        // Присвойте значения этим переменным. Выведите в консоль, сколько писем осталось отправить.
        int numberOfLetters = 800;
        int sentLetters = 350;
        int unsentLetters = numberOfLetters-sentLetters;
        System.out.println(unsentLetters);

        //2. Объявить и инициализировать переменные для хранения времени (в часах) и расстояния (в километрах).
        // Найти и вывести в консоль скорость, выраженную в метрах в секунду.
        int timeInHours = 2;
        int distanceInKilometers = 120;
        double speedInKilometersPerHour =(double) distanceInKilometers/timeInHours;
        double speedInMetersPerSecond = speedInKilometersPerHour*1000.0/3600.0;
        System.out.println(speedInMetersPerSecond);

        //3. Найти сумму цифр целого положительного двузначного числа. Результат вывести в консоль.
        int numbers = 54;
        int sumOfNumbers= numbers%10 + numbers/10;
        System.out.println(sumOfNumbers);

        //4. Поменять значения 2х переменных местами, используя арифметические операторы. Результат вывести в консоль
        int one = 20, two=24;
        one = one+two;
        two = one - two;
        one = one - two;
        System.out.println(one);
        System.out.println(two);
    }
}
