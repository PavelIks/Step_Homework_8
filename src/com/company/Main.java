package com.company;
import java.util.Scanner;

public class Main
{
    interface MyLamda1
    {
        int l_1(int intTest1);
    }
    public static void main(String[] args)
    {
        /*Домашнее задание*/

        /*Задание 1 Создайте и вызовите следующие лямбда-выражения:
        1) Проверка является ли год високосным;
        2) Подсчет количества дней между двумя датами;
        3) Подсчёт количества полных недель между двумя датами;
        4) Подсчёт дня недели по полученной дате. Например, 20 июля 1969 года — воскресенье.*/

        /*MyLamda1 mylamda1;
        mylamda1 = (intTest1) -> intTest1;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите год: ");
        int intTest1 = in1.nextInt();
        if (intTest1 % 4 == 0)
        {
            if ((intTest1 % 100 != 0) || (intTest1 % 400 == 0))
            {
                System.out.print(mylamda1.l_1(intTest1));
                System.out.println(" - высокосный!");
            }
            else
            {
                System.out.print(mylamda1.l_1(intTest1));
                System.out.println(" - не високосный!");
            }
        }
        else
        {
            System.out.print(mylamda1.l_1(intTest1));
            System.out.println(" - не високосный!");
        }*/

        MyLamda1 mylamda1;
        MyLamda1 mylamda2;
        MyLamda1 mylamda3;
        MyLamda1 mylamda4;
        MyLamda1 mylamda5;
        MyLamda1 mylamda6;
        mylamda1 = (w_day_1) -> w_day_1;
        mylamda2 = (w_month_1) -> w_month_1;
        mylamda3 = (w_year_1) -> w_year_1;
        mylamda4 = (w_day_2) -> w_day_2;
        mylamda5 = (w_month_2) -> w_month_2;
        mylamda6 = (w_year_2) -> w_year_2;

        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите 1-ю дату - день: ");
        int w_day_1 = in1.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите 1-ю дату - месяц: ");
        int w_month_1 = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.print("Введите 1-ю дату - год: ");
        int w_year_1 = in3.nextInt();

        Scanner in4 = new Scanner(System.in);
        System.out.print("Введите 2-ю дату - день: ");
        int w_day_2 = in4.nextInt();

        Scanner in5 = new Scanner(System.in);
        System.out.print("Введите 2-ю дату - месяц: ");
        int w_month_2 = in5.nextInt();

        Scanner in6 = new Scanner(System.in);
        System.out.print("Введите 2-ю дату - год: ");
        int w_year_2 = in6.nextInt();

        int a1 = mylamda3.l_1(w_year_1) / 4 - mylamda3.l_1(w_year_1) / 100 + mylamda3.l_1(w_year_1) / 400;
        int a2 = mylamda6.l_1(w_year_2) / 4 - mylamda6.l_1(w_year_2) / 100 + mylamda6.l_1(w_year_2) / 400;
        int a = a1 - a2;
        if (mylamda2.l_1(w_month_1) > 12 || mylamda5.l_1(w_month_2) > 12)
        {
            System.out.print("Месяцев менее 12!");
        }
        else if (mylamda2.l_1(w_month_1) == 1 || mylamda5.l_1(w_month_2) == 1)
        {
            int month_1 = 31;
            if (mylamda1.l_1(w_day_1) > month_1 || mylamda4.l_1(w_day_2) > month_1)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = mylamda3.l_1(w_year_1) * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 2 || mylamda5.l_1(w_month_2) == 2)
        {
            int month_2 = 28;
            if (mylamda1.l_1(w_day_1) > month_2 || mylamda4.l_1(w_day_2) > month_2)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 3 || mylamda5.l_1(w_month_2) == 3)
        {
            int month_3 = 31;
            if (mylamda1.l_1(w_day_1) > month_3 || mylamda4.l_1(w_day_2) > month_3)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 4 || mylamda5.l_1(w_month_2) == 4)
        {
            int month_4 = 31;
            if (mylamda1.l_1(w_day_1) > month_4 || mylamda4.l_1(w_day_2) > month_4)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 5 || mylamda5.l_1(w_month_2) == 5)
        {
            int month_5 = 31;
            if (mylamda1.l_1(w_day_1) > month_5 || mylamda4.l_1(w_day_2) > month_5)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 6 || mylamda5.l_1(w_month_2) == 6)
        {
            int month_6 = 30;
            if (mylamda1.l_1(w_day_1) > month_6 || mylamda4.l_1(w_day_2) > month_6)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 7 || mylamda5.l_1(w_month_2) == 7)
        {
            int month_7 = 31;
            if (mylamda1.l_1(w_day_1) > month_7 || mylamda4.l_1(w_day_2) > month_7)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 8 || mylamda5.l_1(w_month_2) == 8)
        {
            int month_8 = 30;
            if (mylamda1.l_1(w_day_1) > month_8 || mylamda4.l_1(w_day_2) > month_8)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 9 || mylamda5.l_1(w_month_2) == 9)
        {
            int month_9 = 31;
            if (mylamda1.l_1(w_day_1) > month_9 || mylamda4.l_1(w_day_2) > month_9)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 10 || mylamda5.l_1(w_month_2) == 10)
        {
            int month_10 = 31;
            if (mylamda1.l_1(w_day_1) > month_10 || mylamda4.l_1(w_day_2) > month_10)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 11 || mylamda5.l_1(w_month_2) == 11)
        {
            int month_11 = 30;
            if (mylamda1.l_1(w_day_1) > month_11 || mylamda4.l_1(w_day_2) > month_11)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
        else if (mylamda2.l_1(w_month_1) == 12 || mylamda5.l_1(w_month_2) == 12)
        {
            int month_12 = 31;
            if (mylamda1.l_1(w_day_1) > month_12 || mylamda4.l_1(w_day_2) > month_12)
            {
                System.out.print("Достигнут лимит дней!");
            }
            else
            {
                w_year_1 = w_year_1 * 365;
                w_year_2 = w_year_2 * 365;
                int date1 = mylamda1.l_1(w_day_1) + w_year_1;
                int date2 = mylamda4.l_1(w_day_2) + w_year_2;
                int date = date1 - date2;
                System.out.print(date + a);
            }
        }
    }
}