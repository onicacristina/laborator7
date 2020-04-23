package com.company;

import java.util.Scanner;

public class Student {
    String[] arr = new String[100];
    String[] copy = new String[100];
    int n;
    public void permutation(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti numarul de studenti: ");
        n = scanner.nextInt();
        System.out.println("-----------------");
        for(int i=0;i<n;i++)
        {
            System.out.print("Studentul nr#"+(i+1)+": ");
            arr[i]= scanner.next();}
        for(int j=0;j<n/5;j++)
        {
            System.out.println("\nGrupa @ " + (j+1)+" : ");
            System.out.println("-----------------");
            for(int i=0;i<5;i++)
            {
                copy[i]=arr[(j*5)+i];
                System.out.print(copy[i]+ " ");
            }
            System.out.println();
            System.out.println("\nPermutarile pentru grupa @ " + (j+1 )+ ":"+'\n');
            heapPermutation(copy,5,5);


        }}
    void heapPermutation(String a[], int size, int n)
    {
        if (size == 1)
            printArr(a,n);

        for (int i=0; i<size; i++)
        {
            heapPermutation(a, size-1, n);
            if (size % 2 == 1)
            {
                String temp = a[0];
                a[0] = a[size-1];
                a[size-1] = temp;
            }
            else
            {
                String temp = a[i];
                a[i] = a[size-1];
                a[size-1] = temp;
            }
        }
    }

    public void printArr(String[] a, int n)
    {
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
