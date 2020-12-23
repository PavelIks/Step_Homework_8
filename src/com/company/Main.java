package com.company;

import java.util.Scanner;

public class Main
{
    interface MyLamda1
    {
        int l_1(int a1);
    }
    public static void main(String[] args)
    {
        MyLamda1 mylamda1;
        mylamda1 = (a1) -> a1;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Введите год: ");
        int a1 = in1.nextInt();
        if (a1 % 4 == 0)
        {
            if ((a1 % 100 != 0) || (a1 % 400 == 0))
            {
                System.out.print(mylamda1.l_1(a1));
                System.out.println(" - высокосный!");
            }
            else
            {
                System.out.print(mylamda1.l_1(a1));
                System.out.println(" - не високосный!");
            }
        }
        else
        {
            System.out.print(mylamda1.l_1(a1));
            System.out.println(" - не високосный!");
        }
    }
}