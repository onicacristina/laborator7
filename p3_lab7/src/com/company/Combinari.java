package com.company;

import java.util.Scanner;

public class Combinari {

    public void readCharacters()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Combinari de n= ");
        int n = scanner.nextInt();
        System.out.print("Luate cate k= ");
        int m = scanner.nextInt();
        System.out.println("\nIntroduceti caracterele:  ");
        System.out.println("-------------------------");
        char arr[]= new char[100];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Caracterul #" + (i+1) +" : ");
            arr[i] = scanner.next().charAt(0);
        }
        System.out.println("\nCombinarile de "+n+" luate cate " +m +" sunt :");
        printCombination(arr, n, m);
    }

    public void printCombination(char arr[], int n, int r)
    {
        char data[]=new char[r];
        combinationUtil(arr, data, 0, n - 1, 0, r);
    }

    public void combinationUtil(char arr[], char data[], int start, int end, int index, int r)
    {
        if(index == r)
        {
            for(int j = 0; j < r; j++)
                System.out.print( data[j] +" ");
            System.out.println();
            return;
        }
        for(int i = start; i <= end && end - i + 1 >= r - index; i++)
        {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }
}