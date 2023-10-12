package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //Задача #1
        //Объявить массив целых чисел. Длина массива - 15. Заполнить массив четными числами в диапазоне [10, 100). Для заполнения массива использовать цикл.
        int[] arr = new int[15];
        int min = 10;
        int max =100;
        int range=max-min+1;

        for (int i = 0; i < arr.length; i++) {
            while (true){
                int randomNumber = (int)(Math.random() * range) + min;
                if (randomNumber%2==0){
                    arr[i]=randomNumber;
                    break;
                } else continue;
            }
            System.out.println(arr[i]);
        }

        //Задача #2
        //Создать два массива целых чисел на 5 элементов каждый. Массивы необходимо заполнять значениями в цикле. Значения вводит пользователь с клавиатуры.
        //
        //Если число отрицательное, добавить его в первый массив.
        //Если число положительное, добавить его во второй массив.
        //Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0
        int[] positiveNumber = new int[5];
        int[] negativeNumber = new int[5];
        int indPositive=0;
        int indNegative=0;
        Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number==0) break;
                if (indPositive==5 & indNegative==5) break;
                else if (number>0) {
                    if (indPositive==5) {
                        continue;
                    }
                      else {
                        positiveNumber[indPositive] = number;
                        indPositive++;
                    }

                } else if (number<0){
                    if (indNegative==5){
                        continue;
                    } else {
                        negativeNumber[indNegative] = number;
                        indNegative++;
                    }
                }
            }
            System.out.println(Arrays.toString(positiveNumber));
            System.out.println(Arrays.toString(negativeNumber));
            scanner.next();

        //Задача #3
        //Заполните массив на len элементов (размер массива вводит пользователь) случайным целыми числами 
        // и выведете максимальное, минимальное и среднее арифметическое значение элементов массива.
        
        int len = scanner.nextInt();
        int[] arr3 =new int[len];
        for (int i = 0; i < len; i++) {
            arr3[i]=(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr3));
        int maxNum=arr3[0];
        int minNum=arr3[0];
        int count=0;
        int sum=0;
        for (int searchMax: arr3) {
            if (searchMax>maxNum) maxNum=searchMax;
        }
        for (int searchMin: arr3) {
            if (searchMin<minNum) minNum=searchMin;
        }
        for (int average: arr3) {
            sum+=average;
            count++;
        }
        System.out.println(maxNum);
        System.out.println(minNum);
        System.out.println(sum/count);

        
    }
}
