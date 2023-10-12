package homework6;

import java.util.Arrays;

public class Homework6 {
    public static void main(String[] args) {
        //Задача #1
        //Дана строка, содержащая только буквы и цифры. Вывести информацию о том, является ли данная трока палиндромом.
        String myString = "12anna21";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String rev = buffer.toString();
        if(myString.equals(rev)){
            System.out.println("Строка является палиндром");
        }else{
            System.out.println("Строка не является палиндромом");
        }

//        Задача #2
//        Даны две строки, строки, содержащие только буквы английского алфавита. Вывести информацию о том,
//        являются ли одна строка анаграммой другой строки.
        String s1 ="abba";
        String s2 ="baba";
        if (s1.length()!=s2.length()){
            System.out.println("Строка " + s2 + " не является анаграммой строки " + s1);
        }
        else {
            char[] s1char = s1.toCharArray();
            char[] s2char = s2.toCharArray();
            Arrays.sort(s1char);
            Arrays.sort(s2char);
            String s1sort = new String(s1char);
            String s2sort = new String(s2char);
            if (s1sort.equals(s2sort)){
                System.out.println("Строка " + s2 + " является анаграммой строки " + s1);
            } else System.out.println("Строка " + s2 + " не является анаграммой строки " + s1);
        }
    }
}
