package ru.otus.julia;

import java.util.Scanner;

public class Dialog {

    public static void main(String[] args) {
        long number;// введенное число

        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Введите сумму, для выхода введите 0: ");
            number = (long) in.nextDouble();
           System.out.println(NumberToText.WordsRus(number));


        } while ( number != 0);

        System.out.println("Работа программы завершена");
    }

}
