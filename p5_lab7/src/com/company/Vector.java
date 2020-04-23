package com.company;

import java.util.Scanner;

public class Vector {
    public int [] v = new int[50];
    public int n;

    public void ordineInversa()
    {
        System.out.println("Introduceti numarul de elemente ale vectorului: ");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print("v[" + i + "]= ");
            v[i] = scanner.nextInt();
        }
        System.out.println("Elementele vectorului in ordine inversa sunt: ");
        afisare(n-1,v);
    }
    public void afisare(int n, int [] v)
    {
        if(n>=0)
        {
            System.out.print(v[n]+ "  ");
            afisare(n-1,v);
        }
    }
}
