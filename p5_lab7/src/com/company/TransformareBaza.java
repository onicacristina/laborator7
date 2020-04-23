package com.company;

import java.util.Scanner;

public class TransformareBaza {
    public int baza;
    public int numar;
    public void transformareBaza()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar in baza 10: ");
        numar = scanner.nextInt();
        System.out.println("Introduceti baza in care doriti sa convertiti numarul: ");
        baza = scanner.nextInt();

        System.out.println("Numarul " + numar + " scris in baza " +baza + " este: ");
        conversie(numar,baza);
    }
    public void conversie(int numar,int baza)
    {
        if(numar!=0)
        {
            conversie(numar/baza,baza);
            System.out.print(numar%baza);
        }
    }
}
